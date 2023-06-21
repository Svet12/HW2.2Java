// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int ontheac = 23;
        int dep = 1456;
        int total = ontheac + dep;
        int bonuses;
        if (total > 1000) {
            bonuses = total / 100;
            System.out.println("Начислено бонусов");
            System.out.println(bonuses);

        } else {
            System.out.println("Сумма пополнения не соответствует условия акции");
        }


    }
}