package Models;

public class Student {
    private String name;
    private String grade;
    private String address;

    public Student(String name, String grade, String address) {
        this.name = name;
        this.grade = grade;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
