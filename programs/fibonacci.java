import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the index number : ");
		int n = in.nextInt();
		in.close();
		int a = 0;
		int b = 1;
		int count = 2;

		while(count<n) {
			int temp = b;
			b += a;
			a = temp;
			count ++;
		}
		System.out.println("The fibonacci number at index " + n + " is " + b );

	}
}
