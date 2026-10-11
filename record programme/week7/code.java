package basics;

import java.util.Scanner;

//Base Class RBI
class RBI {
 public double getRateOfInterest() {
     return 4.0; // Minimum interest rate set by RBI
 }
}

//Derived Class SBI
class SBI extends RBI {
 @Override
 public double getRateOfInterest() {
     return 7.0; // SBI sets its own rate above RBI minimum
 }
}

//Derived Class ICICI
class ICICI extends RBI {
 @Override
 public double getRateOfInterest() {
     return 6.5;
 }
}

//Derived Class PNB
class PNB extends RBI {
 @Override
 public double getRateOfInterest() {
     return 6.0;
 }
}

//Customer class (for demonstration)
class Customer {
 String name;
 String bankName;

 Customer(String name, String bankName) {
     this.name = name;
     this.bankName = bankName;
 }
}

public class BankDemo {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the Bank name to find the rate of Interest : ");
     String bankName = sc.nextLine();

     RBI bank; // Reference of base class

     switch (bankName.toUpperCase()) {
         case "SBI":
             bank = new SBI();
             break;
         case "ICICI":
             bank = new ICICI();
             break;
         case "PNB":
             bank = new PNB();
             break;
         default:
             bank = new RBI();
             break;
     }

     System.out.println(bankName + " rate of interest is : " + bank.getRateOfInterest() + "%");
     sc.close();
 }
}
