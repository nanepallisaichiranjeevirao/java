package exceptionex;
import java.util.Arrays;
import java.util.Iterator;

public class IllegalState {
    public static void main(String[] args) {
        try {
            
            Iterator<Integer> it = Arrays.asList(1, 2, 3).iterator();

            
            it.remove(); 
        } catch (IllegalStateException e) {
            System.out.println("Caught IllegalStateException: " + e.getMessage());
        }
    }
}
