public class Str {
	public static void main(String[] args) {

		String a = "Shrey";
		String b = "Shrey";

		String a1 = new String("Sh");
		String a2 = new String("Sh");

		System.out.println(a == b);// The reference var should be pointing to the same object
		System.out.println(a1 == a2); // Here we have created a new object using `new` keyword

		System.out.println(a.equals(b)); // .equals is a method which only cares about values
		System.out.println(a1.equals(a2));

	}

}
