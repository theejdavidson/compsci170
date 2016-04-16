import java.util.*;
import java.io.*;
public class RemoveDupes {
    public static void main(String[] args) 
    {
		if (args.length != 1) {
			System.out.println("Usage: CopyFile inputFile");
			System.exit(-1);
		}
		Scanner scanner = IO.inFile(args[0]);
		if (scanner == IO.inError) {
			System.out.println("Error: could not read input file " + args[0]);
			System.exit(-1);
		}
        HashSet<String> names = new HashSet<>();
		while(scanner.hasNext())
		{
			names.add(scanner.nextLine());
		}
		scanner.close();
			System.out.println(String.format("File %s has %d unique names ", args[0], names.size()));
		

    }
}
