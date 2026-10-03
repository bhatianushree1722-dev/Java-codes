```java
class Student {
    String name;
    int rollNo;
    String course;

    Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

// Undergraduate class inherits Student
class Undergraduate extends Student {
    int year;

    Undergraduate(String name, int rollNo, String course, int year) {
        super(name, rollNo, course);
        this.year = year;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Academic Status: Undergraduate");
        System.out.println("Year: " + year);
    }
}

// Graduate class inherits Student
class Graduate extends Student {
    String specialization;

    Graduate(String name, int rollNo, String course, String specialization) {
        super(name, rollNo, course);
        this.specialization = specialization;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Academic Status: Graduate");
        System.out.println("Specialization: " + specialization);
    }
}

public class Main {
    public static void main(String[] args) {

        Undergraduate u = new Undergraduate(
            "Om", 101, "Computer Science", 3
        );

        Graduate g = new Graduate(
            "Rahul", 201, "Computer Science", "Artificial Intelligence"
        );

        System.out.println("----- Undergraduate Student -----");
        u.displayDetails();

        System.out.println("\n----- Graduate Student -----");
        g.displayDetails();
    }
}
```