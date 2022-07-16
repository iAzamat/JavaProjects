/*
Напишите программу, которая считывает строку, а затем выводит эту же строку на печать 3 раза в столбик.
Sample Input:
Java сложный, прямо капец
Sample Output:
Java сложный, прямо капец
Java сложный, прямо капец
Java сложный, прямо капец
 */

import java.util.Scanner;
public class ex008_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(text + "\n" + text + "\n" + text + "\n");
    }
}
