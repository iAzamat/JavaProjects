/*
На вход подаётся целое число n.
Выведите в одной строке через пробел само число, его квадрат и куб.
Sample Input:
2
Sample Output:
2 4 8
 */

import java.util.Scanner;

public class ex018_oper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a + " " + a * a + " " + a * a * a);
    }

}
