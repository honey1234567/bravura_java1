package student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import MyServlet1.lcm_db_store;
//import MyServlet1.lcm_logic;

/**
 * Servlet implementation class student1
 */
@WebServlet("/student1")
public class student1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public student1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   response.setContentType("TEXT/HTML");
	        PrintWriter out = response.getWriter(); 
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
	      
		  // TODO Auto-generated method stub
	        doGet(request, response);
	        
	        response.setContentType("TEXT/HTML");
	        String manu=request.getParameter("r1");
	        
	        PrintWriter out = response.getWriter();//enables values dynamically on web page.
	        
	       // out.write("<html><body>");
	        
	        if(manu.equalsIgnoreCase("add"))
	        {
	        	response.sendRedirect("http://localhost:8083/student/add");  
	        
	        
	        }
	       // out.write("</body></html>");
	  

	        
	         if(manu.equalsIgnoreCase("delete"))
	        {
	        	 response.sendRedirect("http://localhost:8083/student/del");//calling del servelet(del.java)
	        	 
             }
    }
	
}	  
	  /*
}	        }else
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
*/
	


