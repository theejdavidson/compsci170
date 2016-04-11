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
		PrintStream outStream = IO.newFile(args[1]); // assure output doesn’t exist yet
		 if (outStream == IO.outError) {
			System.out.println("Error: could not create output file " + args[1]);
			System.exit(0);
		}
		int[] numbers = IO.readAllInts(args[0]);
		if(numbers == null || numbers.length == 0)
		{
			System.out.println("No numbers found in file "+ args[0]);
			System.exit(0);
		}
		
		Arrays.sort(numbers);
		Integer previousNum = null;
		for(Integer currentNum: numbers)
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