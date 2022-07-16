/*
Завершите программу таким образом, чтобы она вывела числа от 1 до 5, каждое на новой строке.

Sample Input:
Sample Output:
1
2
3
4
5

 */

public class ex070 {
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x < 6);
    }
}
