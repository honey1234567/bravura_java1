package collection;

import java.util.Comparator;

class SortByName implements Comparator<Student>
{

        @Override
        public int compare(Student a, Student b) {
                // TODO Auto-generated method stub
        	// in case of string  cmparision follow this technique
                return a.Name.compareTo(b.Name); 
        }
} 