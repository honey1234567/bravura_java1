
import java.util.ArrayList; 
import java.util.Scanner;
  

    class Data 
    { 
        
        int roll; 
        String name; 
        int marks; 
        long phone; 
  

        Data(int roll, String name, int marks, long phone) 
        { 
  
            this.roll = roll; 
            this.name = name; 
            this.marks = marks; 
            this.phone = phone; 
        } 
    } 
  public class Arraylist_stu
  {
    public static void main(String args[]) 
    { int len=4;
        // suppose the custom input data 
        int roll[] = {1, 2, 3, 4}; 
        String name[] = {"Shubham", "Atul", "Ayush", "Rupesh"}; 
        int marks[] = {100, 99, 93, 94}; 
        long phone[] = {8762357381L, 8762357382L, 8762357383L, 
                        8762357384L 
                       }; 
  
        
        addValues(roll, name, marks, phone,len); 
    } 
  
    public static void addValues(int roll[], String name[], int marks[], 
                          long phone[],int len) 
    { 
        ArrayList<Data> list=new ArrayList<>(); 
  
        for (int i = 0; i < 4; i++) 
        { 
          
            list.add(new Data(roll[i], name[i], marks[i], 
                                              phone[i])); 
        } 
  
        
        printValues(list,len); 
        deletevalues(list,len);
    } 
  
    public static void printValues(ArrayList<Data> list,int len) 
    { 
        
  
        for (int i = 0; i < len; i++) 
        { 
          
  
            Data data = list.get(i); 
  
            
            System.out.println(data.roll+" "+data.name+" "
                               +data.marks+" "+data.phone); 
        } 
    } 
    public static void deletevalues(ArrayList<Data> list,int len)
    {Scanner sc=new Scanner(System.in);
     System.out.println("Enter name you want to delete all data");
     String n=sc.nextLine();
     for(int i=0;i<4;i++)
     {Data data=list.get(i);
        if(n.equals(data.name))
        {
            list.remove(i);
            len--;
            break;
        }
     }

      printValues(list,len); 


    }
} 