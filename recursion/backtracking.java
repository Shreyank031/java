import java.util.*;

public class backtracking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter input: ");
		int num = input.nextInt();
		input.close();
		recc(num, num);
	}

	static void recc(int i, int num) {// both i and num are num
		if (i < 1) {
			return;
		}
		recc(i - 1, num);
		System.out.println(i);
	}
}
