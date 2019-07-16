package coll;
import java.util.ArrayList;
class student
{
    public String name;
    public int marks;
    student()//default constructor should always be made whenever you make parametrized constructor.
    {
        name="";
        marks=0;
    }
    student(String name,int marks)
    {
    this.name=name;
    this.marks=marks;
    }
}
//run by: javac -d . Arraylist.java
//import java.util.ArrayList;

public class Arraylist_stu {
        public ArrayList<Student>stu;
        
        public Arraylist_stu() {
                // TODO Auto-generated constructor stub
                stu=new ArrayList<Student>();
        }
        public void addstudent(Student s)
        {
                stu.add(s);
                System.out.println("Data Added!");
        }
        public void deletestudent(Student s)
        {
                int j=0;
                for(int i=0;i<stu.size();i++)
                {
                        if(s.equals(stu.get(i)))
                        {
                                j=i;
                                 stu.remove(j);
                                break;
                        }
                }
               
                System.out.println("Data Deleted!");
        }
        public void showstudent()
        {
                System.out.println(stu);
        }
        
}
        
        

