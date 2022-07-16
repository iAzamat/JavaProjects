/*
На вход подаются целые числа x и y.
Выведите их сумму и разность в формате, соответствующем примеру.

Sample Input:
10 5
Sample Output:

Сложение: 10 + 5 = 15
Вычитание: 10 - 5 = 5
 */

import java.util.Scanner;

public class ex040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Сложение: " + x + " + " + y + " = " + (x + y));
        System.out.println("Вычитание: " + x + " - " + y + " = " + (x - y));
    }
}
