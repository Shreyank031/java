import java.util.*;

public class arr2d {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] array = new int[3][3];
        System.out.println(array.length);

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextInt();
                input.close();
            }

        }
        // output
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 0; row < array.length; row++) {
            System.out.println(Arrays.toString(array[row]));
        }
        System.out.println();
        for (int[] a : array) { // enhanced for loop
            System.out.println(Arrays.toString(a));
        }

    }
}
