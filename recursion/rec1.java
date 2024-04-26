import java.util.*;

public class rec1 {

	public static void main(String[] args) {
		fun();
	}

	static int cout = 0;

	static void fun() {
		// specified condition
		if (cout == 4) { // base condition := condition used to stop the rec.
			return;
		}
		System.out.println(1);
		cout++;
		fun();

	}
}
