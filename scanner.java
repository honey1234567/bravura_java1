import java.util.Scanner;
class hcf
{
  public static void main(String args[])
    {
      int a,b,hcf1=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter two no")
       a=sc.nextInt();
       b=sc.nextInt();
       
       for(int i=1;i<=a && i<=b;i++)
        {
          if(a%i==0 && b%i==0)
            hcf1=i;
         }
      System.out.println("HCF is"+hcf1);
}
}