class A
{
   public void methodA()
   {
     System.out.println("A");
   }
}

class B extends A
{
   public void  methodB()
   {
	//methodA();
     System.out.println("B");
   }
   
}

class RunSingle_inhertance
{
	public static void main(String args[])
   {
	B obj=new B();
	obj.methodB();
	obj.methodA(); 
  }
}