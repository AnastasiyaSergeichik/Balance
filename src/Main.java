public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int mindeposit = 1000;
        int refill = 1100;
        int spent = 100;
        int charge = 1;
        int bonus;
        int allbalance;
        if (refill >= mindeposit) {
            bonus = refill / spent * charge;
            allbalance = balance + refill + bonus;
        } else {
            bonus = 0;
            allbalance = balance + refill + bonus;
        }
        System.out.print("Бонус: ");
        System.out.println(bonus);
        System.out.print("Состояние счета: ");
        System.out.println(allbalance);
    }

}
