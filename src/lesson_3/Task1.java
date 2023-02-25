package lesson_3;
// Объявляете переменные для входных данных и
// параметров программы: одну для хранения
// стоимости билета, другую для хранения количества
// рублей для одной бонусной мили

// Рассчитываете количество бонусных миль, используя
// значения заведённых переменных. Ответ сохраняете в
// новую переменную и выводите на экран

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость билета:");
        int user_input = scanner.nextInt();
        int quantity_bonus = user_input / 20;
        System.out.println("Вам начислено " + quantity_bonus + " бонусов");
    }
}