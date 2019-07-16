import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
class HashMap{
  private HashMap<Integer,String> hm;
  public HashMap(){
     student=new HashMap<Integer,String>();
  }
  public void add(){
    hm.put(100,"Amit");    
      hm.put(101,"Vijay");    
      hm.put(102,"Rahul");   
       System.out.println("After invoking put() method ");  
      for(Map.Entry m:hm.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
        hm.putIfAbsent(103, "Gaurav");  
      System.out.println("After invoking putIfAbsent() method ");  
      for(Map.Entry m:hm.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue()); }   
  }
}
public class HashMap_main{
  public static void main(String args[])
  {
    HashMap h=new HashMap();
    h.add();
  }

}