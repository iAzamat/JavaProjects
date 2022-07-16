/*
На вход подаётся два натуральных числа x и y.
Выведите на печать прямоугольник из звёздочек размером x*y.

Sample Input:
4 2

Sample Output:
**
**
**
**

 */

import java.util.Scanner;

public class ex078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
