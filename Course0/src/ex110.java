/*
На вход подаётся целое число n,  а на следующей строке - последовательность целых
чисел через пробел,

Выведите число с индексом n. Если числа с таким индексом нет,
выведите "Неверный ввод".

Sample Input:
4
1 1 2 3 5 8

Sample Output:
5

 */

import java.util.Scanner;

public class ex110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        while (sc.hasNextLine()) {
            str = sc.nextLine();
        }
        String[] arr = str.split(" ");
        if (n < arr.length && n >= 0) {
            System.out.println(arr[n]);
        } else {
            System.out.println("Неверный ввод");
        }
    }
}
