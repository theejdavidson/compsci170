import java.util.*;
public class Histogram {
    public static void main(String[] args) 
    {
        Map<String, Integer> m = new HashMap<>();
        // Initialize frequency table from command line
        for (String a : args) 
	{
            Integer freq = m.get(a);
            if (freq == null) // means that word is new
                m.put(a, 1); // if so, its count is 1, autoboxed to Integer
            else
                m.put(a, freq + 1); // otherwise add 1 to its count
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m); // Map overrides toString for a nice output
    }
}
