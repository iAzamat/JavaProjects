/*
Задача повышенной сложности
На числовой прямой даны два отрезка, заданных парами целых чисел:
[a_1, b_1] и
[a_2, b_2]
Напишите программу, которая находит их пересечение.

Если пересечение - отрезок, необходимо вывести два числа (границы отрезка),
если единственная точка - единственное число (точку),
если пересечения нет - вывести фразу "Пересечения нет" (без кавычек).

Sample Input 1:
2 5
6 10

Sample Output 1:
Пересечения нет

Sample Input 2:
2 5
4 10

Sample Output 2:
4 5

 */

import java.util.Scanner;

public class ex056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        if ((a1 < a2) && (b1 < a2)) {    //1
            System.out.println("Пересечения нет");
        } else if ((a2 < a1) && (b2 < a1)) {    //2
            System.out.println("Пересечения нет");
        } else if ((a1 < a2) && (b2 < b1)) {   //3
            System.out.println(a2 + " " + b2);
        } else if ((a1 < a2) && (b1 > a2) && (b2 > b1)) {  //4
            System.out.println(a2 + " " + b1);
        } else if ((a2 < a1) && (b2 > a1) && (b1 > b2)) {  //5
            System.out.println(a1 + " " + b2);
        } else if ((a2 < a1) && (b1 < b2)) {  //6
            System.out.println(a1 + " " + b1);
        } else if ((a1 < a2) && (b1 == a2) && (b2 > b1)) { //7
            System.out.println(b1);
        } else if ((a2 < a1) && (b2 == a1) && (b1 > b2)) {  //8
            System.out.println(a1);
        } else if ((a1 == a2) && (b1 == b2)) {                //9
            System.out.println(a1 + " " + b1);
        } else if ((a1 == a2) && (b1 < b2)) {  //10
            System.out.println(a1 + " " + b1);
        } else if ((a2 < a1) && (b1 == b2)) {  //11
            System.out.println(a1 + " " + b1);
        } else if ((a1 < a2) && (b1 == b2)) { //12
            System.out.println(a2 + " " + b2);
        } else if ((a1 == a2) && (b1 > b2)) { //13
            System.out.println(a2 + " " + b2);
        }
    }
}
