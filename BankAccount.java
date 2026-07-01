public class BankAccount{
    private String name;
    private double balance;
    private String Accno;

    public BankAccount(String name, double balance, String Accno){
        this.name = name;
        this.balance = balance;
        this.Accno = account;
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
        return this.balance;
    }
} 

