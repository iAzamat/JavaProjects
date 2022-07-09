import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 2 (подключение import java.util.Arrays;)
        int[] A = {9, 5, 8, 6, 19};
        int N = A.length;
        int Nopt = N / 2;
        int i = 0;
        int j = 0;

        System.out.println("Заданный массив");
        String intArrayString = Arrays.toString(A);
        System.out.println(intArrayString);

        while (i < Nopt) {
            int temp = A[i];
            A[i] = A[N - 1 - i];
            A[N - 1 - i] = temp;
            i += 1;
        }

        System.out.println("Перевернутый массив");
        intArrayString = Arrays.toString(A);
        System.out.println(intArrayString);
    }
}