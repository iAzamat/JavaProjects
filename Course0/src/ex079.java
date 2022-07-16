/*
На вход подаётся несколько целых чисел.
Выведите эти числа, возведённые в степени от двух до пяти.
Формат вывода: для каждого введённого числа степени выводятся в отдельной строке через пробел.

Примечание. Каждая строка вывода оканчивается числом, а не пробелом.

Sample Input:
1 2 3

Sample Output:
1 1 1 1
4 8 16 32
9 27 81 243

 */


import java.util.Scanner;

public class ex079 {

    static int sq(int a, int x) {
        int result = (int) Math.pow(a, x);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите значения через пробел. q - выход");
        while (!sc.hasNext("q")) {
            int b = sc.nextInt();
            System.out.println(sq(b,2) + " " + sq(b,3) + " " + sq(b,4) + " " + sq(b,5));
        }
    }


}

