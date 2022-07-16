/*
Рептилоиды с планеты Нибиру измеряют время исключительно в секундах.
Помогите рептилоидам разобраться, какой промежуток времени в секундах проходит за n земных дней.

На вход программа получает n - количество дней.

На выходе программа должна вывести количество секунд в этом количестве дней.

Sample Input:
12

Sample Output:
1036800

 */

import java.util.Scanner;

public class ex037_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sec = n * 24 * 60 * 60;
        System.out.println(sec);
    }
}
