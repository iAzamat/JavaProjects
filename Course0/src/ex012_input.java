/*
Давайте напишем программу-помощника, которая сообщает, сколько у Вас новых сообщений на почте.
Формат ввода. На первой строке вводится имя пользователя, на второй имя помощника, на третьей - количество сообщений.
Формат вывода - в соответствии с образцом.
Sample Input:
Илон Маск
Иван
19
Sample Output:
Привет, Илон Маск, это твой помощник Иван.
У тебя 19 новых писем.
 */

import java.util.Scanner;

public class ex012_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameOne = sc.nextLine();
        String nameTwo = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Привет, " + nameOne + ", это твой помощник " + nameTwo + ".");
        System.out.println("У тебя " + age + " новых писем.");
    }
}
