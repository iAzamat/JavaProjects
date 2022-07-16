/*
На вход подаются два числа.
Выведите сначала их сумму, а на следующей строке переведите числа в строковый формат
и сложите в строковом формате.

Sample Input:
8 11

Sample Output:
19
811

 */

import java.util.Scanner;

public class ex035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        String text = Integer.toString(a) + Integer.toString(b);
        System.out.println(sum + "\n" + text);
    }
}
