import java.util.*;

public class backtracking1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter input: ");
		int num = input.nextInt();
		input.close();
		int i = 1;
		recc(i, num);
	}

	static void recc(int i, int num) {// both i and num are num
		if (i > num) {
			return;
		}
		recc(i + 1, num);
		System.out.println(i);
	}
}
