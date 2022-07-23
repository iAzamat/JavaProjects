/*
Построение массива из строки

В классе String имеется очень полезный метод split(). С помощью этого метода можно
разделить имеющуюся строку на массив типа String[].

String str = "I'll be back";
String[] words = str.split(" ");
for (String word: words) {
    System.out.println(word);
}

//
I'll
be
back
//

Метод split() разрезает строку по элементу, указанному в скобках.

String dataLine = {"158;190;178;186;174"}
String[] dataHeight = dataLine.split(";");

for (String el: dataHeight) {
        System.out.println(el);
}

//
158
190
178
186
174
//

Обратите внимание, что при разрезании получается массив именно из элементов
типа String. Попытка разрезать строку вида "123 16 456 852" и записать элементы в
массив типа int вызовет ошибку.

 */

/*
На вход подаётся строка из элементов, разделённых запятой. Создайте из неё
массив и выведите элементы массива каждый в отдельной строке.

Sample Input:
1,2,3,4,5

Sample Output:
1
2
3
4
5

 */

import java.util.Scanner;

public class ex099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dataLine = sc.nextLine();
        String[] dataHeight = dataLine.split(",");
        for (String el : dataHeight) {
            System.out.println(el);
        }
    }
}
