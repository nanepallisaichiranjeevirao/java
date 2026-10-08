package exceptionex;

public class Interrupted {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error: Thread is interrupted");
        }
    }
}
