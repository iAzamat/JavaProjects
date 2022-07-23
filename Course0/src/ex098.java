/*
На вход подаётся целое число n - длина последовательности,
а затем сама последовательность целых чисел.
Выведите на печать все числа, большие предыдущего числа.

Sample Input:
7
8 3 6 3 4 3 12

Sample Output:
6 4 12

 */

import java.util.Scanner;

public class ex098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int j = 0; j < numbers.length; j++) {
            if (j > 0 && numbers[j] > numbers[j - 1]) {
                System.out.print(numbers[j] + " ");
            }
        }
        System.out.println();

    }
}
