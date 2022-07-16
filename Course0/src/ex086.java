/*
Дан угол \alpha градусов. Выведите y=sin(α)+cos(α)

Sample Input:
90

Sample Output:
1.0

 */

import java.util.Scanner;

public class ex086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alphagr = sc.nextDouble();
        double alpha = Math.toRadians(alphagr);
        double y = 0;
        y = Math.sin(alpha) + Math.cos(alpha);
        System.out.println(y);
    }
}
