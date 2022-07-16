/*
На вход подаётся целое число n.
Выведите "YES", если можно построить правильный многогранник из правильных плоских n-угольников,
в противном случае - "NO".

Sample Input:
3

Sample Output:
YES

 */

import java.util.Scanner;

public class ex046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 3 || a == 4 || a == 5) {
            System.out.print("YES");
        } else System.out.print("NO");
    }
}
