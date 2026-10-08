public class NegativeArrayExample {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Array size cannot be negative.");
        }
    }
}
