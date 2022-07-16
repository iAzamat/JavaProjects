/*
Ввод данных в программу

В то время как Java предоставляет множество различных методов для пользовательского ввода, объект Scanner является наиболее распространенным и, возможно, самым простым в реализации. Импортируйте класс Scanner для использования объекта Scanner, как показано здесь:

import java.util.Scanner;
Чтобы использовать класс Scanner, создайте экземпляр класса, используя следующий синтаксис:

Scanner sc = new Scanner(System.in);
Теперь вы можете читать различные виды входных данных, которые вводите. При этом имя объекта можно задать произвольно (не обязательно sc).
Вот некоторые методы, доступные через класс Scanner:


Ввести объект int: nextInt()
Ввести объект float: nextFloat()
Ввести объект double: nextDouble()
Ввести объект boolean: nextBoolean()
Ввести строку целиком: nextLine()
Ввести слово (считывается до первого пробела): next()

Пример программы, используемой для получения пользовательского ввода:

import java.util.Scanner;

class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
    }
}
 */

/*
Доработайте программу так, чтобы она считывала строку, а затем выводила эту же строку на печать.
Примечание. В этой задаче, как и в большинстве других, есть скрытые тесты с другими значениями ввода. Код не должен быть привязан к конкретным данным.
Sample Input:
10
Sample Output:

10
 */

import java.util.Scanner;

public class ex006_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);

    }
}
