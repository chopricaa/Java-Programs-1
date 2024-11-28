package Practice;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Error: Account number cannot be null or empty.");
            return;
        }
        if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
            return;
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Account created successfully!");
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account validAccount = new Account("ACC123", 1000.0);
        Account invalidAccount1 = new Account(null, 500.0);
        Account invalidAccount2 = new Account("", 500.0);
        Account invalidAccount3 = new Account("ACC456", -100.0);
    }
}
