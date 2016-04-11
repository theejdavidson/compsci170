import java.util.*;
import java.io.*;

public class CopyInts // in CopyFile.java in the Sakai Week 12 Source Code folder
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

		List<Integer> num = new ArrayList<Integer>();
		while(scanner.hasNext())
		{
			int currentNum = Integer.parseInt(scanner.nextLine());
			num.add(currentNum);
		}
		scanner.close();
		Collections.sort(num);
		System.out.println(num);
		Integer previousNum = null;
		for(Integer currentNum: num)
		{
			if(previousNum==null || previousNum.compareTo(currentNum) != 0)
			{
				outStream.println(currentNum);
				previousNum = currentNum;
			}
		}
		outStream.close();
	}
}