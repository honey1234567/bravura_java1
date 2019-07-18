package MyServlet1;
import java.lang.Exception;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        // TODO Auto-generated method stub
        //response.getWriter().append("Served at: ").append(request.getContextPath());
        response.setContentType("TEXT/HTML");
        PrintWriter out = response.getWriter(); //to enable data 
        out.write("<html><body>");
        out.write("<h3>my first servlet</h3>"); 
        //Note:- specify method aspost if the logic is in post else define get and run index.html becoz it is home page
        //or you can include html in get then discard index.html and run this file.
        //out.write("<form>");
     // out.write("choose operation:<br>");
        //out.write("<input type='text' name='choose operation'><br>"); //don't put double quote inside double.
        //out.write("wait for more:<br>");
        //out.write ("<input type='text' name='wait for more'><br>");     //forms
       /* out.write("<form method='post'>"
                     +"<center>"
                   +"number1:- <input type ='number' name='x' value='enter a value'/>"
                     +"<br><br>"
                     +"number2:- <input type ='number' name='y' value='enter a value'/>"
                     +"<br><br>"
                     //+"result:- <input type ='number' name='result' value='result is here'/>"
                     + "HCF <input type='radio' name='r1' value ='hcf'/><br><br>"
                     + "LCM <input type='radio'  name='r1' value ='lcm'/><br><br>"
                     + "DEL <input type='radio'  name='r1' value ='del'/><br><br>"
                     +"<br><br>"
                     + "<input type='submit' value ='calculate'/>"
                     +"</center>"
                     +"</form>");
        //out.write("</form>");
        out.write("</body></html>");
        */
  }

  /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
      
	  // TODO Auto-generated method stub
        doGet(request, response);
        try{
        int x=Integer.parseInt(request.getParameter("x"));
        int y=Integer.parseInt(request.getParameter("y"));
        String manu=request.getParameter("r1");
        
        PrintWriter out = response.getWriter();//enables values dynamically on web page.
        
        out.write("<html><body>");
        
        if(manu.equalsIgnoreCase("HCF"))
        {int gcd=0;
        	for(int i=1; i <= x && i <= y; ++i)
            {
                // Checks if i is factor of both integers
                if(x%i==0 && y%i==0)
                    gcd = i;
            }     
        
        out.write("<h3 align ='center'>"+"hcf of number is"+gcd+"</h3>");
        
        }
        else if(manu.equalsIgnoreCase("LCM"))
        {lcm_logic l=new lcm_logic();
         int lcm=l.lcm_logic1(x, y);
         lcm_db_store l1=new   lcm_db_store();
         response.sendRedirect("http://localhost:8082/MyServlet1/MyServlet2");     
         l1.insertData(Integer.toString(x),Integer.toString(y),Integer.toString(lcm));
        out.write("<h3 align ='center'>"+"lcm is is"+lcm+"</h3>");//
        
        }else
        {
               out.write("<h3 align ='center'>"+"del is"+(x-y)+"</h3>");
        }

        //out.write("<h3 align ='center'>"+"del is"+(x-y)+"</h3>");
        
        out.write("</body></html>");
        
        }
      catch (SQLException e) {
    	  System.out.println(e.getMessage());
         // str = "SQLException error";
      } catch (ClassNotFoundException e) {
          //str = "ClassNotFoundException error";
    	  System.out.println(e.getMessage());
      }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());//PrintWriter out = response.getWriter();
        }
       // response.sendRedirect("http://localhost:8080/Myservlet1/MyServlet1/MyServlet2");    
  }

}

//to redirect to new server create one new servlet MyServlet2 inside MyServlet1 packageand add this line
//response.sendRedirect("http://localhost:8080/Myservlet1/MyServlet2");

