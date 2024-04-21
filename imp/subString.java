public class subString {
	public static void main(String[] args) {
		// DarkKnightRises = Knight
		String java = "DarkKnightRises";
		System.out.println(sub(java));
	}

	static String sub(String str) {
		String a = str.substring(4, 10);
		return a;
	}
}
