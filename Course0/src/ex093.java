/*
На вход подаётся натуральное число n.
Определите, является ли это число простым.
Выведите true, если число n - простое, и false - если нет.

Sample Input 1:
100

Sample Output 1:
false

Sample Input 2:
7

Sample Output 2:
true

 */

import java.util.Scanner;

public class ex093 {

    static String IsPrime(int n) {
        if (n == 2 || n == 3)
            return "true";

        if (n <= 1 || n % 2 == 0 || n % 3 == 0)
            return "false";

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return "false";
        }

        return "true";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Math.abs(in.nextInt());
        System.out.println(IsPrime(n));
    }
}
