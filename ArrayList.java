package coll;

//run by: javac -d . Arraylist.java
import java.util.ArrayList;

public class Arraylist {
        public ArrayList<String> car;
        
        public Arraylist() {
                // TODO Auto-generated constructor stub
                car=new ArrayList<String>();
        }
        public void addCars(String carName)
        {
                car.add(carName);
                System.out.println("Data Added!");
        }
        public void deleteCars(String carName)
        {
                int j=0;
                for(int i=0;i<car.size();i++)
                {
                        if(carName.equals(car.get(i)))
                        {
                                j=i;
                                 car.remove(j);
                                break;
                        }
                }
               
                System.out.println("Data Deleted!");
        }
        public void showCarList()
        {
                System.out.println(car);
        }
        
}
        
        

