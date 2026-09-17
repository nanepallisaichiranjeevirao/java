class ReverseString {
    public static void main(String[] args) {
        String text = "Hello";
        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println(reversed);
    }
}
