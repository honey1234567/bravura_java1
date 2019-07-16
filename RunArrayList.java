
import coll.Arraylist;
import java.util.Scanner;

public class RunArrayList {

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                Scanner scanner=new Scanner(System.in);
                Arraylist arraylist=new Arraylist();
                String str="";
                for(int i=0;i<5;i++)
                {
                        System.out.print("Enter The Car Name "+i+1+" :- ");
                        str=scanner.nextLine();
                        arraylist.addCars(str);
                        str="";
                }
                System.out.print(arraylist.car);
                arraylist.showCarList();//same output as above
        }

}
