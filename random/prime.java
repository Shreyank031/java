package random;

import java.util.*;

public class prime {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println(isPrime(number));
        if (isPrime(number) == true) {
            System.out.println("The number " + number + " is PRIME !");
        } else {
            System.out.println("The number " + number + " is NOT PRIME!");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        int c = 2;
        while (c * c < num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > num;
    }

}
