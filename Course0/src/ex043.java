/*
На первой строке подаётся пароль, хранящийся в базе данных,
на второй - пароль, введённый пользователем.
Выведите на печать фразу "Access is granted",
если пользователь ввёл верный пароль, и "Access is denied" - если нет.

Sample Input:
111111
111111

Sample Output:
Access is granted

 */

import java.util.Scanner;

public class ex043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textA = sc.nextLine();
        String textB = sc.nextLine();
        if (textA.equals(textB)) {
            System.out.println("Access is granted");
        } else System.out.println("Access is denied");
    }
}
