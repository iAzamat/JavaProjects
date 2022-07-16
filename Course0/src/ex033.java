/*
На вход подаются две строки текста.
Выведите на печать true, если строки совпадают, и false - если нет.

Sample Input 1:
abracadabra
abracadabra

Sample Output 1:
true

Sample Input 2:
My name is John
My name is Boris

Sample Output 2:
false

 */

import java.util.Scanner;

public class ex033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textA = sc.nextLine();
        String textB = sc.nextLine();
        boolean result = textA.equals(textB);
        System.out.println(result);
    }
}
