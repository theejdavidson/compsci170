import java.util.ArrayList;
import java.util.*;
class Places2 {
 
	Scanner input = new Scanner(System.in);
	public static void Number(int room){
		read input = new read();
		// grocery store
		if(room == 1){
			input.readFile("grocery.txt");
			System.out.println("You can go to the Deli(a), aisle(b) and the parking lot(c)");
			
		/*	if(input.equalsIgnoreCase("a")){
				
			}
			else if(input.equalsIgnoreCase("b")){
				
		*/	}
		}
		// farm
		else if (room == 2){
			input.readFile("farm.txt");
		}
		//police station
		else if(room == 3){
			input.readFile("police.txt");
		}
		//mountain
		else if(room == 4){
			input.readFile("mountain.txt");
		}
		//sporting goods stroe
		else if(room == 5){
			input.readFile("sporting.txt");
		}
		//gas station
		else if(room == 6){
			input.readFile("gas.txt");
		}
		else{
			System.out.println("Error");
		}
			
		}
		
		
		
	}
	
    

    // Remove item from room when added to inventory
    
