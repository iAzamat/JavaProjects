import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число, факториал которого нужно вычислить: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            factorial = factorial * i;
        }
        System.out.println("Факториал числа " + N + " равен " + factorial);
    }
}