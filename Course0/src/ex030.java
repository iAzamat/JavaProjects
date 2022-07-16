/*
На вход подаётся строка текста, затем слово.
Выведите на печать true, если слово содержится в строке, и false - если не содержится.

Sample Input 1:
My name is John
name

Sample Output 1:
true

Sample Input 2:
My name is John
john

Sample Output 2:
false

 */

import java.util.Scanner;

public class ex030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String texts = sc.nextLine();
        boolean value = text.contains(texts);
        System.out.println(value);
    }
}
