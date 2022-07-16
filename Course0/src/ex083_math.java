/*
Возведение в степень
Для этой операции имеется метод pow, который выглядит так:
static double pow(double a, double b)

Метод принимет два аргумента (причём оба типа double) и возвращает значение a^b,
также типа double.
Если передать в качестве аргумента целые числа,
то они автоматически будут приведены к типу double.

Возведём в квадрат какое-нибудь число:
int x = 5, y = 2;
double z;
z = Math.pow(5, 2);
System.out.println(z);    // 25.0

Имеется также частный случай - экспонента числа x,
т.е. e^x (e - число Эйлера):
static double exp(double x)

На вход подаются два числа, x и y. Выведите на печать x^y

Sample Input:
5 2

Sample Output:
25.0

 */

import java.util.Scanner;

public class ex083_math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z;
        z = Math.pow(x, y);
        System.out.println(z);
    }
}
