import java.util.Scanner;


class InvalidMobileNumberException extends Exception {
    public InvalidMobileNumberException(String message) {
        super(message);
    }
}

public class MobileNumberValidator {

 
    public static void validateMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
       
        if (mobileNumber.length() != 10) {
            throw new InvalidMobileNumberException("Invalid Length: Mobile number must be exactly 10 digits.");
        }

       
        for (int i = 0; i < mobileNumber.length(); i++) {
            char ch = mobileNumber.charAt(i);
            if (ch < '0' || ch > '9') {
                throw new InvalidMobileNumberException("Invalid Character: Mobile number must contain only numeric digits.");
            }
        }

     
        char firstDigit = mobileNumber.charAt(0);
        if (firstDigit < '6' || firstDigit > '9') {
            throw new InvalidMobileNumberException("Invalid Format: Mobile number should start with 6, 7, 8, or 9.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Mobile Number: ");
        String mobileNumber = scanner.nextLine().trim();

       
        try {
            validateMobileNumber(mobileNumber);
            System.out.println("Success: " + mobileNumber + " is a valid mobile number.");
        } catch (InvalidMobileNumberException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

