/*
Создайте четыре переменных разного типа и выведите их на печать, каждое на новой строке. Присвойте переменным значения:
1)  2021
2)  3.1415
3)  Java
4) 5  < 10

Выведите значения переменных столбиком в этом же порядке.
Sample Input:
Sample Output:
2021
3.1415
Java
true
 */

public class ex005_var {
    public static void main(String[] args) {
        int god = 2021;
        double Pi = 3.1415;
        String text = "Java";
        boolean test = 5 < 10;
        System.out.println(god + "\n" + Pi + "\n" + text + "\n" + test + "\n");
    }
}
