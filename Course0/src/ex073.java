/*
На вход подаётся натуральное число.
Выведите на печать составляющие его цифры в обратном порядке.

Sample Input:
12345

Sample Output:
54321

 */

import java.util.Scanner;

public class ex073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b;
        while (a != 0) {
            b = a % 10;
            a = (a - b) / 10;
            System.out.print(b + "");
        }
    }
}
