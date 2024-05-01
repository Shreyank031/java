import java.util.*;

public class parameterisedRec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter input: ");
		int i = input.nextInt();
		input.close();
		int sum = 0;
		recc(i, sum);
	}

	static void recc(int i, int sum) {// both i and num are num
		if (i < 1) {
			System.out.println(sum);
			return;
		}
		recc(i - 1, sum + i);
	}
}
