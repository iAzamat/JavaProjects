/*
На вход подаётся матрица (двумерный массив). Все элементы матрицы - целые числа.
Напечатайте главную диагональ матрицы в одной строке, через пробел.

Sample Input:
1 2 3
4 5 6
7 8 9

Sample Output:
1 5 9

 */

import java.util.Scanner;

public class ex108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        System.out.print(str[0]);
        for (int i = 1; i < str.length && sc.hasNext(); i++) {
            str = sc.nextLine().split(" ");
            System.out.print(" " + str[i]);
        }
    }
}
