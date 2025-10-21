package src;

public class Student {
    private String name;
    private String birthday;
    private String address;

    public Student(String name, String birthday, String address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }
    public Student(){}
    public String getName() {
        return name;
    }
    public String getinfo () {
        return "Name: " + name + "\n" + "Birthday: " + birthday + "\n" + "Address: " + address;
    }
}
