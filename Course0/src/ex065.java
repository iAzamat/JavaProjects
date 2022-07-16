/*
На вход подаётся слово.
Выведите словами количество букв в этом слове.
Если букв больше пяти - выведите "Длинное слово".

Sample Input:
в

Sample Output:
Одна буква

 */

import java.util.Scanner;

public class ex065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int word = sc.next().length();
        switch (word) {
            case 0:
                System.out.println("Ноль букв");
                break;
            case 1:
                System.out.println("Одна буква");
                break;
            case 2:
                System.out.println("Две буквы");
                break;
            case 3:
                System.out.println("Три буквы");
                break;
            case 4:
                System.out.println("Четыре буквы");
                break;
            case 5:
                System.out.println("Пять букв");
                break;
            default:
                System.out.println("Длинное слово");
        }
    }
}
