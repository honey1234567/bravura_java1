package collection;

public class anonumous_thread extends Thread {
	 
	  
		public static void main(String args[]){  
	    new anonumous_thread(){
	    	public void run()
	    	{new anonumous_thread(){
		    	public void run()
		    	{
		    		
		    	 
		    		System.out.println("thread is running...");	
		    	}
			}.start();  
	    		
	    	 
	    		System.out.println("thread is running...");	
	    	}
		}.start();  
		 }  
		 

}
