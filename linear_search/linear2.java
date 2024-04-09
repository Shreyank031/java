import java.util.Arrays;

public class linear2 {
	public static void main(String[] args) {
		// Input string and target character
		String string = "Shreyank";
		char target = 'a';

		// Call the linear search method and print the result
		boolean ans = linear(string, target);
		System.out.println(ans);

		// Call the linear search method using enhanced for loop and print the result
		System.out.println("\n" + linearr(string, target));
	}

	// Method to perform linear search using a for loop
	static boolean linear(String str, char target) {
		// Check if the string is empty
		if (str.length() == 0) {
			return false;
		}

		// Iterate through each character of the string
		for (int i = 0; i < str.length(); i++) {
			// Check if the current character matches the target character
			if (target == str.charAt(i)) {
				return true;
			}
		}

		return false; // Return false if target is not found
	}

	// Method to perform linear search using enhanced for loop
	static boolean linearr(String str, char target) {
		// Check if the string is empty
		if (str.length() == 0) {
			return false;
		}

		// Iterate through each character of the string using enhanced for loop
		for (char ch : str.toCharArray()) {
			// Check if the current character matches the target character
			if (ch == target) {
				return true;
			}
		}

		return false; // Return false if target is not found
	}
}
