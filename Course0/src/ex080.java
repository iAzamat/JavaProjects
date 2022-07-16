/*
Напечатайте "лесенку" из чисел от единицы до n, n > 0.

Примечание. Каждая строка в "лесенке" заканчивается цифрой (не пробелом).

Sample Input:
3

Sample Output:
1
1 2
1 2 3

 */

import java.util.Scanner;

public class ex080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++)
                if (j != i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j);
                }
            System.out.println();
        }
    }
}
