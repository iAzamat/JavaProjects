/*
На вход подаётся натуральное число n.
Выведите на печать все его делители в одну строку через пробел.

Sample Input:
15

Sample Output:
1 3 5 15

 */

import java.util.Scanner;

public class ex092 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
