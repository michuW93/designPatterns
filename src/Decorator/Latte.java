package Decorator;

public class Latte extends Beverage {

    public Latte() {
        description = "latte";
    }

    @Override
    public double cost() {
        return 9.5;
    }
}
