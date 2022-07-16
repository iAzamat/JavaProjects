/*
на вход подаётся два натуральных числа - n и m.
Напечатайте число n, повторённое m раз в одной строке через пробел.

Sample Input:
3 5

Sample Output:
3 3 3 3 3

 */

import java.util.Scanner;

public class ex077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            System.out.print(n + " ");
        }
    }
}
