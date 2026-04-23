import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    static ArrayList<Student> students = new ArrayList<>();

    public static void addStudent(int id, String name) {
        students.add(new Student(id, name));
        System.out.println("Student Added");
    }

    public static void viewStudents() {
        for (Student s : students) {
            System.out.println(s.id + " " + s.name);
        }
    }

    public static void main(String[] args) {
        addStudent(1, "John");
        addStudent(2, "Kiran");

        viewStudents();
    }
}
