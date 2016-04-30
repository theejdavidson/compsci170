import java.io.*;
import java.nio.file.*;
import java.util.*;

/** IO: a class that provides simplified I/O access to text files */

public class IO
{
	public static final Scanner inError = null; // indicates input file error

	/** create a Scanner object connected to a text file open for input
	 *  @param filename a String representing a file name in the OS file system
	 *  @return a Scanner object connected to the file, or inError
	 *  @author Dr. Robert Yacobellis, Loyola Computer Science
	 *  @version 1.0 March, 2016
	 */

	public static Scanner inFile(String filename)
	{
		try
		{
			return new Scanner(new File(filename));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			return inError;
		}
	}

	public static final PrintStream outError = null; // indicates output file error

	/** create a PrintStream object connected to a text file open for overwriting
	 *  @param filename a String representing a file name in the OS file system
	 *  @return a PrintStream object connected to the file, or outError
	 *  @author Dr. Robert Yacobellis, Loyola Computer Science
	 *  @version 1.0 March, 2016
	 */

	public static PrintStream outFile(String filename)
	{
		try
		{
			return new PrintStream(filename);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			return outError;
		}
	}


	/** check whether a text file exists
	 *  @param filename a String representing a file name in the OS file system
	 *  @return a boolean that is true if the file exists, and false otherwise
	 *  @author Dr. Robert Yacobellis, Loyola Computer Science
	 *  @version 1.0 March, 2016
	 */

