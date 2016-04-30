import java.util.*;
import java.io.*;

public class FormatText // in CopyFile.java in the Sakai Week 12 Source Code folder
{
	public static boolean isWhiteSpace(char c)
	{
		return c == ' ' || c == '\t' || c == '\n';
	}
	public static boolean isPunctuation(char c)
	{
		return c == '.' || c == '?' || c == '!';
	}
	public static void main(String[] args) // uses program command line arguments
	{
		if (args.length != 2) {
			System.out.println("Usage: CopyFile inputFile outputFile");
			System.exit(0);
		}
		Scanner scanner = IO.inFile(args[0]); // read the input file into an array
		if (scanner == IO.inError) {
			System.out.println("Error: could not read input file " + args[0]);
			System.exit(0);
		}
		PrintStream outStream = IO.newFile(args[1]); // assure output doesn’t exist yet
		 if (outStream == IO.outError) {
			System.out.println("Error: could not create output file " + args[1]);
			System.exit(0);
		}
		List<String> lines = new ArrayList<String>();
		while(scanner.hasNext())
		{
			lines.add(scanner.nextLine());
		}
		scanner.close();
		System.out.println(String.format("File has %s has %d lines ", args[0], lines.size()));
		boolean currentIsWhiteSpace = false;
		boolean prevWasWhiteSpace = false;
		boolean punctMode = true;
		for (int i=0; i<lines.size();i++)
		{
			if(i > 0 && prevWasWhiteSpace == false)
			{
				outStream.print('\n');
			}
			String currentLine = lines.get(i);
			char [] charArray = currentLine.toCharArray();
			
			char firstWhiteSpace = ' ';
			
			for(char c: charArray)
			{	
				currentIsWhiteSpace = isWhiteSpace(c);
				boolean shouldPrint = (currentIsWhiteSpace == false) || 
				(currentIsWhiteSpace == true && prevWasWhiteSpace == false);					
				if(shouldPrint)
				{
					if(punctMode && currentIsWhiteSpace == false && !isPunctuation(c))
					{
						if(prevWasWhiteSpace == false)
						{
							outStream.print(' ');
						}
						outStream.print(Character.toUpperCase(c));
						punctMode = false;
						//System.err.println("\n\n leaving punct mode on :" +c);
					}
					else
					{
						/// punctMode may be false - but we may want to set it
						if(!punctMode) {
							punctMode = isPunctuation(c);
							outStream.print(c);
						}
					}
				}
				prevWasWhiteSpace = currentIsWhiteSpace;
				
			}
		}
		outStream.close();
	}
}