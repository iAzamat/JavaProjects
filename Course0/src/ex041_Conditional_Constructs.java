/*
Два индийских программиста, Махатма и Джавахарлал, решили выяснить,
кто из них быстрее пишет код. Напишите программу, которая поможет им выяснить это.
На вход подаются два целых числа в одной строке через пробел.
Если первое число больше второго, необходимо вывести на печать "Махатма",
если второе - "Джавахарлал". Гарантируется, что числа больше нуля и различны.

Sample Input:
8 11

Sample Output:
Джавахарлал

 */

import java.util.Scanner;

public class ex041_Conditional_Constructs {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Махатма");
        } else System.out.println("Джавахарлал");
    }
}
