package sept9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        Student s1 = new Student(1,"Aman",700);
//        Student s2 = new Student(2,"Nimita",740);
//        Student s3 = new Student(3,"Ashneer",800);
//        Student s4 = new Student(4,"Dipender",600);
//
//        List<Student> list = new ArrayList<>();
//        list.add(s4);
//        list.add(s3);
//        list.add(s2);
//        list.add(s1);
//
//        for(Student s: list){
//            System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
//        }
//        System.out.println();
//
//        Collections.sort(list);
//
//        for(Student s: list){
//            System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
//        }

        NewStudent s1 = new NewStudent(1,"Aman",700);
        NewStudent s2 = new NewStudent(2,"Nimita",740);
        NewStudent s3 = new NewStudent(3,"Ashneer",800);
        NewStudent s4 = new NewStudent(4,"Dipender",600);


        List<NewStudent> list2 = new ArrayList<>();
        list2.add(s4);
        list2.add(s3);
        list2.add(s2);
        list2.add(s1);

        for(NewStudent s: list2){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
        }
        System.out.println();

        Collections.sort(list2,new NewComparator());

        for(NewStudent s: list2){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
        }
    }
}
