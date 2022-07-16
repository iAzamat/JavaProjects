/*
На вход подается строка, а затем слово.
Выведите true, если слово содержится в строке, и false - если нет, без учёта регистров.

Sample Input:
abracadabra
Cadabra

Sample Output:
true

 */

import java.util.Scanner;
public class ex060_test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine().toUpperCase();
        String word=sc.nextLine().toUpperCase();
        System.out.println(text.contains(word));
    }
}
