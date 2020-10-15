package Command.SimpleCase;

public class Stock {
    private String name;
    private int quantity = 5;

    public Stock(String name) {
        this.name = name;
    }

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity +" ]bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity +" ]sold ");
    }
}
