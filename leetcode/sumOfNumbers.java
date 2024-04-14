public class sumOfNumbers {
	public static void main(String[] args) {

		String str = "A2B31J8L9";

		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			// Convert a string into character
			char ch = str.charAt(i);

			// check whether a character is integer or not using wraper class of character
			// and method isDigit
			if (Character.isDigit(ch)) {
				sum += Integer.parseInt("" + ch);
			}
		}
		System.out.println(sum);
	}
}
