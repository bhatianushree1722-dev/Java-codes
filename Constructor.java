```java
class Student {
    String name;

    // Default constructor
    Student() {
        name = "Unknown";
    }

    // Parameterized constructor
    Student(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Om");

        s1.printName();
        s2.printName();
    }
}
```