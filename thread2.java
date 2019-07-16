class prime
{
	synchronized public void primeno(int num,Thread  c)
	{
	int flag=0;
   for(int i=2;i<=num/2;i++)
    {
      if(num%i==0)
       {
           System.out.println("Not a Prime No. by  " + c);
           flag=1;
            break;
        }
    }
      if(flag==0)
      System.out.println("Prime no. by  " + c);

	}
}
class A extends Thread
{
	prime p=new prime();
	public void run()
	{
	Thread currentThread = Thread.currentThread();
	//System.out.println(currentThread);
   

	p.primeno(7,Thread.currentThread());
	}
}
class B extends Thread
{
	prime p1=new prime();
	public void run()
	{
	Thread currentThread = Thread.currentThread();
	//System.out.println(currentThread);

	p1.primeno(9,Thread.currentThread());
	}
}
public class thread2
{
	public static void main(String args[])
	{
	A t1=new A();
	B t2=new B();
	t1.start();
	t2.start();
	
	}
}
