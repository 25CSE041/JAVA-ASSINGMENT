class Person {
    String name, dob;

    Person(String n, String d) {
        name = n;
        dob = d;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob);
    }
}

class Teacher extends Person {
    double salary;
    String subject;

    Teacher(String n, String d, double s, String sub) {
        super(n, d);
        salary = s;
        subject = sub;
    }

    void display() {
        super.display();
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
    }
}

class CollegeStudent extends Person {
    String collegeName;
    int year;

    CollegeStudent(String n, String d, String c, int y) {
        super(n, d);
        collegeName = c;
        year = y;
    }

    void display() {
        super.display();
        System.out.println("College Name: " + collegeName);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {

        Teacher t = new Teacher("Rahul", "12-05-1990", 50000, "Java");

        CollegeStudent s = new CollegeStudent(
            "Amit", "15-08-2005", "GIET University", 2
        );

        System.out.println("----- Teacher Details -----");
        t.display();

        System.out.println("\n----- Student Details -----");
        s.display();
    }
}