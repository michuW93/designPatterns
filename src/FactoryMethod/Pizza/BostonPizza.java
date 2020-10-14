package FactoryMethod.Pizza;

public class BostonPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Boston");
    }

    @Override
    public void cut() {
        System.out.println("Cut Boston into 15 pieces");
    }

    @Override
    public void box() {
        System.out.println("Box Boston");
    }
}
