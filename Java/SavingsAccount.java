package Java;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String name, double balance, String Accno, double interestRate) {
        super(name, balance, Accno);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double current_balance = getBalance();

        double interest = current_balance * (interestRate / 100);

        deposit(interest);
    }

    @Override
    public boolean withdraw(double amount) {
        double current_balance = getBalance();
        if (current_balance - amount < 100) {
            System.out.println("Withdraw denied due to low account balance");
            return false;
        } else {
            return super.withdraw(amount);
        }
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("bob", 150.0, "SAV123", 5.0);

        savings.deposit(1000.0);
        savings.withdraw(60);
        savings.applyInterest();
        System.out.println("Final savings balance" + savings.getBalance());
    }

    public interface Asset {
        double getValue();
    }

}