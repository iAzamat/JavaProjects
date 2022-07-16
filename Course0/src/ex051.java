/*
На вход подаются три целых числа.
Выведите true, если среди них есть ровно два чётных, и false - если нет.

Sample Input:
4 6 7

Sample Output:
true

 */

import java.util.Scanner;
public class ex051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a%2+b%2+c%2==1) {
            System.out.println("true");
        } else System.out.println("false");
    }
}
