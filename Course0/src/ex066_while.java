/*
На вход подаётся натуральное число n.
Выведите на печать числа от единицы до введённого числа включительно, каждое на новой строке.

Sample Input:
5

Sample Output:
1
2
3
4
5

 */

import java.util.Scanner;

public class ex066_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while (i <= N) {
            System.out.println(i);
            i += 1;
        }

    }
}
