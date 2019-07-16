import java.lang.Exception;
import java.util.Scanner;
class Student
{
        private String name;
        private String age;
        private String course;
        private String DOB;
        private String Phone_no;
        
        //Setter or Value Setter
        public Student(String name,String age,String course,String DOB,String Phone_no)
        {
                this.name=name;
                this.age=age;
                this.course=course;
                this.DOB=DOB;
                this.Phone_no=Phone_no;
        }
        public String get_Name()
        {
                return name;
        }
        public String get_Age()
        {
                return age;
        }
        public String get_Course()
        {
                return course;
        }
        public String get_DOB()
        {
                return DOB;
        }
        public String Phone_No()
        {
                return Phone_no;
        }
}
class StdExp extends Exception
{
        String error_msg;
        public StdExp(String error_msg)
        {
                super(error_msg);
                this.error_msg=error_msg;
                //System.out.println(super.getMessage());        
        }
        public void getError()
        {
                System.out.println(error_msg);
        }
}
class RunStudent_exp
{
        static void raiseExp() throws StdExp
        {
                        throw new StdExp("Data not Entered!");
        }
        public static void main(String arg[])
        {
                Scanner sc=new Scanner(System.in);
                String name,age,course,DOB,phone;
                try{
                                System.out.print("Enter Name:-");
                                name=sc.nextLine();
                                if(name.length()==0)
                                {
                                        raiseExp();
                                }
                                System.out.print("Enter Age:-");
                                age=sc.nextLine();
                                if(age.length()==0)
                                {
                                        raiseExp();
                                }
                                System.out.print("Enter Course:-");
                                course=sc.nextLine();
                                if(course.length()==0)
                                {
                                        raiseExp();
                                }
                                System.out.print("Enter DOB:-");
                                DOB=sc.nextLine();
                                if(DOB.length()==0)
                                {
                                        raiseExp();
                                }
                                System.out.print("Enter Phone:-");
                                phone=sc.nextLine();
                                if(phone.length()==0)
                                {
                                        raiseExp();
                                }
                                //Data set Is Complete,So add To Class
                                Student std=new Student(name,age,course,DOB,phone);
                                System.out.println("Student Name:- "+std.get_Name());
                                System.out.println("Student Age:- "+std.get_Age());
                                System.out.println("Student Course:- "+std.get_Course());
                                System.out.println("Student DOB:- "+std.get_DOB());
                                System.out.println("Student Phone NO:- "+std.Phone_No());
                   }catch(StdExp e)
                           {
                                        e.getError(); 
                        } 
        }
}