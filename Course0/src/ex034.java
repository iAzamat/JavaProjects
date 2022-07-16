/*
На вход подаются две строки.
Объедините их в предложение, а на следующей строке выведите общее количество знаков в предложении.

Sample Input:
My name
is John

Sample Output:
My name is John
15

 */

import java.util.Scanner;

public class ex034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textA = sc.nextLine();
        String textB = sc.nextLine();
        String text = textA + " " + textB;
        int n = text.length();
        System.out.println(text + "\n" + n);
    }
}
