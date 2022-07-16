/*
Выведите на печать наибольшее из трёх целых чисел.

Sample Input:
5 6 12

Sample Output:
12

 */

import java.util.Scanner;

public class ex044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println(max);
    }
}
