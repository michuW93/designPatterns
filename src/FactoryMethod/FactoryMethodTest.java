package FactoryMethod;

public class FactoryMethodTest {
    public static void main(String[] args){
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        simplePizzaFactory.createPizza("Chicago");

        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("Chicago");
    }
}
