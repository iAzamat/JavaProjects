/*
В качестве условий можно использвать любые логические выражения,
главное - чтобы условие однозначно определялось, как true или false.

Счётчик также может иметь любой шаг или быть отрицательным:

for (int i = 5; i < 10; i += 2) {
    System.out.print(i + " "); // 5 7 9
}

for (int i = 5; i > -1; i--) {
    System.out.print(i + " "); // 5 4 3 2 1 0
}

for (int i = 1; i < 10;) {
    System.out.print(i + " "); // Бесконечный цикл
}

В последнем случае цикл будет выполняться бесконечно,
так как переменная i не меняет своё значение, а, значит, никогда не станет больше 10.

 */

/*
На вход подаётся натуральное число n.
Выведите на печать в одной строке через пробел все числа от 1 до n включительно,
которые одновременно без остатка делятся на 2 и на 3.
Если таких чисел в диапазоне нет, выведите "Таких чисел нет".

Sample Input 1:
1

Sample Output 1:
Таких чисел нет

Sample Input 2:
20

Sample Output 2:
6 12 18

 */

import java.util.Scanner;

public class ex076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean check = false;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
                check = true;
            }

        }
        if (check == false) {
            System.out.print("Таких чисел нет");
        }
    }
}
