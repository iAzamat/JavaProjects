/*Напишите программу, которая получает два целых числа и выводит их сумму.
Sample Input:
8 11
Sample Output:
19
 */

import java.util.Scanner;

public class ex015_oper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}
