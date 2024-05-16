import java.util.*;

public class StringFrequency {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = input.nextLine();

        countAndQueryCharacters(str, input);
    }

    static void countAndQueryCharacters(String str, Scanner in) {

        HashMap<Character, Integer> charCount = new HashMap<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        System.out.print("Enter the number of queries: ");
        int q = in.nextInt();

        while (q-- > 0) {
            System.out.print("Enter a character to query: ");
            String query = in.nextLine().trim(); // Read and trim query

            if (query.isEmpty()) {
                System.out.println("Empty query. Please enter a character.");
                continue;
            }

            char ch = query.charAt(0);
            int count = charCount.getOrDefault(ch, 0);
            System.out.println("Frequency of '" + ch + "' is: " + count);
        }
    }
}
