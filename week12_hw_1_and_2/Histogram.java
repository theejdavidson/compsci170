import java.util.*;
public class Histogram {
    public static void main(String[] args) 
    {
        Map<Integer, Integer> m = new HashMap<>();
		System.out.print("Enter integers for the Histogram when prompted ");
		Scanner keyboard = new Scanner(System.in);
		boolean done = false;
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
				 Integer freq = m.get(entry);
            if (freq == null) // means that word is new
                m.put(entry, 1); // if so, its count is 1, autoboxed to Integer
            else
                m.put(entry, freq + 1); // otherwise add 1 to its count;
			}
      }

        System.out.println(m.size() + " unique entries: ");
		for(Map.Entry<Integer, Integer> pair : m.entrySet())
		{
        System.out.println(String.format("The number %d occurs %d times", pair.getKey(), pair.getValue())); // Map overrides toString for a nice output
		}
    }
}
