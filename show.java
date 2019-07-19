package show;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class show
 */
@WebServlet("/show")


public class show extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public show() {
        super();
        // TODO Auto-generated constructor stub
    }//Note:= by default doget is called but if you specify method as post in the form then post will be called
       public void doGet(HttpServletRequest request, HttpServletResponse response)
                     throws ServletException, IOException {
    	   response.setContentType("TEXT/HTML");
              PrintWriter out = response.getWriter(); 
  
              try{
                  Class.forName("oracle.jdbc.driver.OracleDriver");
                  Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:oracle18c","system","password");                 
                  Statement stmt=con.createStatement();
                  out.write("<html><body>");
                  out.write("<table width=25% border=1>");
                  out.write("<center><h1>Result:</h1></center>");
                  ResultSet rs=stmt.executeQuery("select * from lcm2"); 
                                 
                  //Printing column names 
                  ResultSetMetaData rsmd=rs.getMetaData();
                  while(rs.next())
                     {
                  out.write("<tr>");
                  out.write("<td>"+rsmd.getColumnName(1)+"</td>");
                     out.write("<td>"+rs.getString(1)+"</td></tr>");
                     out.write("<tr><td>"+rsmd.getColumnName(2)+"</td>");
                     out.write("<td>"+rs.getString(2)+"</td></tr>");
                     out.write("<tr><td>"+rsmd.getColumnName(3)+"</td>");
                     out.write("<td>"+rs.getString(3)+"</td></tr>");                  
                  }
                  out.write("</table>");
                  out.write("</body></html>");

           }catch (Exception e2)
             {
                 e2.printStackTrace();
             }
           
              //response.setContentType("TEXT/HTML");
 
 
} 

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
 	      
 		  // TODO Auto-generated method stub
//doGet(request, response);

}
}