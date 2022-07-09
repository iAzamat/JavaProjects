public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 8, 3, 2, 6};
        int size = 5;
        int index = 0;
        int max = numbers[0];
        while (index < size) {
            if (numbers[index] > max) {
                max = numbers[index];
            }
            index++;
        }
        System.out.println("Максимальное число найдено и равно " + max);
    }
}