import java.util.*;
import java.io.*;

public class FormatText // in CopyFile.java in the Sakai Week 12 Source Code folder
{
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
		List<String> words = new ArrayList<String>();
		while(scanner.hasNext())
		{
			words.add(scanner.next());
		}
		scanner.close();
			System.out.println(String.format("File has %s has %d words ", args[0], words.size()));

		for (int i=0; i<words.size();i+=2)
		{
			boolean isEven = false;
			if((i%2) == 0)
			{
				isEven = true;
			}
			if(words.size()>(i+1))
			{
				outStream.println(String.format("%s %s", words.get(i), words.get(i+1)));
			}
			else
			{
				outStream.println(String.format("No last name for %s", words.get(i)));
			}
		}
		outStream.close();
	}
}