/*
На вход подаётся строка, а затем - одна буква.
Если строка содержит эту букву или строка длиннее 20 символов, выведите "YES",
в противном случае - "NO".


Sample Input:
This is a string
a

Sample Output:
YES

 */

import java.util.Scanner;

public class ex049_Logic_Constructs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textA = sc.nextLine();
        String textB = sc.next();
        if ((textA.length() > 20) || (textA.contains(textB))) {
            System.out.println("YES");
        } else System.out.println("NO");

    }
}
