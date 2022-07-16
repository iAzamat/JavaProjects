/*
На вход подаются два положительных действительных числа - стороны прямоугольника. Посчитайте его площадь и периметр и выведите на отдельных строках.
Sample Input:
5 10
Sample Output:
50.0
30.0
 */

import java.util.Scanner;

public class ex016_oper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double S = a * b;
        double P = (a + b) * 2;
        System.out.println(S + "\n" + P);
    }
}
