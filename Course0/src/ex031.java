/*
На вход подаётся строка.
Выведите её на печать сначала строчными, а затем прописными буквами.

Sample Input:
This is new string

Sample Output:
this is new string
THIS IS NEW STRING

 */

import java.util.Scanner;

public class ex031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String textUp = text.toUpperCase();
        String textLow = text.toLowerCase();
        System.out.println(textLow + "\n" + textUp);
    }
}
