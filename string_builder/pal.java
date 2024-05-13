public class Pal {
	public static void main(String[] args) {

		String str = "Abcdcba";
		// String str = null;
		// String str = "";

		System.out.println(pal(str));
	}

	static boolean pal(String str) {

		if (str == null || str == "") { // if the string is empty or null then return true
			return true;
		}
		str = str.toLowerCase();
		for (int i = 0; i <= str.length() / 2; i++) {

			char start = str.charAt(i);
			char end = str.charAt(str.length() - 1 - i);

			if (start != end) {
				return false;
			}
		}
		return true;
	}
}
