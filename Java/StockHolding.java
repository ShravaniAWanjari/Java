package Java;

public class StockHolding implements Asset {
    private double currentPrice;
    private int shares;

    public void StockHolding(double currentPrice, int shares) {
        this.currentPrice = currentPrice;
        this.shares = shares;
    }

    @Override
    public double getValue() {
        return currentPrice * shares;
    }
}