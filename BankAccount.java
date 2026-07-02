public class BankAccount implements Asset{
    private String name;
    protected double balance;
    private String Accno;

    public BankAccount(String name, double balance, String Accno){
        this.name = name;
        this.balance = balance;
        this.Accno = Accno;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }
    public boolean withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            return true;
        } 
        else {
            System.out.println("Insufficient Funds");
            return false;
        }
    }
    public double getBalance(){
        System.out.println("Account no. :" + Accno);
        return this.balance;
    }

    public static void main(String[] args){
        BankAccount myAccount = new BankAccount("Alice",1000.0,"ACC123");
        myAccount.deposit(1000);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(500);
        myAccount.withdraw(6000);
        System.out.println(myAccount.getBalance());
    }

    @Override
    public double getValue(){
        return getBalance();
    }

} 





