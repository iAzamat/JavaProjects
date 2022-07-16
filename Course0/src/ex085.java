/*
Тригонометрические функции
Math.sin(x) - возвращает синус угла, равного х радиан.
Math.cos(x) - возвращает косинус угла, равного х радиан.
Math.tan(x) - возвращает тангенс угла, равного х радиан.
Math.toDegrees(x) - переводит угол из радиан в градусы.
Math.toRadians(x) - переводит угол из градусов в радианы.

Дан угол \alpha градусов. Выведите значение угла в радианах.

Sample Input 1:
90

Sample Output 1:
1.5707963267948966

Sample Input 2:
0

Sample Output 2:
0.0

 */

import java.util.Scanner;

public class ex085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alpha = sc.nextDouble();
        System.out.println(Math.toRadians(alpha));
    }
}
