/*
Напишите программу, которая считывает строку, а затем выводит эту же строку на печать 2 раза в первой строке через пробел, а затем ещё два раза в столбик.
Sample Input:
Java forever!
Sample Output:
Java forever! Java forever!
Java forever!
Java forever!
 */

import java.util.Scanner;
public class ex009_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        System.out.println(text+" "+text);
        System.out.println(text+"\n"+text);
        sc.close();
    }
}
