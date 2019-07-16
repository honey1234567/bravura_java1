package collection;



import java.util.Comparator;

class SortByRoll implements Comparator<Student>
{

        @Override
        public int compare(Student a, Student b) {
                // TODO Auto-generated method stub
             /*   if(a.roll>b.roll)
                {
                	return 1;
                }
                else if(a.roll<b.roll)
                {
                	return -1;
                }
                else
                {
                	return 0;
               }
        */
        	return a.roll-b.roll;
        }
}
