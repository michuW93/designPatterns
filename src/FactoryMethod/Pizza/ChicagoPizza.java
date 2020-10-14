package FactoryMethod.Pizza;

public class ChicagoPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Chicago");
    }

    @Override
    public void cut() {
        System.out.println("Cut Chicago into 8 pieces");
    }

    @Override
    public void box() {
        System.out.println("Box Chicago");
    }
}
