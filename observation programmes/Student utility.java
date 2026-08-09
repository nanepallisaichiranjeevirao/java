import java.util.Scanner;

public class StudentUtilityProgram {

    // Factorial Method
    static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    // Prime Method
    static boolean isPrime(int n) {
        if(n <= 1)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    // Maximum Method
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Area of Circle Method
    static double areaCircle(double r) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Part A
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks in 3 Subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("\nStudent Details");
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Total : " + total);
        System.out.println("Percentage : " + percentage);

        // Even or Odd
        System.out.print("\nEnter Number: ");
        int num = sc.nextInt();

        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        // Largest of Three Numbers
        System.out.print("Enter Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest = " + largest);

        // Grade
        if(percentage >= 90)
            System.out.println("Grade A");
        else if(percentage >= 75)
            System.out.println("Grade B");
        else if(percentage >= 60)
            System.out.println("Grade C");
        else
            System.out.println("Grade D");

        // Switch
        System.out.print("Enter Day Number (1-7): ");
        int day = sc.nextInt();

        switch(day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid Day");
        }

        // Multiplication Table
        System.out.print("Enter Number for Table: ");
        int table = sc.nextInt();

        for(int i = 1; i <= 10; i++)
            System.out.println(table + " x " + i + " = " + (table * i));

        // Numbers 1 to N
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
            System.out.print(i + " ");

        // Sum of N Numbers
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum += i;

        System.out.println("\nSum = " + sum);

        // Fibonacci
        int f1 = 0, f2 = 1;

        System.out.println("Fibonacci Series:");
        for(int i = 1; i <= n; i++) {
            System.out.print(f1 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }

        // Methods
        System.out.println("\nFactorial = " + factorial(5));
        System.out.println("Prime = " + isPrime(17));
        System.out.println("Maximum = " + max(15, 20));
        System.out.println("Area = " + areaCircle(5));
    }
}
