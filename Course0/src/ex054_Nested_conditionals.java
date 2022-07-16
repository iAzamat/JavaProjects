/*
На вход подаётся три целых числа.
Выведите среднее из них (т.е. не минимальное и не максимальное).

Sample Input:
5 10 11

Sample Output:
10

 */

import java.util.Scanner;

public class ex054_Nested_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int s = 0;
        if ((A <= B && A <= C) && (B <= C)) {
            s = B;
        }
        if ((A <= B && A <= C) && (C <= B)) {
            s = C;
        }
        if ((B <= A && B <= C) && (A <= C)) {
            s = A;
        }
        if ((B <= A && B <= C) && (C <= A)) {
            s = C;
        }
        if ((C <= B && C <= A) && (A <= B)) {
            s = A;
        }
        if ((C <= B && C <= A) && (B <= A)) {
            s = B;
        }
        System.out.println(s);
    }
}
