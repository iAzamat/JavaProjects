/*
Цикл с обходом элементов массива

Часто требуется "обойти" весь массив, чтобы произвести над каждым из элементов
какую-нибудь операцию. Например, пусть задан массив строк, и давайте напечатаем
все, которые начинаются на букву f:

    String[] numbers = {"one", "two", "three", "four", "five", "forty two"};

    for (int i=0; i < numbers.length; i++) {
        if (numbers[i].charAt(0) == 'f') {
            System.out.println(numbers[i]);
        }
    }

Для таких случаев в Java есть специальный цикл (по-английски называется enhanced loop),
цикл с обходом всех элементов:

    String[] numbers = {"one", "two", "three", "four", "five", "forty two"};

    for (String s: numbers) {
        if (s.charAt(0) == 'f') {
            System.out.println(s);
        }
    }
Внутри цикла мы инициализируем переменную, соответствующую типу элементов
массива, с которым работаем. Эта переменная в каждой итерации цикла будет равна
соответствующему элементу массива. Переменная отделяется от массива двоеточием.

Использование такого цикла упрощает код (и, как следствие, снижает количество
ошибок) и повышает его понятность.

Важное отличие заключается в том, что в первом варианте мы работаем
непосредственно со значениями элементов массива, а во втором - с их копиями:

    String[] numbers = {"one", "two", "three", "four", "five", "forty two"};

    for (int i=0; i < numbers.length; i++) {
        if (numbers[i].charAt(0) == 'f') {
            numbers[i] = "deleted";
        }
    }

    System.out.println(numbers[3]);    // deleted

    String[] numbers1 = {"one", "two", "three", "four", "five", "forty two"};

    for (String s: numbers1) {
        if (s.charAt(0) == 'f') {
            s = "deleted";
        }
    }

    System.out.println(numbers1[3]);    // four

 */

/*
На ввод подаётся последовательность целых чисел. Поменяйте местами соседние
элементы последовательности (второй с третьим, четвёртый с пятым и т.д.), кроме
первого и последнего. Если находится "одинокий" элемент, который не с чем
поменять - необходимо оставить его на месте.

Sample Input:
1 2 3 4 5 6

Sample Output:
1 3 2 5 4 6

 */

import java.util.Scanner;
import java.util.Arrays;

public class ex102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] datastr = str.split(" ");
        int n = datastr.length;
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.valueOf(datastr[i]);
        }

        if (n % 2 == 0) {
            for (int i = 1; i <= n - 2; i += 2) {
                int buf = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = buf;
            }
        } else {
            for (int i = 1; i <= n - 3; i += 2) {
                int buf = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = buf;
            }
        }
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(" " + numbers[j]);
        }
    }
}
