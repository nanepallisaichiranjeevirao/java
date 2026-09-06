import java.util.*;

class Example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer");
        }
    }
}
