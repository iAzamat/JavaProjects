import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int A = sc.nextInt();
        System.out.print("Введите второе число: ");
        int B = sc.nextInt();
        System.out.print("Введите третье число: ");
        int C = sc.nextInt();
        System.out.print("Введите четвертое число: ");
        int D = sc.nextInt();
        float result = (float) (A + B + C + D) / 4;
        System.out.println("Среднее арифметическое из 4 чисел равно " + result);
    }
}