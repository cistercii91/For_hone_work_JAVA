public class Main {
    public static void main(String[] args) {
        System.out.println("Введите стоимость билета:");
        int userInput = 1120;
        int quantityBonus = userInput / 20;
        System.out.println("Вам начислено " + quantityBonus + " бонусов");
    }
}