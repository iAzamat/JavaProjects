/*
Напишите программу, которая принимает три числа - год, месяц и день и выводит на печать фразу:
DD:MM:YYYY.
Проверять валидность даты не требуется.
Sample Input:
2021
01
30
Sample Output:
30:01:2021
 */

import java.util.Scanner;
public class ex011_input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String god=sc.next();
        String mes=sc.next();
        String day=sc.next();
        System.out.println(day+":"+mes+":"+god);
    }
}
