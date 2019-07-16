package JDBC;



import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class New {
        Connection con;
        Statement stmt;//helps in execute query any particular,when u want to get data from table then executequery,when want to execute any query then executeypdate query
        
        New()
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
//                        con.close();  
 * 
 */
                          
                        }catch(Exception e){ System.out.println(e);} 
                
        }
        public void insertData(String name,String rollno,String age,String marks)
        {
             String query ="insert into Student1 values('"+name+"','"+rollno+"','"+age+"','"+marks+"')";
             //String query1 = ("hf","45","788","yiu");
                          //System.out.println(query);
        try
        {
             stmt.executeUpdate(query);
             System.out.println("Inserted");
        }
        catch (Exception e)
        { // handle execution
             e.printStackTrace();
        }
        
        }
        public void displayData()
        {try{
             
        
             ResultSet rs=stmt.executeQuery("select * from Student1");  
            //  System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7)+"  "+rs.getString(8));  
              while(rs.next())  
              {
                  System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  

              }
        }
        catch(Exception e){ System.out.println(e);} 
        
        }

public static void main(String arg[])
       {
             New se = new New();
             String name = "shreya";
             String age = "17";
             String rollno = "11232";
             String marks = "CSE";
             se.insertData(name,rollno,age,marks);
             se.displayData();
             
             
        }
    
}


        

        

