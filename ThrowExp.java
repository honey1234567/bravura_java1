class ThrowExp
{
  static void checkage(int age)
   {
     if(age<18)

      {
         throw new ArithmeticException("Age is not valid");

       }
       else
        {
          System.out.println("you are eligible to give vote");
         }
    }
    public static void main(String arg[])
    {

      try
      {
      
        int a=Integer.parseInt(arg[0]);
        checkage(a);
       }
       catch(Exception e)
       {
         System.out.println(e.getMessage());
        }
     }
     }