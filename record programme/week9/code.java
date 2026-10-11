import number.Roman;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman numeral: ");
        String roman = sc.nextLine();

        int result = Roman.romanToInteger(roman);

        System.out.println("Integer value: " + result);

        sc.close();
    }
}
