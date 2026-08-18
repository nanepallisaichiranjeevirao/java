class Employee {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    // Default constructor
    Employee() {
        name = "Unknown";
        id = 0;
        designation = "Not Assigned";
        salary = 0.0;
        promotionStatus = "Not Decided";
    }

    // Constructor with 2 parameters
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        designation = "Employee";
        salary = 0.0;
        promotionStatus = "Pending";
    }

    // Constructor with 4 parameters
    Employee(String name, int id, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        promotionStatus = "Pending";
    }

    // Constructor with all parameters
    Employee(String name, int id, String designation,
             double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    void display() {
        System.out.println("Name              : " + name);
        System.out.println("ID                : " + id);
        System.out.println("Designation       : " + designation);
        System.out.println("Salary            : " + salary);
        System.out.println("Promotion Status  : " + promotionStatus);
        System.out.println("--------------------------------");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        // Using different overloaded constructors
        Employee e1 = new Employee();

        Employee e2 = new Employee("Ravi", 101);

        Employee e3 = new Employee("Kiran", 102,
                "Manager", 50000);

        Employee e4 = new Employee("Arjun", 103,
                "Team Leader", 65000, "Promoted");

        // Display employee details
        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
