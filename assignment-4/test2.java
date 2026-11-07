class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    double salary;
    int year;
    String insuranceNumber;

    Employee(String name, double salary, int year, String insuranceNumber) {
        super(name);

        this.salary = salary;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Year: " + year);
        System.out.println("Insurance Number: " + insuranceNumber);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee("Rahul", 50000, 2024, "INS123");

        e.display();
    }
}