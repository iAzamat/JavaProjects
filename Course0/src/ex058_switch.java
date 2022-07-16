/*
Доработайте программу так, чтобы она вывела на печать фразу We're the champions!

Sample Input:
Sample Output:
We're the champions!

 */


public class ex058_switch {
    public static void main(String[] args) {
        int x = 10;
        switch (x) {

            case 10:
                System.out.print("We're the champions!");
                break;

            default:
                System.out.print("We're lost ((");
        }
    }
}
