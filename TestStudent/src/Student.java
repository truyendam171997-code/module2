public class Student {
    public Student(String name, String classroom) {
        this.name = name;
        this.classroom = classroom;
    }

    private String name = "jonh";
    private String classroom = "10A";

    public Student() {}

    public String setName(String name) {
        return this.name = name;
    }
    public String setlassroom(String classroom) {
        return this.classroom = classroom;
    }
    public String getInfo() {
        return "Name: " + this.name + ", Classroom: " + this.classroom;
    }

}
