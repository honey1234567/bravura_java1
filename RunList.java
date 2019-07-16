package collection;
import java.util.*;

public class RunList {
	public static void main(String args[])
	{
	ArrayList<Student> arraylist=new ArrayList<>();
	arraylist.add(new Student("ccc",3,"LLB"));
	arraylist.add(new Student("bbb",1,"LLB"));
	arraylist.add(new Student("aaa",2,"LLB"));
	System.out.println("sorting by name");
	Collections.sort(arraylist,new SortByName());
	Iterator i=arraylist.iterator();
	while(i.hasNext())
	{
		Student s=(Student)i.next();
		s.printStudent();
	}
	System.out.println("sorting by roll no.");
	Collections.sort(arraylist,new SortByRoll());
	Iterator i1=arraylist.iterator();
	while(i1.hasNext())
	{
		Student s=(Student)i1.next();
		s.printStudent();
	}
	
	}
}
