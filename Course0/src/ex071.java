/*
На вход подаются числа, которые делятся на 11.
Концом последовательности будет любое число,
не делящееся на 11 (это число не входит в последовательность).

Посчитайте количество введённых чисел и сумму тех из них, которые кратны 3.
Sample Input:
11 22 33 121 99 15

Sample Output:
5
132

 */

import java.util.Scanner;

public class ex071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        int sum = 0;
        while (a % 11 == 0) {
            if (a % 3 == 0 && a % 11 == 0) {
                sum += a;
            }
            a = sc.nextInt();
            count += 1;
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
