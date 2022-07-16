/*
Задача повышенной сложности
 Реализуйте простые домашние часы.
На вход подаётся число секунд, которое прошло с момента начала суток (00:00:00).
Выведите текущее время в формате ЧЧ:ММ:СС.
Примечание 1. Используйте 24-часовой формат.
Примечание 2. Для преобразования типа int в тип String (если это понадобится)
можно использовать встроенный служебный метод String.valueOf(num),
который преобразует число num в строку "num".

Sample Input 1:
41000
Sample Output 1:
11:23:20

Sample Input 2:
3600
Sample Output 2:
01:00:00

*/

import java.util.Scanner;

public class ex022_oper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int h = (sec % (24 * 60 * 60)) / 3600;
        int m = (sec % (60 * 60)) / 60;
        int s = (sec % (60 * 60)) % 60;
        System.out.printf("%02d:%02d:%02d", h, m, s);
    }
}
