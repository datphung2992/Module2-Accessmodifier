package accessmodifier;

public class BankAccount {
    public int accountNumber;
    public String ownerName;
    private double balance;

    public BankAccount(int accountNumber, String ownerName, double initiaBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (initiaBalance < 0) {
            System.out.println("Balance Error!!!");
            this.balance = 0;
        } else {
            this.balance = initiaBalance;
        }

    }

    public void deposit(double amount){
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Successfull");
            System.out.println("Your Balance is " + balance);
        } else {
            System.out.println("Error!!!");
        }
    }    

    public void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("Error!!!");
        } else if (amount > balance){
            System.out.println("Balance is not enough!!!");
            System.out.println("Balance is " + balance);
        } else {
            balance = balance - amount;
            System.out.println("Withdraw Successfull");
            System.out.println("Your Balance is " + balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
