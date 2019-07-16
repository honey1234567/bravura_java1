import java.lang.Exception;
import java.util.Scanner;
class stuexp extends Exception
{

  public stuexp(String message)
   {

   super(message);

    }
}
class student
{
 private String name;
 private String pno;

  public student(String n1,String pno)
   {
this.name=n1;
this.pno=pno;
 }
public String get_name()
{
return name;
}
public String get_phone()
{
return pno;
}

}


class student_exp
{  
static void checkname(String n)throws stuexp
{
  if(n.length()==0)
  throw new stuexp("no name has been passed");

}
static void checkpno(String pno)throws stuexp
{
  if(pno.length()==0)
  {
     throw new stuexp("no phone no. has been passed");
  }
}

  public static void main(String args[])
   {
     try
      {
         
         Scanner sc=new Scanner(System.in);
         System.out.println("enter name");
         String name=sc.nextLine();
         checkname(name);//when exception has occured in name ten no below line will execute
         System.out.println("enter Phone no");
         String pno=sc.nextLine();
         checkpno(pno);
         student s=new student(name,pno);
         //below all output will be displayed when no exception has been occured on any of the above line
         System.out.println("Student Name:- "+s.get_name());
         System.out.println("Student Age:- "+s.get_phone());
	}
      catch(Exception e)
        {
           System.out.println(e.getMessage());
         }
    }
}