package JDBC;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
class student {
	 private String name;
     private String age;
     private String roll;
     private String[] marks=new String[1];
     public student()
     {
    	 
     }
     //Setter or Value Setter
     public student(String name,String roll,String age,String marks[])
     {
             this.name=name;
             this.age=age;
             this.roll=roll;
             for(int i=0;i<1;i++)
             {
            	 this.marks[i]=marks[i];
             }
     }
     public void display()
     {
    	 System.out.println("name" + name+"age"+ age+"roll no." +roll+ "marks" +marks[0]);
    	 
     }

}
public class stu_db
{
	public static void main(String args[])
	{  
		 Connection con;
	     Statement stmt;
		for(int i=0;i<3;i++)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name age roll no and marks");
		String name=sc.nextLine();
		String age=sc.nextLine();
		String roll=sc.nextLine();
		String mar[]=new String[1];
		mar[0]=sc.nextLine();
		student s=new student(name,roll,age,mar);
		 try{  
             //step1 load the driver class  
             Class.forName("oracle.jdbc.driver.OracleDriver");  
               
             //step2 create  the connection object  
             con=DriverManager.getConnection(  
             "jdbc:oracle:thin:@localhost:1521:oracle18c","system","password");  
               
             //step3 create the statement object  
             stmt=con.createStatement();  
               
             //step4 execute query  
            
           //in case of int use("+intvar+")
            	
               stmt.executeUpdate("INSERT INTO student1 " + "VALUES ('"+name+"','"+roll+"','"+age+"','"+mar[0]+"')");
                s.display();
             	System.out.println("value inserted"); 
             	 String sql = "UPDATE student1 " +
                         "SET age = 30 WHERE name='shreya'";
             	 
               stmt.executeUpdate(sql);
               System.out.println("updated");
               String sql1 = "DELETE FROM student1 " +
                       "WHERE name = 'shreya'";
                 stmt.executeUpdate(sql1);
                 System.out.println("value deleted");
                 System.out.println("values are");
                 ResultSet rs=stmt.executeQuery("select * from student1");  
                 //System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  
                 while(rs.next())  
                 {
                 	System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  
                 	
                 }
              
             //step5 close the connection object  
             con.close();
             //jdbc commits automatically
               
             }catch(Exception e){ System.out.println(e);} 
		
	}
	}
}
