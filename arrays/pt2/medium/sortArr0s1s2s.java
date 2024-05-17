import java.util.*;
public class sortArr0s1s2s {

	public static void main(String[] args) {
		

		int[] arr = { 0, 1, 0, 2, 1, 2 };
		System.out.println(Sub(arr));
	}

	static String Sub(int[] array ) { 

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int n = array.length;

            for (int i = 0; i < n; i++) {
                if (array[i] == 0) {
                    count0++;
                }else if(array[i] == 1) {
                    count1 ++;
                }else {
                    count2++;
                }
            }
            for (int i = 0; i < count0; i++) {
                array[i] = 0;
            }
            for (int i = count0; i < (count0 + count1); i++) {
                array[i] = 1;
            }
            for (int i = count0 + count1; i < n; i++) {
                array[i] = 2;
            }
        return Arrays.toString(array);
    }
}
