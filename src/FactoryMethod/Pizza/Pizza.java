package FactoryMethod.Pizza;

public abstract class Pizza {
    public abstract void prepare();

    public void bake(){
        System.out.println("Bake pizza");
    }

    public abstract void cut();

    public abstract void box();
}
