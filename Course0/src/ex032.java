/*
На вход подаётся строка, а затем целое число n > 0. Выведите n- й символ с начала строки.

Sample Input:
This is a string
1

Sample Output:
T

 */

import java.util.Scanner;

public class ex032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int n = sc.nextInt();
        char v = text.charAt(n - 1);
        System.out.println(v);
    }
}
