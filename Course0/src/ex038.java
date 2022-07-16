/*
Напишите программу, находящую корни квадратного уравнения  ax^2+bx+c = 0

На вход подаются целые числа a, b и c.
Выведите сумму и произведение корней в одной строке, через пробел.

Примечание 1. Гарантируется, что существует два различных корня.
Примечание 2. Можно воспользоваться, к примеру, теоремой Виета.

Sample Input:
1 2 -4

Sample Output:
-2.0 -4.0

 */

import java.util.Scanner;

public class ex038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double xSum = -b / a;
        double xPr = c / a;
        System.out.println(xSum + " " + xPr);
    }
}
