/*
ООО "Круче Гугла" нанимает Java-разработчиков.
Месячный бюджет на зарплату разработчиков - X, зарплата одного разработчика - Y.
Выведите на печать в одной строке через пробел,
какое максимальное количество разработчиков компания сможет нанять,
и какое количество денег из ежемесячного бюджета останется неиспользованным.
 Sample Input:
 16 5
Sample Output:
3 1

*/

import java.util.Scanner;

public class ex021_oper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max = x / y;
        int ost = x % y;
        System.out.println(max + " " + ost);
    }
}
