import java.util.*;

public class rec3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter input: ");
		int num = input.nextInt();
		input.close();
		int i = 1;
		recc(i, num);
	}

	static void recc(int i, int num) {
		if (i > num) {
			System.out.println(); // just to avoid annoying % symbol after execution
			return;
		}
		System.out.print(i + " ");
		recc(++i, num);
	}

}
