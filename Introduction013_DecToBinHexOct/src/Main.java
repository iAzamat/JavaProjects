import java.util.Scanner;

public class Main {

    public static void DectoBin(int a) {
        int b;
        int c = a;
        String temp = "";
        while (a != 0) {
            b = a % 2;
            temp = b + temp;
            a = a / 2;
        }
        System.out.print(c + " => " + temp + "\n");
    }

    public static void DectoOct(int a) {
        int b;
        int c = a;
        String temp = "";
        while (a != 0) {
            b = a % 8;
            temp = b + temp;
            a = a / 8;
        }
        System.out.print(c + " => " + temp + "\n");
    }

    public static void DectoHex(int a) {
        int b;
        int c = a;
        String hex = "";
        String temp = "";
        while (a != 0) {
            b = a % 16;
            if (b == 10) {
                hex = "A";
            }
            ;
            if (b == 11) {
                hex = "B";
            }
            ;
            if (b == 12) {
                hex = "C";
            }
            ;
            if (b == 13) {
                hex = "D";
            }
            ;
            if (b == 14) {
                hex = "E";
            }
            ;
            if (b == 15) {
                hex = "F";
            }
            ;
            if (b >= 0 && b <= 9) {
                hex = String.valueOf(b);
            }
            ;
            temp = hex + temp;
            a = a / 16;
        }
        System.out.print(c + " => " + temp + "\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число которое нужно перевести из 10 системы счисления в 2, 8, 16  ");
        int number = sc.nextInt();
        DectoBin(number);
        DectoHex(number);
        DectoOct(number);
    }
}


