public class NumberFormatExample {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("hello");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}
