public class  CryptoWallet implements Asset{
    private String coinName;
    private final String walletAddress;
    private double bitcoinCount;
    private static double bitcoinPrice;

    public  CryptoWallet(String coinName, String walletAddress, double bitcoinCount,double bitcoinPrice){
        this.coinName = coinName;
        this.walletAddress = walletAddress;
        this.bitcoinCount = bitcoinCount;
        this.bitcoinPrice = bitcoinPrice;
    }

    @Override
    public double getValue(){
        return bitcoinCount * bitcoinPrice;
    }

}