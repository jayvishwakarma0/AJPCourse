package aug27;

public class Student {
 private  int Id;
 private  String Name;
 private String College;

 public Student(){}
    public Student(int Id,String Name,String College) {
     this.Id = Id;
        this.Name = Name;
        this.College = College;
    }

    public int getId() {
        return Id;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }

    public void setId(int id) {
        Id = id;
    }


    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", College='" + College + '\'' +
                '}';
    }
}
