import java.lang.Exception;
public class multipletry
{
  static void checkprime(int num)
   {
   int flag=0;
   for(int i=2;i<=num/2;i++)
    {
      if(num%i==0)
       {
           flag=1;
            break;
        }
    }
if(flag==0)
  throw new ArithmeticException(" prime no");
else
  
  throw new ArithmeticException(" not prime no"); 


    }
static void checkpalindrome(int num)
   {
       int rem=0;
      int rev=0;
      while(num!=0)
      { 
        rem=num%10;
        rev=rev*10+rem;
        num=num/10; 
      
       }
if(num!=rev)
    throw new IndexOutOfBoundsException(" not palindrome");
else 
     throw new IndexOutOfBoundsException(" palindrome no. ");
 

     }
static void checkarmstrong(int num)
  {
    int rem=0,cube=0,temp;
   int arm=0;
   temp=num;
   while(num!=0)
    {
    rem=num%10;
    cube=rem*rem*rem;
     arm+=cube;
     num=num/10;


    }
if(temp==arm)
  throw new NullPointerException(" armstrong");
else 
  throw new NullPointerException(" not armstrong");




   }
    public static void main(String arg[])
    {int flag;
     int num=Integer.parseInt(arg[0]);
      
       // int num=Integer.parseInt(arg[0]);
       try
        {
        checkprime(num);
         }
      catch( ArithmeticException e)
       {
         System.out.println(e.getMessage());
        }
       try
        {
        checkpalindrome(num);
        }
        catch(IndexOutOfBoundsException e)  
                  {  
                   System.out.println(e.getMessage());  
                  }    
       
          try
        {
        checkarmstrong(num);
        }
        catch(NullPointerException e)  
                  {  
                   System.out.println(e.getMessage());  
                  }    
       
    
     }
}