	public static boolean exists(String filename)
	{
		try
		{
			if (Files.exists(Paths.get(filename)))
				return true;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}

	/** create a PrintStream object connected to a new text file open for overwriting
	 *  @param filename a String representing a new file name in the OS file system
	 *  @return a PrintStream object connected to the new file, or outError
	 *  @author Dr. Robert Yacobellis, Loyola Computer Science
	 *  @version 1.0 March, 2016
	 */

	public static PrintStream newFile(String filename)
	{
		if (exists(filename))
		{
			System.out.println(filename + " already exists");
			return outError;
		}
		return outFile(filename);
	}

	/** create a PrintStream object connected to a text file open for appending
	 *  @param filename a String representing a file name in the OS file system
	 *  @return a PrintStream object connected to the file, or outError
	 *  @author Dr. Robert Yacobellis, Loyola Computer Science
	 *  @version 1.0 March, 2016
	 */

	public static PrintStream appendFile(String filename)
	{
		try
		{
			return new PrintStream(new FileOutputStream(filename, true));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			return outError;
		}
	}

	/** create and return a String array containing all of the lines of a text file
	 *  @param filename a String representing a file name in the OS file system
	 *  @return a String array containing all of the lines of the file, if any, or null
	 *  Note: a null return value indicates some kind of I/O error occurred
	 *  @author Dr. Robert Yacobellis, Loyola Computer Science
	 *  @version 1.0 March, 2016
	 */

	public static String[] readAllLines(String filename)
	{
		try
		{
			List<String> lines = Files.readAllLines(Paths.get(filename));
			return lines.toArray(new String[lines.size()]);
		}
		catch (Exception e)
		{
			return null;
		}
	}


	/** write out all the lines in a String array to a text file, overwriting it
	 *  @param filename a String representing a file name in the OS file system
	 *  @param lines a String array containing all of the lines to be written
	 *  @throws RuntimeException if there is an error
	 *  @author Dr. Robert Yacobellis, Loyola Computer Science
	 *  @version 1.0 March, 2016
	 */

	public static void writeAllLines(String filename, String[] lines)
	{
		PrintStream out = null;
		try
		{
			out = outFile(filename);
			for (String line : lines)
				out.println(line);
			out.close();
		}
		catch (Exception e)
		{
			if (out != null)
				out.close();
			throw new RuntimeException(e.getMessage());
		}
	}

	/** write out all the lines in a String array to a text file, appending to it
	 *  @param filename a String representing a file name in the OS file system
	 *  @param lines a String array containing all of the lines to be written
	 *  @throws RuntimeException if there is an error
	 *  @author Dr. Robert Yacobellis, Loyola Computer Science
	 *  @version 1.0 March, 2016
	 */

	public static void appendAllLines(String filename, String[] lines)
	{
		PrintStream out = null;
		try
		{
			out = appendFile(filename);
			for (String line : lines)
				out.println(line);
			out.close();
		}
		catch (Exception e)
		{
			if (out != null)
				out.close();
			throw new RuntimeException(e.getMessage());
		}
	}

	/** create and return an int array taken from all the lines of a text file
	 *  @param filename a String representing a file name in the OS file system
	 *  @return an int array containing all of the ints from the file or null
	 *  Note: a null return value indicates some kind of I/O or other error occurred
	 *  one possible error is that a line in the file is not convertable to an int
	 *  @author Dr. Robert Yacobellis, Loyola Computer Science
	 *  @version 1.0 March, 2016
	 */

	public static int[] readAllInts(String filename)
	{
		try
		{
			List<String> lines = Files.readAllLines(Paths.get(filename));
			int[] ints = new int[lines.size()];
			int index = 0;
			for (String line : lines)
				ints[index++] = Integer.parseInt(line);
			return ints;
		}
		catch (Exception e)
		{
			return null;
		}
	}

	/** create and return a double array taken from all the lines of a text file
	 *  @param filename a String representing a file name in the OS file system
	 *  @return an double array containing all of the doubles from the file or null
	 *  Note: a null return value indicates some kind of I/O or other error occurred
	 *  one possible error is that a line in the file is not convertable to a double
	 *  @author Dr. Robert Yacobellis, Loyola Computer Science
	 *  @version 1.0 March, 2016
	 */

	public static double[] readAllDoubles(String filename)
	{
		try
		{
			List<String> lines = Files.readAllLines(Paths.get(filename));
			double[] doubles = new double[lines.size()];
			int index = 0;
			for (String line : lines)
				doubles[index++] = Double.parseDouble(line);
			return doubles;
		}
		catch (Exception e)
		{
			return null;
		}
	}

	/** test method for IO - be sure to pass in a file you don't mind overwriting!
	 *  @param args a String array containing a single file name for the tests
	 *  @author Dr. Robert Yacobellis, Loyola Computer Science
	 *  @version 1.0 March, 2016
	 */

	public static void main(String[] args)
	{
		if (args.length == 0)
		{
			System.out.println("usage: IO filename");
			System.exit(0);
		}

		String filename = args[0];

		if (IO.exists(filename))
			System.out.println(filename + " already exists, IO.newFile should fail");
		else
			System.out.println(filename + " does not exist, IO.newFile should succeed");

		PrintStream newFile = IO.newFile(filename);
		if (newFile == IO.outError)
		{
			System.out.println("could not open " + filename + " as a new file");
		}
		else
		{
			newFile.println("first line of file");
			newFile.println("second line of file");
			newFile.print("third line");
			newFile.println(" of file");
			newFile.close();
		}

		Scanner file = IO.inFile(filename);
		if (file == IO.inError)
			System.out.println("input file error for file name: " + filename);
		else if (file.hasNextLine())
		{
			System.out.println("lines of " + filename + ":");
			int num = 1;
			while (file.hasNextLine())
			{
				System.out.println(num++ + "\t" + file.nextLine());
			}
			file.close();
		}
		else
		{
			System.out.println("no lines in file " + filename);
			file.close();
		}

		System.out.println();
		System.out.println("lines of file read by IO.readAllLines:");
		String[] lines = IO.readAllLines(filename);
		System.out.println(filename + " now contains " + lines.length + " lines:");
		for (String line : lines)
			System.out.println(line);
		System.out.println();

		PrintStream output = IO.outFile(filename);
		if (output == IO.outError)
			System.out.println("outFile error detected");
		else
		{
			output.println("new first line of file");
			output.close();
		}

		output = IO.newFile(filename);
		if (output == IO.outError)
			System.out.println("newFile error detected");
		else
		{
			System.out.println(filename + " should already exist, but newFile did not detect that");
			output.close();
		}

		output = IO.appendFile(filename);
		if (output == IO.outError)
			System.out.println("appendFile error detected for " + filename);
		else
		{
			output.println("last line of file");
			output.close();
		}

		System.out.println();
		lines = IO.readAllLines(filename);
		if (lines == null)
			System.out.println("I/O error when attempting to read all lines of " + filename);
		else
		{
			System.out.println(filename + " contains " + lines.length + " lines:");
			for (String line : lines)
				System.out.println(line);
			IO.writeAllLines("NEW" + filename, lines);
			IO.appendAllLines("NEW" + filename, lines);
			System.out.println();
			lines = IO.readAllLines("NEW" + filename);
			System.out.println("NEW" + filename + " contains " + lines.length + " lines:");
			for (String line : lines)
				System.out.println(line);
		}

		System.out.println();
		lines = IO.readAllLines("no-file");
		if (lines == null)
			System.out.println("I/O error when attempting to read all lines of no-file");

		System.out.println();
		int[] ints = IO.readAllInts("ints.txt");
		System.out.print("the ints read are: ");
		for (int i : ints)
			System.out.print(i + " ");
		System.out.println();

		System.out.println();
		double[] doubles = IO.readAllDoubles("doubles.txt");
		System.out.print("the doubles read are: ");
		for (double d : doubles)
			System.out.print(d + " ");
		System.out.println();
	}
}