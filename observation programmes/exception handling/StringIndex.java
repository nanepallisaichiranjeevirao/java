public class StringIndex {
    public static void main(String[] args) {
        try {
            String text = "Java";
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index is invalid.");
        }
    }
}
