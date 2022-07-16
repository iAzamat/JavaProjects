/*
На вход подаются три слова на одной строке, разделённые пробелом.
Выведите их в алфавитном порядке. Гарантируется, что слова начинаются с разных букв.

Sample Input:
Python Java C++

Sample Output:
C++
Java
Python

 */

import java.util.Scanner;

public class ex053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordA = sc.next();
        int A = wordA.charAt(0);
        String wordB = sc.next();
        int B = wordB.charAt(0);
        String wordC = sc.next();
        int C = wordC.charAt(0);
        String f = "";
        String s = "";
        String t = "";
        if ((A < B && A < C) && (B < C)) {
            f = wordA;
            s = wordB;
            t = wordC;
        }
        if ((A < B && A < C) && (C < B)) {
            f = wordA;
            s = wordC;
            t = wordB;
        }
        if ((B < A && B < C) && (A < C)) {
            f = wordB;
            s = wordA;
            t = wordC;
        }
        if ((B < A && B < C) && (C < A)) {
            f = wordB;
            s = wordC;
            t = wordA;
        }
        if ((C < B && C < A) && (A < B)) {
            f = wordC;
            s = wordA;
            t = wordB;
        }
        if ((C < B && C < A) && (B < A)) {
            f = wordC;
            s = wordB;
            t = wordA;
        }
        System.out.println(f + "\n" + s + "\n" + t);
    }
}
