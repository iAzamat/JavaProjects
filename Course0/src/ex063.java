/*

На вход подаются координаты точки x, y.
Определите, попадает ли точка в заштрихованную область.
Выведите "Yes", если попадает, и "No" - в противном случае.

Примечание. Считать, что граница принадлежит заштрихованной области.

Sample Input:
-0,5
0,5

Sample Output:
Yes

 */

import java.util.Scanner;

public class ex063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if ((y <= 2 - x * x && y >= 0) || (y <= 0 && y <= 2 - x * x && y >= x)) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
