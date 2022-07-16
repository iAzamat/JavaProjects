/*
На вход подаётся строка текста.
Выведите её первый и последний элемент в одну строку через пробел.

Sample Input:
abracadabra

Sample Output:
a a

 */

import java.util.Scanner;

public class ex029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int l = text.length();
        char a = text.charAt(0);
        char b = text.charAt(l - 1);
        System.out.println(a + " " + b);
    }
}
