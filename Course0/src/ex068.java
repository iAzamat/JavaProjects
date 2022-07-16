/*
Считайте со ввода последовательность целых чисел.
Последовательность оканчивается числом 0.

Выведите на печать сумму введённых чисел.

Sample Input:
1 2 3 4 5 0

Sample Output:
15

 */

import java.util.Scanner;

public class ex068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = sc.nextInt();
        while (i != 0) {
            sum += i;
            i = sc.nextInt();
        }
        System.out.println(sum);
    }
}
