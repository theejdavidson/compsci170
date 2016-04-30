import java.util.ArrayList;
import java.util.*;
class Place {
 
	Scanner keyboard = new Scanner(System.in);
	
	public static void Number(int room){
		read input = new read();
		// grocery store
		if(room == 1){
			input.readAndPrintFile("grocery.txt");
			//Options for user inside grocery store
			keyboard.nextLine();
		}
		// farm
		else if (room == 2){
			input.readAndPrintFile("farm.txt");
		}
		//police station
		else if(room == 3){
			input.readAndPrintFile("police.txt");
		}
		//mountain
		else if(room == 4){
			input.readAndPrintFile("mountain.txt");
		}
		//sporting goods stroe
		else if(room == 5){
			input.readAndPrintFile("sporting.txt");
		}
		//gas station
		else if(room == 6){
			input.readAndPrintFile("gas.txt");
		}
		else if(room == 7){
			input.readAndPrintFile("home.txt");
		}
		else{
			System.out.println("Error");
		}
			
		}
		
		
		
	}
	
    

    // Remove item from room when added to inventory
    
