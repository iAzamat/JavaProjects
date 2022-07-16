/*
На вход подаётся три числа. Выведите на одной строке их среднее арифметическое.
Sample Input:
1 3 5
Sample Output:
3.0

*/

import java.util.Scanner;

public class ex019_oper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double S = (a + b + c) / 3;
        System.out.println(S);

    }
}
