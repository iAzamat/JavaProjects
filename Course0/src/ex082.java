/*
Объединим две предыдущие задачи.
Выведите "лесенку" из членов последовательности из предыдущего шага от единицы до n, n > 0.

Sample Input 1:
5

Sample Output 1:
1
1 2
1 2 2
1 2 2 3
1 2 2 3 3

Sample Input 2:
1

Sample Output 2:
1

 */

import java.util.Scanner;

public class ex082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int count = 1;
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    if (count <= i) {
                        System.out.print(j);
                    }
                    if (count < i) {
                        System.out.print(" ");
                    }
                    count += 1;
                }
            }
            if (i < N) {
                System.out.println("");
            }
        }
    }
}
