package ajp_java.sept9;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int marks;

    public Student(){};
    public Student(int id,String name,int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // method to compare two integer
    @Override
    public int compareTo(Student s2){
        return s2.marks - this.marks;  //descending
    }

    // method to compare two string
//    @Override
//    public int compareTo(Student s2){
//        return this.name.compareTo(s2.name);
//    }
}
