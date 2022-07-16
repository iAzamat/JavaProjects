/*
На вход подаётся последовательность слов.
Посчитайте общее количество введённых слов.

Примечание. Так как маркер конца последовательности в этой задаче отсутствует,
будет удобно воспользоваться методом hasNext(). Найдите самостоятельно, как он работает.

Sample Input:
Java
Python
C++
Go
PHP

Sample Output:
5

 */

import java.util.Scanner;
public class ex069 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text="";
        int i=0;
        //while(sc.hasNext()==true){
        System.out.println("Вводите значения через пробел или enter. q - выход");
        while(!sc.hasNext("q")){
            text=sc.next();
            i+=1;
        }
        System.out.println(i);
    }
}
