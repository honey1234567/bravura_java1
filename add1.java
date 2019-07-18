package add;

import java.lang.Exception;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import add.add_db;


/**
 * Servlet implementation class add1
 */
@WebServlet("/add1")
public class add1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		try
		{
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String roll=request.getParameter("roll");
		add_db l=new add_db();
   
		l.insertData(name,roll,age);
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
		
	}

}
