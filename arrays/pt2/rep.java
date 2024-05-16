import java.util.*;

public class rep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = in.nextInt();

        System.out.print("Enter the elements of size " + size + " : ");

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        Repo(array, size, in);
    }

    static void Repo(int[] arr, int n, Scanner in) {

        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < n; i++) {

            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print("Enter the query size: ");
        int querySize = in.nextInt();

        System.out.print("Enter the query: ");
        while (querySize-- != 0) {

            int query = in.nextInt();

            System.out.print(hash.getOrDefault(query, 0) + ", ");

        }

    }
}
