import java.util.Scanner;

// User-defined exception
class LengthNotSufficientException extends Exception {

    public LengthNotSufficientException(String message) {
        super(message);
    }
}

public class MobileNumberValidation {

    static void validateMobileNumber(String number)
            throws LengthNotSufficientException {

        try {
            // Check for characters other than digits
            for (int i = 0; i < number.length(); i++) {
                if (!Character.isDigit(number.charAt(i))) {
                    throw new NumberFormatException();
                }
            }

            // Check if length is greater than 10
            if (number.length() > 10) {
                int[] arr = new int[10];
                for (int i = 0; i < number.length(); i++) {
                    arr[i] = Character.getNumericValue(number.charAt(i));
                }
            }

            // Check if length is less than 10
            if (number.length() < 10) {
                throw new LengthNotSufficientException(
                    "Invalid Mobile Number – LengthNotSufficientException"
                );
            }

            System.out.println("Valid number");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                "Invalid Mobile Number-ArrayIndexOutOfBounds Exception"
            );

        } catch (NumberFormatException e) {

            System.out.println(
                "Invalid Mobile Number –NumberFormatException"
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String number = sc.nextLine();

        try {
            validateMobileNumber(number);
        } catch (LengthNotSufficientException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("Validation completed.");
        }
    }
}
