 import java.util.*;
public class  CourseList{
    public static void main(String[] args) 
    {
        Map<Integer, ArrayList<String>> students = new HashMap<>();
		System.out.println("On each line enter Student ID followed by course name, student ID -1 to quit ");
		Scanner keyboard = new Scanner(System.in);
	 while (true)
       {
          int studentId = Integer.parseInt(keyboard.next());
		  if (studentId == -1)
			{
              break;
			}
		  String courseName = keyboard.next();
		 // System.out.println(String.format("%s --> %s", studentId, courseName));
		  ArrayList<String> studentCourses = students.get(studentId);
		  
		  if(studentCourses == null)
		  {
			  studentCourses = new ArrayList<String>();
			  studentCourses.add(courseName);
			  students.put(studentId, studentCourses);
			  System.out.println(studentCourses);
		  }
		  else
		  {
			  studentCourses.add(courseName);
			  System.out.println(studentCourses);
		  }
		}
		for(Map.Entry<Integer, ArrayList<String>> entry: students.entrySet())
		{
			System.out.println(String.format("%s --> %s", entry.getKey(), entry.getValue()));
		}
    }
}
