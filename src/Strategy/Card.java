package Strategy;

public class Card implements PaymentStrategy {
    @Override
    public int pay(int amount) {
        System.out.println("Pay by card: " + amount);
        return amount;
    }
}
