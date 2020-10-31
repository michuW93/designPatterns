package Strategy;

public class StrategyPatternTest {
    public static void main(String[] args){
        Context context = new Context(new Card());
        context.executeStrategy(10);

        context = new Context(new Cash());
        context.executeStrategy(15);
    }
}
