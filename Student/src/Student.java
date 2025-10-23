public class Student {
    private String name;
    private static String college = "abc";
    private int rollno;
    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    public Student() {};
    static void change(){
        college = "CodeGym";
    }
    void display(){
        System.out.println("Name: "+this.name
                +" Rollno: "+this.rollno
                +" College: "+college);
    }
}
