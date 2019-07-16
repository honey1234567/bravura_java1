class Prime
{
 public void primeno(int num)
  {int flag=0;
   for(int i=2;i<=num/2;i++)
    {
      if(num%i==0)
       {
           System.out.println("Not a Prime No.");
           flag=1;
            break;
        }
    }
      if(flag==0)
      System.out.println("Prime no.");
   }
}
class Reverse extends Prime
{
  public void reverse(int num)
   {
     int rem=0;
      int rev=0;
      while(num!=0)
      { 
        rem=num%10;
        rev=rev*10+rem;
        num=num/10; 
      
       }   
      System.out.println("Reverse no."+rev);

     }
} 
class Palindrome extends Reverse
{
   public void palindrome(int num)
     {
     

       int rem=0;
      int rev=0;
      while(num!=0)
      { 
        rem=num%10;
        rev=rev*10+rem;
        num=num/10; 
      
       }   
if(num==rev)
System.out.println("It Is palindrome");
else

System.out.println("It Is not a palindrome");
     }

}

class A 
{

public static void main(String[] args)
  {

    Palindrome obj=new Palindrome();
    obj.primeno(7);
    obj.palindrome(13231);
    obj.reverse(102);
    
  }

}
