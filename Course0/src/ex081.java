/*
Предположим, что мы работаем с последовательностью такого вида:
1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, ... .
Выведите на печать n (n > 0) членов данной последовательности в одну строку через пробел.

Sample Input:
5

Sample Output:
1 2 2 3 3

 */

import java.util.Scanner;

public class ex081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (count == N) {
                    break;
                }
                System.out.print(i + " ");
                count += 1;
            }
        }
    }
}
