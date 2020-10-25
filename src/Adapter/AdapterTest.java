package Adapter;

public class AdapterTest {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("Turkey says:");
        turkey.gobble();
        turkey.fly();
        System.out.println("Duck says:");
        testDuck(duck);
        System.out.println("Turkey adapter says:");
        testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
