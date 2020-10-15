package Command.SimpleCase;

public class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock("Warsaw Stock");

        BuyStock buyStockOrder = new BuyStock(stock);
        SellStock sellStockOrder = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.takeOrder(buyStockOrder);

        broker.placeOrders();
    }
}