/*
Напишите программу, которая считывает целое число t - температуру воздуха, и выводит фразу:
Температура воздуха сегодня: t градусов.
Sample Input:
18
Sample Output:
Температура воздуха сегодня: 18 градусов.
 */

import java.util.Scanner;

public class ex010_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println("Температура воздуха сегодня: " + t + " градусов.");
    }
}
