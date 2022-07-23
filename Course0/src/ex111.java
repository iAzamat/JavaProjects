/*
На ввод подаётся последовательность целых чисел. Выведите те из них,
которые встречаются в последовательности только один раз.
Числа нужно вывести в одной строке, через пробел, в том же порядке,
как они поступили на ввод.

Sample Input:
16 3 0 3 2 11 2

Sample Output:
16 0 11

 */

import java.util.Scanner;

public class ex111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        for (String el : arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(el)) count++;
            }
            if (count == 1) System.out.print(el + " ");
        }
    }
}
