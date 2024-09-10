package aug27;

public class Test {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.setId(23);
       s1.setName("Jay");
       s1.setCollege("SATI");

        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getCollege());
    }
}
