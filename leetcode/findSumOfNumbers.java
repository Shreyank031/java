public class findSumOfNumbers {
	public static void main(String[] args) {
		String input = "ab2jk8lp12";
		System.out.println(find(input));
	}

	static int find(String str) {
		StringBuilder currentNumber = new StringBuilder();
		int sum = 0;

		// you need to convert string to array of characters to interate through
		// enhanced forloop
		for (char ch : str.toCharArray()) {

			// check if the character is digit or not using wraper class Character.isDigit()
			if (Character.isDigit(ch)) {
				currentNumber.append(ch);
			} else {
				if (currentNumber.length() > 0) {
					// convert character to integer for addition
					sum += Integer.parseInt(currentNumber.toString());
					currentNumber.setLength(0);
				}
			}
		}
		if (currentNumber.length() > 0) {
			sum += Integer.parseInt(currentNumber.toString());
		}
		return sum;
	}
}
