import java.util.Arrays;
public class Vararg {

	public static void main(String[] args) {
		
		fun("Hello", "Mello");
		
		multi(3, 5, "mohan", "James", "Drake");

	}
	static void multi(int a, int b, String ...v) {
		System.out.println(a + " " + b + " " + Arrays.toString(v));
	}

	static void fun(String ...v) {
		System.out.println(Arrays.toString(v));
	}

}
