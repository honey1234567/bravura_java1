import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_CLASS {
       private Connection con;
       private Statement stmt;
        JDBC_CLASS()
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
                          
                        //step4 execute query 
                        //Alwayscommit table in database
                        //number(>6)=getDouble();
                        //getString("name")=getString(1)
                        //Do not insert values in database of primary column by query
                        ResultSet rs=stmt.executeQuery("select * from student1");  
                        //System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  
                        while(rs.next())  
                        {
                        	System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  
                        	
                        }
                        //step5 close the connection object  
                        con.close();  
                          
                        }catch(Exception e){ System.out.println(e);} 
        }
        public static void main(String args[])
        {   JDBC_CLASS j=new JDBC_CLASS();
           // j.createConnect();
        	
        }
}

