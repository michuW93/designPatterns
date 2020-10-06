package Decorator;

public class DecoratorCaffeeTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);

        System.out.println(beverage.getDescription() + " " + beverage.cost());
    }
}
