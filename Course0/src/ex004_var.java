/*
Напишите программу, которая присваивает трем переменным значения 100, 200 и 300.

Выведите на печать значения переменных в столбик, а затем в строку через пробел.

Примечание 1. Вспомните о различии методов println() и print().

Примечание 2. Пробел - это не пустота, а тоже символ.

Sample Input:
Sample Output:
100
200
300
100 200 300
 */

public class ex004_var {
    public static void main(String[] args) {
        int a = 100, b = 200, c = 300;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.print(a + " " + b + " " + c);
    }
}
