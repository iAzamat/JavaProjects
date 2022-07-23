/*
На вход подаётся целое число n > 1. Сформируйте массив чётных чисел от 2 до n
(включительно).

Выведите на печать массив в одной строке, через пробел.

Посчитайте и выведите на печать сумму элементов массива.

Sample Input:
10

Sample Output:
2 4 6 8 10
30

 */

import java.util.Scanner;

public class ex097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n / 2];
        int k = 0;
        for (int i = 0; i < n / 2; i++) {
            k += 2;
            numbers[i] = k;
        }
        int sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
            sum += numbers[j];
        }
        //System.out.println();
        System.out.println("\b");
        System.out.println(sum);

    }
}
