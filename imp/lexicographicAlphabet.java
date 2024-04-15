public class LexicographicAlphabet {
	public static void main(String[] args) {
		String name = "ShreyankzZ";
		System.out.println(aplh(name));
	}

	static String aplh(String name) {
		StringBuilder result = new StringBuilder();
		char nextChar;

		// for (int i = 0; i < name.length(); i++) {
		// char ch = name.charAt(i);
		for (char ch : name.toCharArray()) {
			if (ch == 'z') {
				nextChar = 'a';
			} else if (ch == 'Z') {
				nextChar = 'A';
			} else {
				nextChar = (char) (ch + 1);
			}
			result.append(nextChar);
		}
		return result.toString();
	}
}
