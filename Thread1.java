class mythread extends Thread
{ mythread(String t_name)
	{
		super(t_name);
	}
 private volatile boolean exit = false;
	public void run()
	{
		Thread currentThread = Thread.currentThread();
		
	System.out.println(currentThread);

	System.out.println(super.getName()+" Thread is running");
}
	


}
class Thread1
{
	public static void main(String args[])
	{
		mythread t1= new mythread("T1");//thread creation
		mythread t2=new mythread("T2");
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		//t2.stop();
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);//[name,priority,main]

		//always be in background untill get destroyed
	}
}
//