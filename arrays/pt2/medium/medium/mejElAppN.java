import java.util.*;
public class  mejElAppN{

	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 3, 2, 2, 2};
		System.out.println(Sub(arr));
	}

	static int Sub(int[] array ) { 
        
        int n = array.length;
        for (int i = 0; i < n; i++) {
            
            int count = 0;
            for (int j = 0; j< n; j++) {
                if (array[j] == array[i]) {
                    count ++;
                }
            }
                if (count > n/2) {
                    return count;
                }
        }
        return -1;
    }
}
