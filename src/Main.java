public class Main {
    public static void main(String[] args) {

        int ticketPriceInKopecks = 13500_00; //в копейках
        int bonusInKopecks = 20_00; //в копейках
        int totalMills = ticketPriceInKopecks / bonusInKopecks;  //бонусные мили

        System.out.println("При покупке билета на сумму " + ticketPriceInKopecks / 100 + " руб. Вам начислено " + totalMills + " бонусных миль");

    }
}
