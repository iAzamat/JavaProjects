/*
На вход подаётся целое число. Найдите его последнюю цифру.
Примечание. Для вычислений может понадобиться метод Math.abs(x),
возвращающий абсолютное значение (модуль) числа.
Это один из множества методов, предоставляемых классом Math.
Более подробно этот класс будет рассмотрен в следующих модулях.
Sample Input:
365
Sample Output:
5

 */

import java.util.Scanner;
import java.lang.Math;

public class ex020_oper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int myVar = Math.abs(x % 10);
        System.out.print(myVar);
    }
}
