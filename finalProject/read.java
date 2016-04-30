import java.util.*;
import java.io.*;

public class read{
	private String filename;
	
	public static void readAndPrintFile(String file){
		TreeSet<String> names = new TreeSet<String>();
		System.out.println();
		try{
			Scanner input = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			File readAndPrintFile = new File(file);
			sc = new Scanner(readAndPrintFile);
			
			while(sc.hasNextLine()){
				String temp = sc.nextLine();
				System.out.println(temp);
				
			}
			sc.close();
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
			
		}
		}
		
		
	}
