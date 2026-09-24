import java.util.Scanner;
class Student {
    private int rollNumber;
    private String studentName;
    private int[] marks;
    Student(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }
    int calculateTotal() {
        int total = 0;
        for (int mark : marks) total += mark;
        return total;
    }
    double calculateAverage() {
        return calculateTotal() / (double) marks.length;
    }
    int findHighest() {
        int highest = marks[0];
        for (int mark : marks) highest = Math.max(highest, mark);
        return highest;
    }
    int findLowest() {
        int lowest = marks[0];
        for (int mark : marks) lowest = Math.min(lowest, mark);
        return lowest;
    }
    double calculatePercentage() {
        double p = (calculateTotal() / (marks.length * 100.0)) * 100;
        return Math.round(p * 100.0) / 100.0;
    }
    String determineGrade() {
        double p = calculatePercentage();
        if (p >= 90) return "A+";
        else if (p >= 80) return "A";
        else if (p >= 70) return "B";
        else if (p >= 60) return "C";
        else if (p >= 50) return "D";
        else return "F";
    }
    String getRemark() {
        switch (determineGrade()) {
            case "A+": return "Outstanding Performance";
            case "A":  return "Excellent Performance";
            case "B":  return "Very Good Performance";
            case "C":  return "Good Performance";
            case "D":  return "Satisfactory Performance";
            default:   return "Needs Improvement";
        }
    }
    void displayDetails() {
        String formattedName = studentName.trim().toUpperCase();
        System.out.println("\n===== STUDENT PERFORMANCE REPORT =====");
        System.out.println("Roll Number       : " + rollNumber);
        System.out.println("Student Name      : " + formattedName);
        System.out.println("Name Length       : " + formattedName.length());
        for (int i = 0; i < marks.length; i++)
            System.out.println("Subject " + (i + 1) + "          : " + marks[i]);
        System.out.println("Total Marks       : " + calculateTotal());
        System.out.printf("Average Marks     : %.2f%n", calculateAverage());
        System.out.println("Highest Mark      : " + findHighest());
        System.out.println("Lowest Mark       : " + findLowest());
        System.out.printf("Percentage        : %.2f%%%n", calculatePercentage());
        System.out.println("Grade             : " + determineGrade());
        System.out.println("Result            : " +
            (calculatePercentage() >= 50 ? "PASS" : "FAIL"));
        System.out.println("Performance Remark: " + getRemark());
    }
}
public class StudentPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        Student student = new Student(roll, name, marks);
        student.displayDetails();
        sc.close();
    }
}

