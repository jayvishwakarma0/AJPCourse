package ajp_java.sept9;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        NewStudent s1 = new NewStudent(1,"Aman",700);
        NewStudent s2 = new NewStudent(2,"Nimita",740);
        NewStudent s3 = new NewStudent(3,"Ashneer",800);
        NewStudent s4 = new NewStudent(4,"Dipender",600);

        TreeSet<NewStudent> treeSet = new TreeSet<>(new NewComparator());

         treeSet.add(s4);
         treeSet.add(s3);
         treeSet.add(s2);
         treeSet.add(s1);


        for(NewStudent s: treeSet){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
        }
    }
}
