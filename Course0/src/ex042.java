/*
Два индийских программиста, Махатма и Джавахарлал, решили выяснить, чей код длиннее.
Напишите программу, которая поможет им выяснить это.
На вход подаются две строки текста. Если первая строка длиннее второй,
необходимо вывести на печать "Махатма", если наоборот - "Джавахарлал".
Гарантируется, что строки имеют разную длину.

Sample Input:
abracadabra
The world is mine

Sample Output:
Джавахарлал

 */

import java.util.Scanner;

public class ex042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textA = sc.nextLine();
        String textB = sc.nextLine();
        if (textA.length() > textB.length()) {
            System.out.println("Махатма");
        } else System.out.println("Джавахарлал");
    }
}
