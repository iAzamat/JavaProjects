/*
На вход подаётся последовательность чисел от нуля до 10,
являющихся рейтингами фильма, выставленными зрителями.
Если входящее число отрицательное или больше 10, последовательность прерывается.

Посчитайте среднюю оценку фильма.

Sample Input:
5 6 7 8 9 10 11

Sample Output:
7.5

 */

import java.util.Scanner;

public class ex072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double sum = 0;
        int index = 0;
        double avg = 0;
        while (a >= 0 && a <= 10) {
            sum += a;
            a = sc.nextInt();
            index += 1;
        }
        avg = sum / index;
        System.out.println(avg);
    }
}
