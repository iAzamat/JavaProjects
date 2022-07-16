/*
На вход подаются два числа: x и y.
Выведите на печать значение выражения

z = {x + 1}/{y - 1} + {y + 1}/{x - 1}

Гарантируется, что
x \neq 1
y \neq 1

Sample Input:
5 3
Sample Output:
4

 */

import java.util.Scanner;

public class ex026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int xb = x;
        int yb = y;
        int z = (++x / --y) + (++yb / --xb);
        System.out.println(z);
    }
}
