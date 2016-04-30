import java.util.ArrayList;
import java.util.*;
class Place {
 
	
	public static void Number(int room){
		read input = new read();
			Scanner keyboard = new Scanner(System.in);

		// grocery store
		if(room == 1){
			input.readAndPrintFile("grocery.txt");
			//Options for user inside grocery store
			String i = keyboard.nextLine();
			if(i.equalsIgnoreCase("a"))
			{
				System.out.println("You check the deli only to find that what food left has been covered in mold.  Gross.  There is no way you are eating that. You don’t find any supplies");
			}else if(i.equalsIgnoreCase("b"))
			{
				System.out.println("You walk down the aisle to find only empty shelves. However, you spy several cans of delicious Chef Boyardee Ravioli that have rolled under the shelves. You find 3 food.");
				
			}else if(i.equalsIgnoreCase("c"))
			{
				System.out.println("There are a few rusty cars in the parking lot.  With a rubber hose, you manage to siphon some gasoline while accidentally swallowing only a few mouthfuls.  You feel pretty proud of yourself. You find 3 gas.");
				
			}
		}
		// farm
		else if (room == 2){
			input.readAndPrintFile("farm.txt");
			String i = keyboard.nextLine();
			if(i.equalsIgnoreCase("a"))
			{
				System.out.println("As you enter the farm house, a disgusting smell permiates your nose. Like, a really disgusting smell though, like even more disgusting than the smell of a regular barn.  You take a look around.  The only thing that remains are carcasses of animals and several high ranking Soviet uniforms- roughly pig sized.  You find nothing of any real use in the barn");
			}else if(i.equalsIgnoreCase("b"))
			{
				System.out.println("Ever since you were a little kid you had always wanted to ride a tractor.  This is a unique opportunity you have seized.  You climb up one and sit on the seat.  'This is incredible' you think to yourself.  After several life changing hours of pretending to be a farmer, you decide to check the gas tanks.  You find 3 gas.");
				
			}else if(i.equalsIgnoreCase("c"))
			{
				System.out.println("You walk towards the well on the edge of the farm. With a bit of elbow grease, you were able to take off the well's cover and see a child's skeleton floating at the bottom.  Unfortunately there were no heroic dogs at the time to alert anyone of its presence.  On the bright side, the water still looks fresh. You get 3 water.");
				
			}
		}
		//police station
		else if(room == 3){
			input.readAndPrintFile("police.txt");
			String i = keyboard.nextLine();
			if(i.equalsIgnoreCase("a"))
			{
				System.out.println("You enter the Armory only to find that it has been stripped clean already. The racks that should've held countless guns have traces of dust.  There is literally zero armor in this armory. You don't find anything useful here.");
			}else if(i.equalsIgnoreCase("b"))
			{
				System.out.println("You search the police cars.  Inside one of them you spot a donut, though it looks like it has been sitting for months now.  You decide that today is not your cheat day.  One of the cars has gas too, so there's that.  You collect 2 gas.");
				
			}else if(i.equalsIgnoreCase("c"))
			{
				System.out.println("You enter the office of the Chief of Police.  You walk behind the desk and slam your fists on the table in anger.  'I WANT YOUR BADGE AND GUN!!  NOW GET OUT OF MY OFFICE IMMEDIATELY', you say furiously, pretending to suspend a cop who has been playing a little too fast and loose with the rules for your liking.  With that fantasy successfully played out you look around and notice a huge plaque with a very old rifle on it. After taking it down and tinkering with it, you manage to find bullets and get the rifle operational. You have obtained the Rifle.");
				
			}
		}
		//mountain
		else if(room == 4){
			input.readAndPrintFile("mountain.txt");
			String i = keyboard.nextLine();
			if(i.equalsIgnoreCase("a"))
			{
				System.out.println("You dip a toe in and find that the water is the perfect temperature for swimming. As you begin to step in, you suddenly realize you never learned how to swim and quickly step back onto the safe dry land.  Phew, that was a close one.  Still, the water looks fresh so you collect some.  You get 3 water.");
			}else if(i.equalsIgnoreCase("b"))
			{
				//if()
				System.out.println("You set out to go hunting which seems like a strange choice since you have not yet collected any weapons.  You find a deer and try to sneak up and strangle it with your bare hands.  It sees you immediately and runs off.  Better luck next time, Natureman!");
				//else if()
				System.out.println("You embark on a hunting trip armed with a bow and arrow.  After some searching, you find the perfect mark.  A glorious, majestic, shining elk with a bangin' rack.  You take aim and let the arrow fly and time seems to slow down.  Boom! Headshot!  You hold three fingers in the air and do a whistle like Jennifer Lawrence from the hunger games.  You collect 2 food.");
				//else if()
				System.out.println("With your trusty rifle in hand, you enter the woods for a good old fashioned animal killin' spree.  You gun down an innocent family of squirrels.  You pop a cap in a pheasant's rear end.  Teddy Roosevelt would be proud.  You straight up shoot a bear in the face.  You collect 4 food");
				
			}else if(i.equalsIgnoreCase("c"))
			{
				System.out.println("You approach the camping trailers parked around the cliff, and search several. SCORE!  It looks like some campers escaped in a hurry leaving behind a fully stocked pantry right here for the taking.  They are probably dead by now, you tell yourself, so it would be wrong to let all this food go to waste.  You get 2 water and 2 food.");
				
			}
		}
		//sporting goods store
		else if(room == 5){
			input.readAndPrintFile("sporting.txt");
			String i = keyboard.nextLine();
			if(i.equalsIgnoreCase("a"))
			{
				System.out.println("You gaze admiringly at the various luxury models of bow and arrows in the hunting section.  There was no way you could have afforded these before the Trumpocalypse.  At least there is a silver lining, you think to yourself, passing by a thermal insulating silver lined sheet.  And this one is a camo lining, sweet!  You pick up the camoflauge lining as well as the most expensive bow and arrow set.  You do not pay for them.");
				
			}else if(i.equalsIgnoreCase("b"))
			{
				System.out.println("You look around the survival section.  Several corpses lay ironically on the ground.  One of them is still clutching several boxes of food and some water.  You take it because, unlike these idiots, you actually know how to survive.  You get 2 food and 1 water");
				
			}else if(i.equalsIgnoreCase("c"))
			{
				System.out.println("You stroll through the baseball section and reminisce about the former favorite American pasttime.  It has since been legally replaced with the new national sport of Trumpball, which mostly just involves beating up foreigners with a bat.  There isn't even a ball.  It is a really dumb sport that clearly did not get thought through. You find nothing of real use in this section.");
				
			}
		}
		//gas station
		else if(room == 6){
			input.readAndPrintFile("gas.txt");
			String i = keyboard.nextLine();
			if(i.equalsIgnoreCase("a"))
			{
				System.out.println("You check behind the counter.  The cash register is open, and you pull out one of the dollar bills for a closer look.  The smug, grinning face of Donald Trump is printed on the newly minted 2 Billion Dollar Bill.  Due to the recent inflation rates, it is worth roughly .0004 Cents.  Though the money is not of any use, you spot some water bottles tucked behind the counter as well.  You get 2 water.");
				
			}else if(i.equalsIgnoreCase("b"))
			{
				System.out.println("You sidle on up to the gas pump.  You grip the handle with determination and joy.  You begin to fill an empty gas can up with the glorious nectar provided by the gasoline pump.  You get 4 whole gas!");
				
			}else if(i.equalsIgnoreCase("c"))
			{
				System.out.println("As you walk through the store, you find an assortment of all the gross snacks no one wanted. Ooooh boy, Mounds and Circus Peanuts. You find 2 food and water.");
				
			}
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
    
