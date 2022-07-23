/*
Дана последовательность целых чисел. Определите минимальную сумму пар
элементов массива, расстояние (разница) между индексами которых равно 2. Если
таких пар нет, выведите 0.


Sample Input:
8 7 6 5 4 3 2

Sample Output:
6

 */

import java.util.Scanner;
import java.util.Arrays;

public class ex104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b = a.split(" ");
        int[] arr = new int[b.length];

        for (int i = 0; i < b.length; i++) {
            arr[i] = Integer.parseInt(b[i]);
        }
        if (arr.length <= 2) {
            System.out.println(0);
        } else {
            Arrays.sort(arr);
            //System.out.println(Arrays.toString(arr));
            System.out.println(arr[0] + arr[2]);
        }
    }
}
