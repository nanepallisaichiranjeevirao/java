import java.util.*;

public class LetterCombinations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits: ");
        String digits = sc.nextLine();

        List<String> result = new ArrayList<>();

        String[] phone = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        if (digits.length() == 0) {
            System.out.println("[]");
            return;
        }

        result.add("");

        for (int i = 0; i < digits.length(); i++) {

            int digit = digits.charAt(i) - '0';

            List<String> current = new ArrayList<>();

            for (String combination : result) {

                for (char letter : phone[digit].toCharArray()) {
                    current.add(combination + letter);
                }
            }

            result = current;
        }

        System.out.println("Letter combinations:");

        for (String combination : result) {
            System.out.print(combination + " ");
        }

        sc.close();
    }
}
