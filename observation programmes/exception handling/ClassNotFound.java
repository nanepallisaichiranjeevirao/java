public class ClassNotFound{
    public static void main(String[] args) {
        try {
            Class.forName("UnknownClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}
