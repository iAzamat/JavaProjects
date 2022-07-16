/*
На ввод подаётся натуральное число n.
Выведите на печать в возрастающем порядке через пробел квадраты натуральных чисел,
если эти квадраты не превышают n.

Sample Input:
30

Sample Output:
1 4 9 16 25

 */

import java.util.Scanner;

public class ex067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        int sqr = 1;
        while (sqr <= N) {
            System.out.print(sqr + " ");
            i += 1;
            sqr = i * i;
        }
    }
}
