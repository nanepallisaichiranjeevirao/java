import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Display elements
        System.out.println("Elements: " + numbers);

        // Adding another element
        numbers.add(40);

        System.out.println("After adding: " + numbers);

        // Removing an element
        numbers.remove(1);

        System.out.println("After removing: " + numbers);
    }
}
