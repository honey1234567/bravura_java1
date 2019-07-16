Class A
{
   public void methodA()
   {
     System.out.println("A");
   }
}

public Class B extends A
{
   public void methodB()
   {
     System.out.println("B");
   }
   public static void main(String args[])
   {
     B obj = new B();
     obj.methodA(); 
     obj.methodB(); 
  }
}