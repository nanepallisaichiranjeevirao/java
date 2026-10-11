package basics;

import java.util.Scanner;

//Interface
interface Employee {
 void calculateSalary();
}

//Regular Employee class
class RegularEmployee implements Employee {
 int basic = 25000;
 int hra = 15000;
 int ta = 5000;

 public void calculateSalary() {
     int total = basic + hra + ta;
     System.out.println("Salary Details:");
     System.out.println("Basic Pay: " + basic);
     System.out.println("HRA: " + hra);
     System.out.println("T.A: " + ta);
     System.out.println("Total Amount: " + total);
 }
}

//Contract Employee class
class ContractEmployee implements Employee {
 int basic = 12000;
 int ta = 3000;

 public void calculateSalary() {
     int total = basic + ta;
     System.out.println("Salary Details:");
     System.out.println("Basic Pay: " + basic);
     System.out.println("T.A: " + ta);
     System.out.println("Total Amount: " + total);
 }
}

public class EmployeeDemo {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Employee Id: ");
     String empId = sc.nextLine();

     Employee emp;

     if(empId.startsWith("R")) {
         emp = new RegularEmployee();
     } else if(empId.startsWith("C")) {
         emp = new ContractEmployee();
     } else {
         System.out.println("Invalid Employee Id!");
         sc.close();
         return;
     }

     emp.calculateSalary();
     sc.close();
 }
}
