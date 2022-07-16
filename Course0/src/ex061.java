/*
На вход подаётся целое трёхзначное число, а затем цифра.
Выведите true, если эта цифра является средней в числе (разряд десятков), и false - если нет.
Если введённое число не является трёхзначным, выведите "error".

Sample Input:
123 2

Sample Output:
true

 */

import java.util.Scanner;

public class ex061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Math.abs(sc.nextInt());
        int B = sc.nextInt();
        int test = 0;
        if (A >= 100 && A < 1000) {
            test = A % 100 / 10;
            if (test == B) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else System.out.println("error");

    }
}
