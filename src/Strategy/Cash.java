package Strategy;

public class Cash implements PaymentStrategy {
    @Override
    public int pay(int amount) {
        System.out.println("Pay by cash: " + amount);
        return amount;
    }
}
