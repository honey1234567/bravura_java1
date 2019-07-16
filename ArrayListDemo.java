package collection;
import java.lang.*;
import java.util.*;//in case of error import java.util.AL



public class ArrayListDemo{
	

			   public static void main(String args[]) {
			      // create an array list
			      ArrayList<ArrayList<Integer>> al = new ArrayList<>();
			      System.out.println("Initial size of al: " + al.size());
	              ArrayList<Integer> a=new ArrayList<>();
	              ArrayList<Integer> a2=new ArrayList<>();
			      // add elements to the array list
			      a.add(1);
			      a.add(2);
			      a.add(3);
			      a.add(4);
			      a.add(5);
			      a.add(6);
			      a.add(1, 7);
			      a2.add(89);
			      a2.add(90);
			      System.out.println("Size of inner  al after additions: " + a.size());
			      al.add(a);
			      al.add(a2);
			      System.out.println("Size of outer al after additions: " + al.size());

			      // display the array list
			      System.out.println("Contents of inner al: " + a);
			      System.out.println("Contents of outer  al: " + al);

			      // Remove elements from the array list
			      a.remove(1);//remove at index 1
			      al.remove(0);
			      System.out.println("Size of inner  al after deletions: " + a.size());
			      
			      System.out.println("Size of outer  al after deletions: " + al.size());
			      System.out.println("Contents of  outer al: " + al);
			      System.out.println("Contents of  inner al: " + a );
			      ArrayList<Integer> inner=new ArrayList<>();
			      inner=al.get(0);
			      System.out.println("After fetching 1st value from outer array list " + inner);
			      System.out.println("Fetch first value from above list " + inner.get(0));
			      
			      
			      
			   }
			
		
		}





