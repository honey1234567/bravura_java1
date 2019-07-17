package JDBC;
	import java.sql.*;  
	class InsertPrepared{  
	public static void main(String args[]){  
	try{  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	  
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle18c","system","password");
	  
	PreparedStatement stmt=con.prepareStatement("insert into student1 values(?,?,?,?)");  
	stmt.setString(1,"ratan");//1 specifies the first parameter in the query  
	stmt.setString(2,"78");  
	stmt.setString(3,"87");
	stmt.setString(4,"98");
	  
	int i=stmt.executeUpdate();  
	System.out.println(i+" records inserted");  
	  
	con.close();  
	  
	}catch(Exception e){ System.out.println(e);}  
	  
	}  
	}  


