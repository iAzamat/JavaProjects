/*
ООО "Круче Гугла" наняло трёх разработчиков.
Внезапно разработчики узнали, что их зарплаты различаются.
Разработчики решили объявить забастовку, если разница максимальной
и минимальной зарплаты превысит определённый уровень.
Определите, грозит ли ООО "Круче Гугла" забастовка.

Формат ввода:
В первой строке - зарплаты разработчиков через пробел, три целых числа.
Во второй строке - разница, при превышении которой будет объявлена забастовка.
Формат вывода:
"Ура, бастуем!" - если критический уровень превышен;
"За работу, Солнце ещё высоко" - если критический уровень не превышен.

Sample Input:
300 400 500
100

Sample Output:
Ура, бастуем!

 */

import java.util.Scanner;

public class ex055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zpA = sc.nextInt();
        int zpB = sc.nextInt();
        int zpC = sc.nextInt();
        int zpK = sc.nextInt();
        int max = zpA;
        int min = zpA;
        if (max < zpB) max = zpB;
        if (max < zpC) max = zpC;
        if (min > zpB) min = zpB;
        if (min > zpC) min = zpC;
        if (max - min > zpK) {
            System.out.println("Ура, бастуем!");
        } else {
            System.out.println("За работу, Солнце ещё высоко");
        }
    }
}
