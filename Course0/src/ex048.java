/*
На вход подаётся целое число.
Выведите "YES", если оно нацело делится на 7, но не делится на 5, иначе -  "NO".

Sample Input:
7

Sample Output:
YES

 */

import java.util.Scanner;

public class ex048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a % 7 == 0) && (a % 5 != 0)) {
            System.out.print("YES");
        } else System.out.print("NO");

    }
}
