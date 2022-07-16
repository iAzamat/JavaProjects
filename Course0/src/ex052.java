/*
На вход подаются целых три числа - день, месяц и год (по григорианскому календарю).
Выведите true, если эти числа составляют валидную дату, и false - в противном случае.

Sample Input 1:
25 8 2010

Sample Output 1:
true

Sample Input 2:
1 1 1

Sample Output 2:
true

 */

import java.util.Scanner;

public class ex052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int DD = sc.nextInt();
        int MM = sc.nextInt();
        int YY = sc.nextInt();
        boolean DATE = false;
        if ((DD > 0) && (MM > 0) && (YY > 0)) {
            if ((MM == 1 || MM == 3 || MM == 5 || MM == 7 || MM == 8 || MM == 10 || MM == 12) && (DD <= 31)) {
                DATE = true;
            }
            if ((MM == 4 || MM == 6 || MM == 9 || MM == 11) && (DD <= 30)) {
                DATE = true;
            }
            if ((MM == 2) && ((YY % 4 == 0) && (YY % 100 != 0) || (YY % 400 == 0)) && (DD <= 29)) {
                DATE = true;
            }
            if ((MM == 2) && (!((YY % 4 == 0) && (YY % 100 != 0) || (YY % 400 == 0))) && (DD <= 28)) {
                DATE = true;
            }
        }
        System.out.print(DATE);
    }
}
