package Command.SimpleCase;

public class StockTest {
    public static void main(String[] args) {
        Stock warsawStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(warsawStock);
        SellStock sellStockOrder = new SellStock(warsawStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.takeOrder(buyStockOrder);

        broker.placeOrders();
    }
}