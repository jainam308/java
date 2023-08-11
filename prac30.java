import java.util.*;
public class prac30 
{
    public static void main(String[] args) 
    {
    	HashMap<Integer,String> student=new HashMap<Integer,String>();

    	student.put(7001,"Devansh");
    	student.put(7002,"Chirag");
    	student.put(7003,"Umang");
    	student.put(7004,"Devarsh");
    	student.put(7005,"Daksh");
    	System.out.println("Details of students");
    	System.out.println("-----------------------");
    	System.out.println("En No"+"		"+"Name");
    	System.out.println("-----------------------");
    	for(int m:student.keySet())
    	{
    		System.out.println(m+"		"+student.get(m));
    	}
    }
}