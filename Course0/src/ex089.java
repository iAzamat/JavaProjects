/*
На вход подаются длины двух катетов прямоугольного треугольника a и b.
Посчитайте и выведите на печать периметр этого треугольника.
Значение периметра необходимо округлить до целого (в математическом смысле, не типа int).

Sample Input:
3 4

Sample Output:
12.0

 */

import java.util.Scanner;

public class ex089 {
    public static double sqr(double i) {
        double result = Math.pow(i, 2);
        return result;
    }

    public static double sqrt(double i) {
        double result = Math.pow(i, 1.0 / 2);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sqrt(sqr(a) + sqr(b));
        double P = a + b + c;
        double result = Math.rint(P);
        System.out.println(result);

    }
}
