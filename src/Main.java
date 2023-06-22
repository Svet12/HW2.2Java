// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int balance = 23;
        int added = 315;
        int total = balance + added;
        int bonuses;
        if (total > 1000) {

            System.out.println("Баланс: " + (total));
            bonuses = total / 100;
            System.out.println("Начислено бонусов: " + (bonuses));

        } else {
            System.out.println("Сумма пополнения не соответствует условиям акции");
        }


    }
}