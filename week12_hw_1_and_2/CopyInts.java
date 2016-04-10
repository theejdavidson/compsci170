import java.util.*;
import java.io.*;

public class CopyInts // in CopyFile.java in the Sakai Week 12 Source Code folder
{
	public static void main(String[] args) // uses program command line arguments
	{
		if (args.length != 1) {
			System.out.println("Usage: CopyFile inputFile outputFile");
			System.exit(0);
		}
		Scanner scanner = IO.inFile(args[0]); // read the input file into an array
		if (scanner == IO.inError) {
			System.out.println("Error: could not read input file " + args[0]);
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
				System.out.println(currentNum);
				previousNum=currentNum;
			}
		}
	}
}