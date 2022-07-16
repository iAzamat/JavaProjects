/*
На вход подаётся целое число. Выведите "YES", если оно нацело делится на 7, и "NO" - если нет.

Sample Input 1:
7

Sample Output 1:
YES

Sample Input 2:
10

Sample Output 2:
NO

 */

import java.util.Scanner;
public class ex047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 7 == 0) {
            System.out.print("YES");
        } else System.out.print("NO");
    }
}
