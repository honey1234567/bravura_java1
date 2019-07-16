import java.util.Scanner;
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
 
  public student[] sort_object(student stu[])
 {
 	int i, j;
 	student temp; 
       for(i=0; i<stu.length-i;i++) 
           {  
               for(j=0; j<stu.length-i-1;j++) 
                   { 
                        if(stu[j].marks>stu[j+1].marks) 
                          { 
                               temp = stu[j]; 
                               stu[j] = stu[j+1]; 
                               stu[j+1] = temp; 
                          } 
                   } 
           } 
   
          return stu;
 }
  
 public void  display(student stu[])
 {
 	for(int i=0;i<3;i++)
 	{


 	System.out.print(stu[i].name);
 	System.out.print(" "+ stu[i].marks);
 

 }
}

}
class sort_student
{

	public static void main(String args[])
	{Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
	  student[] studentArray = new student[3];
	  for(int i=0;i<3;i++)
	  {System.out.println("enter name");
	    String n=sc.nextLine();
	    System.out.println("enter marks");
        int m=sc1.nextInt();
	  	studentArray[i]=new student(n,m);
	  }
	  student s=new student();
	  /*
int i, j;
 	student temp; 
       for(i=0; i<studentArray.length-i;i++) 
           {  
               for(j=0; j<studentArray.length-i-1;j++) 
                   { 
                        if(studentArray[j].marks>studentArray[j+1].marks) 
                          { 
                               temp = studentArray[j]; 
                               studentArray[j] =	studentArray[j+1]; 
                               studentArray[j+1] = temp; 
                          } 
                   } 
           } 
	 */

      studentArray=s.sort_object(studentArray);
      s.display(studentArray);
	
	}
}
//note:-this error would come when you will declare an array beyond the element range as in this case when no. of students would be 3 and you declare 
// student array by >3