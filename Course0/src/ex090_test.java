/*
На вход подаётся целое число. Выведите его максимальную цифру.

Sample Input:
12345

Sample Output:
5

 */

import java.util.Scanner;

public class ex090_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = Math.abs(sc.nextInt());
        int maxDigit;
        maxDigit = (int) (number % 10);
        while (number > 0) {
            int curDigit = (int) (number % 10);
            if (curDigit > maxDigit)
                maxDigit = curDigit;
            number /= 10;
        }

        System.out.println(maxDigit);
    }
}
