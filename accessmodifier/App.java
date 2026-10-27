package accessmodifier;

public class App {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(123456, "Dat Phung", 1000);
        
        System.out.println("Account Number: " + acc.accountNumber);
        System.out.println("Owner Name: " + acc.ownerName);

        acc.deposit(500);
        acc.withdraw(300);
    }
    
}
