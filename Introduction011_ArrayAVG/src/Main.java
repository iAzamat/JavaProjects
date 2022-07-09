import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 4
        int[] A = {9, 5, 8, 6, 19};
        int N = A.length;
        int i = 0;
        double Avg = 0;
        int Sum = 0;

        System.out.println("Заданный массив");
        String intArrayString = Arrays.toString(A);
        System.out.println(intArrayString);

        while (i < N) {
            Sum += A[i];
            i += 1;
        }
        Avg = (double) Sum / N;
        System.out.println("Среднее арифметическое равно " + Avg);

    }
}