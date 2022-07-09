public class Main {
    public static void main(String[] args) {
        int[] firstVector = {1, 8};
        int[] secondVector = {6, 3};
        int scalarProduct = 0;
        int index = 0;
        if (firstVector.length == secondVector.length) {
            int size = firstVector.length;
            while (index < size) {
                scalarProduct = scalarProduct + firstVector[index] * secondVector[index];
                index++;
            }
            System.out.println("Скалярное произведение равно " + scalarProduct);
        } else System.out.println("Размерности векторов не совпадают, пожалуйста исправьте ");
    }
}