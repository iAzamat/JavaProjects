/*
На вход подаётся последовательность целых чисел. Создайте из этой
последовательности массив чисел, отсортированный по возрастанию, и выведите на печать.

Sample Input:
3 6 2 14 1

Sample Output:
[1, 2, 3, 6, 14]

 */

import java.util.Scanner;
import java.util.Arrays;

public class ex101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] datastr = str.split(" ");
        int n = datastr.length;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.valueOf(datastr[i]);
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
