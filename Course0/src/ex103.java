/*
На вход подаётся строка текста. Определите, в каком по счёту слове этого
предложения меньше всего букв, и выведите на печать. Если таких слов несколько,
выведите номер первого по порядку.


Sample Input:
Java is good

Sample Output:
2

 */

import java.util.Scanner;

public class ex103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] datastr = str.split(" ");
        int min = datastr[0].length();
        int minPos = 0;
        for (int i = 0; i < datastr.length; i++) {
            if (datastr[i].length() < min) {
                min = datastr[i].length();
                minPos = i;
            }
        }

        System.out.println(minPos + 1);

    }
}
