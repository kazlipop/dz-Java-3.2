public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment;
        int limit = 1000;
        int bonus;

        replenishment = 10000;
        if(replenishment > limit) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int total = balance + replenishment + bonus;

        System.out.println(total);
    }
}