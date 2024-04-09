import java.util.*;

public class arr {

	public static void main(String args[]) {

		int[] name = new int[4];
		Scanner input = new Scanner(System.in);

		// input using for loop
		for (int i = 0; i < name.length; i++) {
			name[i] = input.nextInt();
		}

		System.out.println(Arrays.toString(name));

		// for (int i = 0; i < name.length; i++) {
		// System.out.print(name[i] + " ");
		// }
	}
}
