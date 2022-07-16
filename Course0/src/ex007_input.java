/*Напишите программу, которая считывает имя пользователя и затем приветствует его.

        Sample Input:
        Нео
        Sample Output:
        Привет, Нео
        */

import java.util.Scanner;

public class ex007_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Привет, " + name);
        sc.close();
    }
}
