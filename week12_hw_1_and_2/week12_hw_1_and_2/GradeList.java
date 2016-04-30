import java.util.ArrayList;
import java.util.Scanner;

public class GradeList
{
   public static void main(String[] args)
   {
      ArrayList<Integer> gradeList = new ArrayList<Integer>();
      System.out.println("Enter items for the list, when prompted.");
      boolean done = false;
      Scanner keyboard = new Scanner(System.in);
	  int maxInt = 0;
	  int minInt = Integer.MAX_VALUE;
	  int count = 0;
	  int total = 0;
      while (!done)
      {
          System.out.println("Type an entry, type -1 to end:");
          int entry = keyboard.nextInt( );
		    if (entry == -1)
			{
              done = true;
			}
			else
			{
				if (minInt > entry)
				{
					minInt = entry;
				}
				if(maxInt < entry)
				{
					maxInt = entry;
				}
				gradeList.add(entry);
				count++;
				total = total + entry;
			}
      }
	  if(count == 0)
	  {
		  System.out.println("There is no minimum or maximum, and you cannot compute the average of no entries ");
		  System.exit(-1);
	  }
      System.out.println("The list contains:");

      int listSize = gradeList.size( );
      for (int position = 0; position < listSize; position++)
          System.out.println(gradeList.get(position));
	  
	  	System.out.println("max int =" + maxInt);
		System.out.println("min int =" + minInt);
		System.out.println("average =" + (total)/count);
		System.out.println("total =" + total);

/* Alternate code for displaying the list
      System.out.println("The list contains:");
      for (String element : gradeList)
          System.out.println(element);
*/
   }
}