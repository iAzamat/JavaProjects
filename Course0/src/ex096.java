/*На вход подаётся натуральное число n > 0, на следующей строке -
последовательность целых чисел, а затем - индекс id < n. Создайте из неё массив и
выведите на печать значение элемента массива c индексом id.

Sample Input:
5
1 2 3 4 5
1

Sample Output:
2

*/

import java.util.Scanner;

public class ex096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int id = sc.nextInt();
        System.out.println(numbers[id]);

    }
}
