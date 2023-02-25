package lesson_3;
// Объявляете переменные для входных данных и
// параметров программы: начального счёта,
// суммы пополнения и тп

// Условным оператором проверяете, превысила ли
// сумма пополнения порог, и для этих двух разных
// сценариев рассчитываете сумму бонуса и выводите
// на экран.

public class Task2 {
    public static void main(String[] args) {
        int user_money = 300;
        int replenishment = 2300;
        int number_bonus = 0;
        if (replenishment>=1000) {
            number_bonus = replenishment / 100;
        }
        int new_sum = user_money + replenishment + number_bonus;

        System.out.println("Итоговый счет " + new_sum);
        System.out.println("Число бонусов " + number_bonus);
    }
}