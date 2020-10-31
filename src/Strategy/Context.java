package Strategy;

public class Context {
    PaymentStrategy strategy;

    public Context(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int amount){
        return strategy.pay(amount);
    }
}
