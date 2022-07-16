/*
На вход подаётся натуральное число n.
Выведите на печать числа n - 1, n, n + 1 в одну строку, через пробел (см. образец).
Sample Input:
10
Sample Output:
9 10 11

*/

import java.util.Scanner;

public class ex025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println((--a) + " " + (++a) + " " + (++a));
    }
}
