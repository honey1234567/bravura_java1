import java.util.Scanner;
class ExpHnd
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int a,b;
     System.out.println("enter A");
     a=sc.nextInt();
 System.out.println("enter B");
b=sc.nextInt();
try
{
 System.out.println("Before dividing");
int c=a/b;
 System.out.println("After dividing");
}
catch(Exception e)
{
 System.out.println("Trying to divide a with b as zero");
}
finally
{
System.out.println("will always Execute");
}
 System.out.println(a+b);

}
}