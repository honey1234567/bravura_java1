package mypack;
public class reverse1
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
