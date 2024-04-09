import java.util.Arrays;
import java.util.Scanner;

public class exp {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int ar[] = new int[5];
		for (int i = 0;i<ar.length;i++) {
			ar[i] = in.nextInt(); 
			System.out.print(ar[i] + " "); }
		in.close(); 
		
		System.out.println();
		for(int num : ar) {
			System.out.print(num + " "); }
	
		System.out.println(Arrays.toString(ar));
		for (int i = 0;i<ar.length;i++) {
			System.out.print(ar[i] + " "); }
}
}
