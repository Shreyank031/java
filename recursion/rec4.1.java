import java.util.*;

public class rec4_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter input: ");
		int num = input.nextInt();
		input.close();
		recc(num, num);
	}

	static void recc(int i, int num) {// both i and num are num
		if (i < 1) {
			System.out.println(); // just to avoid annoying % symbol after execution
			return;
		}
		System.out.print(i + " ");
		recc(--i, num);
	}
}
