import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        // Build rooms
      /*  final int WIDTH = 2;
        final int HEIGHT = 2;
       Room[][] room = new Room[WIDTH][HEIGHT];
        // Rooms.build(room, WIDTH, HEIGHT);
		*/
		read stuff = new read();
		need  x = new need();
		Scanner keyboard = new Scanner(System.in);
		 Place set = new Place();
        
       
        
        // Title Screen
    	stuff.readAndPrintFile("Intro.txt");
		stuff.readAndPrintFile("help.txt");
    	
    	// Print starting place description
    	

        // Start game loop
		int days = 0;
        boolean playing = true;
        while (days <10) {
			
				days ++;
				System.out.println("Day: " + days);
				System.out.println("Where do you want to go today?");
        	// Get user input
           String input = keyboard.nextLine();

            // Movement commands
            if (input.equalsIgnoreCase("gs")) {
               set.Number(1);
				
                }
             else if (input.equalsIgnoreCase("f")) {
				set.Number(2);
                
            } else if (input.equalsIgnoreCase("ps")) {
                set.Number(3);
            } else if (input.equalsIgnoreCase("m")) {
               set.Number(4);
            }
			else if (input.equalsIgnoreCase("sgs")) {
                set.Number(5);
            } else if (input.equalsIgnoreCase("gas")) {
				set.Number(6);   
            } else if (input.equalsIgnoreCase("home")) {
				set.Number(7);   
            }

            // Look commands
           

            // Get commands
          /*  else if (input.length() > 4  && input.substring(0, 4).equals("get ")) {
            	if (input.substring(0, input.indexOf(' ')).equals("get")) {
            		if (input.substring(input.indexOf(' ')).length() > 1) {
            			String item = input.substring(input.indexOf(' ') + 1);
                    	score = Inventory.checkItem(x, y, item, inventory, room, score);
            		}	
            	}
            }*/

            // Inventory commands
          /*  else if (input.equalsIgnoreCase("i") || input.equalsIgnoreCase("inv")
                    || input.equalsIgnoreCase("inventory")) {
                Inventory.print(inventory);
            }*/
            else if(input.equalsIgnoreCase("s")){
				x.print();
				days--;
			}
           
            
            else if (input.equalsIgnoreCase("restart")) {
            	System.out.println();
            	Main.main(args);
            }
            
            else if (input.equalsIgnoreCase("help")) {
            	stuff.readAndPrintFile("help.txt");
				days--;
            }
            
            // Quit commands
            else if (input.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;

            // Catch-all for invalid input
            } else {
                System.out.println("You can't do that.");
				days--;
            }
			if(x.getGas() >= 10 && x.getFood() >= 10 && x.getWater() >=10){
				stuff.readAndPrintFile("YouWin.txt");
				break;
			}
			else if(days == 10){
				stuff.readAndPrintFile("YouLose.txt");
			}
        }
	}
        
    }

