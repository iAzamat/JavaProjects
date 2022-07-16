/*
Реализуйте простой справочник по командам Java.
На вход подаётся команда, по которой необходима справка (ограничимся тремя командами).
В соответствии с этим выведите текст:

Ввод: System.out.println()
Вывод: Это команда вывода на печать

Ввод: if
Вывод: Это условный оператор

Ввод: else
Вывод: Это альтернативная конструкция условного оператора

Если введено что-либо другое, выведите фразу "Раздел в разработке" (без кавычек).

Sample Input:
System.out.println()
Sample Output:
Это команда вывода на печать

 */

import java.util.Scanner;
public class ex059 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        //System.out.println(text);
        switch (text){
            case "System.out.println()":
                System.out.println("Это команда вывода на печать");
                break;
            case "if":
                System.out.println("Это условный оператор");
                break;
            case "else":
                System.out.println("Это альтернативная конструкция условного оператора");
                break;
            default:
                System.out.println("Раздел в разработке");
        }

    }
}
