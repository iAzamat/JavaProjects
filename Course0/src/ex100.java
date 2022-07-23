/*
Методы массивов
Для работы с массивами в java есть специальный класс Arrays. Вот некоторые
полезные методы, которые он предоставляет.

Вначале класс нужно импортировать (так же, как мы импортируем java.util.Scanner):

    import java.util.Arrays;

И не забываем про точку с запятой в конце)

    1. Arrays.toString().

Метод преобразует массив в строку. Полезен, прежде всего, для вывода массива на
печать. Если попытаться напечатать массив напрямую, то мы получим вместо
массива его шестнадцатеричный хеш-код:

    int[] array = {1, 2, 3, 4, 5};
    System.out.println(array);       // [I@b800 - этот хеш-код будет изменяться при каждом запуске

Поэтому, для начала, массив нужно преобразовать в строку:

    int[] array = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(array));       // [1, 2, 3, 4, 5]

    2. Arrays.sort().

Этот метод сортирует массив или его часть.

    int[] array = {5, 10, 15, 4, 1};
    Arrays.sort(array);
    System.out.println(Arrays.toString(array)); // [1, 4, 5, 10, 15]

Можно отсортировать только часть массива, указав начальный и конечный индексы при вызове метода:

    int[] array = {5, 10, 15, 4, 1, 7, 23, 8, 11, 42};
    Arrays.sort(array, 3, 7);
    System.out.println(Arrays.toString(array));    // [5, 10, 15, 1, 4, 7, 23, 8, 11, 42]

В этом примере мы отсортировали только элементы массива с индексами от 3 до 6
(правая граница не входит в отрезок сортировки).

Обратите внимание: метод ничего не возвращает, а сортирует массив "на месте". Если
попытаться присвоить результат работы метода какой-нибудь переменной,
компилятор выдаст ошибку.

Можно сортировать и массивы из строк. В этом случае, сортировка производится в
лексикографическом порядке.

    String[] array = {"one", "two", "three", "four"};
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));    // [four, one, three, two]

    3. Arrays.equals()

Этот метод сравнивает два массива и возвращает true, если они равны, и false - в обратном случае.

    int[] numbers1 = {1, 2, 3};
    int[] numbers2 = {1, 2, 3};
    System.out.println(Arrays.equals(numbers1, numbers2));    // true
    int[] numbers3 = {1, 2, 3, 4};
    boolean result = Arrays.equals(numbers1, numbers3);
    System.out.println(result);    // false

Особое внимание необходимо обратить, что сравнивать массивы необходимо именно
с помощью статического метода класса, а не так, как мы сравнивали строки
(с помощью метода экземпляра).

    int[] numbers1 = {1, 2, 3};
    int[] numbers2 = {1, 2, 3};
    System.out.println(number1.equals(numbers2));    // false

Так происходит потому, что массив является ссылочным типом данных, то есть,
переменная содержит не сами данные, а только ссылку на них. В этом случае Java
сравнивает между собой не данные, а ссылки на объекты. Поскольку объекты
разные, то и результат сравнения получается false.

    4. Arrays.copyOf()

Метод возвращает копию массива. Метод получает в качестве аргументов массив,
который нужно скопировать, и число элементов, которые нужно скопировать. Отсчёт
ведётся с первого элемента массива.

    int[] numbers1 = {1, 2, 3, 4, 5};
    int[] numbers2 = Arrays.copyOf(numbers1, 5);
    System.out.println(Arrays.toString(numbers2));    // [1, 2, 3, 4, 5]
    int[] numbers3 = Arrays.copyOf(numbers1, 3);
    System.out.println(Arrays.toString(numbers3));    // [1, 2, 3]

Если нужно скопировать весь массив, можно передать в качестве аргумента его длину:

    int[] numbers1 = {1, 2, 3, 4, 5};
    int[] numbers2 = Arrays.copyOf(numbers1, numbers1.length);
    System.out.println(Arrays.toString(numbers2));    // [1, 2, 3, 4, 5]

Важно понимать разницу между приравниванием массивов друг другу и копированием:

    int[] numbers1 = {1, 2, 3, 4, 5};
    int[] numbers2 = numbers1;
    int[] numbers3 = Arrays.copyOf(numbers1, numbers1.length);
    numbers1[3] = 1000;
    System.out.println(Arrays.toString(numbers2));    // [1, 2, 3, 1000, 5]
    System.out.println(Arrays.toString(numbers3));    // [1, 2, 3, 4, 5]

Так получается потому, что numbers1 и numbers2 ссылаются на один и тот же объект,
а numbers1 и numbers3 - на разные.

Таким образом, метод Arrays.copyOf() создаёт новый, независимый от оригинального, массив.

    5. Arrays.copyOfRange()

Если нужно скопировать не массив целиком, а только его кусок, подойдёт метод Arrays.copyOfRange(). Этот метод получает на вход массив, а также стартовый и конечный индексы "куска", который нужно скопировать:

    int[] numbers1 = {2, 4, 6, 8, 10, 12, 14, 16};
    int [] numbers2 = Arrays.copyOfRange(numbers1, 2, 5);
    System.out.println(Arrays.toString(numbers2));    // [6, 8, 10]

Мы получили новый массив, вырезанный из первоначального, включая
начальный индекс (2), но не включая конечный.

 */

/*
На вход подаётся натуральное число n, затем несколько целых чисел, разделённых
пробелом, а на следующей строке - натуральное число k.
Выведите k-е по счёту число по возрастанию. Если такого числа нет, выведите
"Ошибка ввода".

Sample Input:
5
3 12 1 22 17
3

Sample Output:
12

 */

import java.util.Scanner;
import java.util.Arrays;

public class ex100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int k = sc.nextInt();
        if (k >= 0 && k <= n) {
            System.out.println(numbers[k - 1]);
        } else {
            System.out.println("Ошибка ввода");
        }

    }
}
