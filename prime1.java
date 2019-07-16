package mypack;
public class prime1
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
