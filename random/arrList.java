import java.util.*;

public class arrList {
	public static void main(String[] args) {

		ArrayList<Integer> arrList = new ArrayList<>();
		ArrayList<Integer> arr = new ArrayList<>(3);
		arrList.add(0);
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		arrList.add(0, 99);
		arrList.add(0, 999);

		arr.add(11);
		arr.add(12);
		arr.add(13);

		// arr.clear(); clears the list

		arrList.addAll(arr);
		arrList.addAll(0, arr);

		for (int a : arrList) {
			System.out.print(a + " ");
		}
		System.out.println();

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}

	}
}
