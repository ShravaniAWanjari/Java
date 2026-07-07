package Java;

public class CryptoWallet implements Asset {
    private String coinName;
    private final String walletAddress;
    private double bitcoinCount;
    private static double bitcoinPrice;

    public CryptoWallet(String coinName, String walletAddress, double bitcoinCount, double bitcoinPrice) {
        this.coinName = coinName;
        this.walletAddress = walletAddress;
        this.bitcoinCount = bitcoinCount;
        this.bitcoinPrice = bitcoinPrice;
    }

    @Override
    public double getValue() {
        return bitcoinCount * bitcoinPrice;
    }

    public boolean withdrawCrypto(double amount) throws InsufficientFundsException {
        if (amount > getValue()) {
            throw new InsufficientFundsException("withdraw failed: insufficient funds");
        }

        bitcoinCount -= amount;
        return true;
    }

}

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
