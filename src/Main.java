public class Main {
    public static void main(String[] args) {
        System.out.println("Бонусы за пополнение баланса");

        int account = 100;
        int deposit = 50;

        int bonus;
        if (deposit > 1000) {
            bonus = deposit /100;
        } else {
            bonus = 0;

        }
        int status = account + deposit + bonus;
        System.out.println("Баланс Вашего счета:" + status);
        System.out.println("Бонусы на Вашем счету:" + bonus);
    }
}