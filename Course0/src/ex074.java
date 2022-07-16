/*
На вход подаётся строка с двумя буквами, а затем - строка, состоящая из слов.
Выведите на печать все слова, которые начинаются на буквы,
идущие по алфавиту между буквами с первой строки (включительно).
Вывести слова необходимо в том же порядке, в котором они подаются на вход.

Sample Input:
j p
java python c++ kotlin php sql http css javascript r go

Sample Output:
java
python
kotlin
php
javascript

 */

import java.util.Scanner;

public class ex074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.next().charAt(0);
        int b = sc.next().charAt(0);
        int temp = 0;
        if (a > b) {
            temp = b;
            b = a;
            a = temp;
        }

        System.out.println("Вводите значения через пробел или enter. q - выход");
        while (!sc.hasNext("q")) {
            String c = sc.next();
            int CC = c.charAt(0);
            if (a <= CC && CC <= b) {
                System.out.println(c);
            }
        }
    }
}
