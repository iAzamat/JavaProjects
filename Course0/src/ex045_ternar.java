/*
Тернарный оператор

Тернарный оператор - это краткая альтернатива конструкции if/else.
К примеру, мы хотим проверить число на чётность, и вывести на печать соответствующий ответ.

int x = 24;

if (x % 2 == 0) {
    System.out.println("Число чётное");
} else {
    System.out.println("Число нечётное");
}
// Число чётное

С помощью тернарного оператора этот код можно уместить в одну строку.

int x = 15;

System.out.println((x % 2 == 0) ? "Число чётное" : "Число нечётное");

Вопросительный знак заменяет слово "if" и проверяет условие на истинность.
В случае, если условие истинно, выполняется выражение, следующее после вопросительного знака,
а если ложно - исполняется выражение после двоеточия, которое заменяет слово "else".

Использовать тернарный оператор рекомендуется, если проверяемое условие не очень сложное.
Использование тернарного оператора в запутанных логических конструкциях делает код нечитабельным и,
как следствие, плохим.
 */

/*
В 1997 году во время боксёрского боя за звание чемпиона мира Майк Тайсон откусил
ухо Эвандеру Холифилду (не целиком). Рефери нужно определить, как поступить.
Если откушенный кусок уха меньше норматива, бой продолжится.
Если нет - Майк Тайсон должен быть дисквалифицирован, и чемпионом становится Холифилд.

На вход подаются два числа -  масса откушенного куска уха и норматив.
Выведите "Бой продолжается!" или "Холифилд - чемпион!" в зависимости от выполнения условия.

Sample Input:
5 10

Sample Output:
Бой продолжается!

 */

import java.util.Scanner;

public class ex045_ternar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println((a < b) ? "Бой продолжается!" : "Холифилд - чемпион!");
    }
}
