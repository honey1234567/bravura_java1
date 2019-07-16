import java.lang.Exception;
class customexp extends Exception
{

  public customexp(String message)
   {

   super(message);
    System.out.println("In customExp"+super.getMessage());

    }
}
class RunCustomExp
{

 static void callmyexp()throws customexp
  {
    throw new customexp(" Error handled here" );
  }

}
class Run
{  
  public static void main(String args[])
   {
     try
      {
         RunCustomExp.callmyexp();
	}
      catch(Exception e)
        {
           System.out.println(e.getMessage());
         }
    }
}