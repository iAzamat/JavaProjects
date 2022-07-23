/*
Обработка массива
Теперь, когда мы знаем, как устроен массив, можем приступить к операциям с
данными, сохранёнными в массиве. К примеру, у нас есть массив, содержащий
данные о ежедневных продажах какого-нибудь товара в течение недели (в штуках).
Вычислим, сколько всего было продано единиц товара за всю неделю.

Как мы уже знаем, для обработки подходит цикл for. Именно этот цикл чаще всего
используется при работе с массивами, так как нам известна длина массива.

int[] myArr = {6, 42, 3, 7, 16, 10, 22};
int summ = 0;
for(int x = 0; x < myArr.length; x++) {
summ += myArr[x];
}
System.out.println(summ);

// 106

В примере мы объявили переменную summ, затем в цикле обошли весь массив,
прибавляя каждое из значений к summ.

Если необходимо обойти весь массив (все элементы), удобно использовать
сокращённый цикл, вот его запись:

String[] beatles = {"John", "Paul", "Ringo", "George"};

for (String person: beatles) {
        System.out.println(person);
}

//John
//Paul
//Ringo
//George

Здесь мы объявляем переменную person, которая "пробегает" весь массив beatles. На
каждой итерации цикла она принимает значение соответствующего элемента массива.

*/

/*
На вход подаётся натуральное число n > 0 (длина массива), а на следующей строке -
последовательность целых чисел. Создайте из неё массив и выведите на печать
значение последнего элемента массива.

Sample Input:
5
1 2 3 4 5

Sample Output:
5

 */

import java.util.Scanner;

public class ex095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(numbers[n - 1]);
    }
}
