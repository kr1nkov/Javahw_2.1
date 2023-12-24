public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 1700;
        int score = balance + replenishment;

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет: " + (score + bonus));
        System.out.println("Итоговый бонус: " + bonus);
    }
}
