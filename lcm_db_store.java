package MyServlet1;
/*
 * 
 * 
 * 
 * import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

 */
import java.lang.Exception;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
//import java.sql.Connection;
import java.sql.Driver;
//import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.Statement;
public class lcm_db_store {
    Connection con;
    Statement stmt;//helps in execute query any particular,when u want to get data from table then executequery,when want to execute any query then executeypdate query
    
    lcm_db_store()
    {
            createConnect();
            
            
    }
   public void createConnect()
    {
            try{  
                    //step1 load the driver class  
                    Class.forName("oracle.jdbc.driver.OracleDriver");  
                      
                    //step2 create  the connection object  
                    con=DriverManager.getConnection(  
                    "jdbc:oracle:thin:@localhost:1521:oracle18c","system","password");  
                      
                    //step3 create the statement object  
                    stmt=con.createStatement();  
                    /*  
                    //step4 execute query  
                    //ResultSet rs=stmt.executeQuery("select * from Student");  
                  //  System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7)+"  "+rs.getString(8));  
                   // while(rs.next())  
                    {
                        System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  

                    }
                    //step5 close the connection object  
//                    con.close();  
* 
*/
                      
                    }catch(Exception e){ System.out.println(e);} 
            
    }
    public void insertData(String num1,String num2,String res)throws SQLException,ClassNotFoundException
    {
         String query ="insert into lcm2 values('"+num1+"','"+num2+"','"+res+"')";
         //String query1 = ("hf","45","788","yiu");
                      //System.out.println(query);
    try
    { Class.forName("oracle.jdbc.driver.OracleDriver");  
    
  //step2 create  the connection object  
  con=DriverManager.getConnection(  
  "jdbc:oracle:thin:@localhost:1521:oracle18c","system","password");  
    
  //step3 create the statement object  
  stmt=con.createStatement();  
         stmt.executeUpdate(query);
         System.out.println("Inserted");
         con.close();
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