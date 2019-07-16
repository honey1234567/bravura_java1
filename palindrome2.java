package mypack;
class Palindrome 
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

