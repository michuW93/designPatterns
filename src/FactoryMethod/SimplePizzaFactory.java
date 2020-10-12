package FactoryMethod;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        switch (type) {
            case "Chicago":
                pizza = new ChicagoPizza();
                break;
            case "Boston":
                pizza = new BostonPizza();
                break;
        }
        return pizza;
    }
}
