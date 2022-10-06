/*
Массивы
Массив - это набор переменных одного типа.
Когда нужно сохранить список значений, таких как числа, можно хранить их
упорядоченно, то есть, в массиве, а не объявлять отдельные переменные для
каждого числа.

Чтобы объявить массив, необходимо определить тип элементов и размерность в
квадратных скобках.
Например, объявим массив целых чисел:

int[] arr;

Переменная, в которой будет сохранён массив - arr. Тип элементов массива - int.

Далее нужно определить емкость массива (т.е. задать количество элементов,
которые он будет содержать). Для этого используется ключевое слово new.

int[] arr = new int[5];

Приведенный выше код объявляет массив из 5 целых чисел.
В массиве элементы упорядочены, и каждый из них имеет определенную и
постоянную позицию, которая называется индексом.

При объявлении массива без указания значений элементов он будет заполнен
значениями по умолчанию. Для int это 0, для float и double — 0.0, для char — \0, для
boolean — false, а для String и любого другого класса это null.

Чтобы ссылаться на элемент в массиве, нужно указать имя массива и индекс
нужного элемента в квадратных скобках.

int[] arr = new int[5];
arr[2] = 42;

System.out.println(arr[2]);    // 42
System.out.println(arr[3]);    // 0

Обратите внимание, что индексация элементов в массиве начинается с нуля. Таким
образом, индекс первого элемента равен 0, а не единице, а максимальный индекс
 массива int[5] равен 4.

 */

/*
Инициализация массива

Существует простой способ создать массив и присвоить элементам конкретные
значения. Если уже известно, какие именно значения вставлять в массив, можно
использовать литерал.

String[] names = {"A", "B", "C", "D"};
System.out.println(names[2]); // C

Значения элементов массива помещаются в фигурные скобки через запятую. Такой
код автоматически инициализирует массив соответствующей размерности и сразу
же присваивает элементам нужные значения.

Также возможна инициализация массива записью квадратных скобок после имени
массива, однако такой способ используется гораздо реже.

String names[] = {"A", "B", "C", "D"};

 */

/*

Длина массива

Количество элементов в массиве называется его длиной. Получить длину массива
можно через атрибут length.

int[] newArray = new int[5];
System.out.println(newArray.length);

Обратите внимание - length у массива - это не метод, а атрибут, т. е. свойство данного
массива, поэтому вызывается без круглых скобок в конце.

 */

/*
Создание массива через цикл

Для работы с массивами очень удобно использовать цикл for. Создадим массив
натуральных чисел от 10 до 20:

int[] numbers = new int[11];

for (int i = 10; i <= 20; i++) {
    numbers[i - 10] = i;
}

Теперь массив numbers содержит 11 элементов - числа от 10 до 20 включительно.

Обработка массива также обычно производится через цикл. Например, давайте
умножим все элементы массива numbers на 2:

for (int i = 0; i < numbers.length; i++) {
    numbers[i] = numbers[i] * 2;
}

Обратите внимание - мы начинаем работу с массивом с элемента под индексом
0 (i = 0), а заканчиваем элементом с индексом numbers.length - 1
(строгое неравенство i < numbers.length). В нашем случае массив numbers содержит 11 элементов, то
есть numbers.length = 11. Однако, поскольку индексация начинается с нуля, то индекс
последнего элемента массива равен numbers.length - 1 (в нашем случае 10).

Теперь давайте выведем на печать то, что у нас получилось:

for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}

// 20 22 24 26 28 30 32 34 36 38 40

 */

/*
На вход подаётся натуральное число n. Создайте массив натуральных чисел от
единицы до n включительно и выведите его на печать (в одной строке, через пробел).

Sample Input:
5

Sample Output:
1 2 3 4 5

 */

import java.util.Scanner;

public class ex094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }

    }
}