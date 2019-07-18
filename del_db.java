package delete;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import java.lang.Exception;
import java.sql.SQLException;


//import java.sql.Connection;
import java.sql.Driver;
//import java.sql.DriverManager;

public class del_db {
	 private String name;
     private String age;
     private String roll;
     Connection con;
     Statement stmt;//
    
     public del_db()
     {
    	name="";
    	age="";
    	roll="";
     }
     //Setter or Value Setter
     public del_db(String name,String roll,String age)
     {
             this.name=name;
             this.age=age;
             this.roll=roll;
             //insertData(this.name,this.age,this.roll);
           
     }
     public void deleteData(String num1,String num2,String res)throws SQLException,ClassNotFoundException{
    	
    	    
    	         String query ="delete from lcm2 where NUM1='"+num1+"'";
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
    	         System.out.println("deleted");
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
  



