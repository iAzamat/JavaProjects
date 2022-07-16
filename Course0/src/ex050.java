/*
На вход подаются два целых числа.
Выведите на печать true, если их сумма чётна, а произведение - нечётно,
и false - в противном случае.

Sample Input:
5 3

Sample Output:
true

 */

import java.util.Scanner;

public class ex050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (((a + b) % 2 == 0) && ((a * b) % 2 != 0)) {
            System.out.println("true");
        } else System.out.println("false");

    }
}
