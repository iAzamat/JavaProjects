/*
На вход подаётся число x_0
Посчитайте значение функции y = 5x^2 + 2x + 11
в точке x_0
и выведите на печать.
Sample Input:
1
Sample Output:
18.0

 */

import java.util.Scanner;

public class ex017_oper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = (5 * (x * x)) + (2 * x) + 11;
        System.out.println(y);
    }
}
