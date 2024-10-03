package ajp_java.sept9;

import java.util.Comparator;

public class NewComparator implements Comparator<NewStudent> {
    @Override
    public int compare(NewStudent o1, NewStudent o2) {
       if(o1.getMarks() == o2.getMarks()){
           return 0;
       } else if(o1.getMarks() > o2.getMarks()){
           return 1;
       } else {
           return -1;
       }
    }
}
