package Bank;

class BankAccount {
    String accountNumber;
    String owner;
    Bank bank;
    double balance;

    public BankAccount(String accountNumber, String owner, Bank bank, double initialBalance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.bank = bank;
        this.balance = initialBalance;
        bank.addAccount(this);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void transfer(BankAccount targetAccount, double amount) {
        double conversionRate = getConversionRate(this.getBank().getCurrency(), targetAccount.getBank().getCurrency());
        double fee = calculateFee(this, targetAccount, amount);

        if (this.withdraw(amount)) {
            double amountToDeposit = amount * conversionRate - fee;
            targetAccount.deposit(amountToDeposit);
            System.out.println("Transfer  " + amountToDeposit + " to " + targetAccount.getAccountNumber());
        } else {
            System.out.println("Error!");
        }
    }

    private double getConversionRate(String fromCurrency, String toCurrency) {
        if (fromCurrency.equals(toCurrency)) {
            return 1.0;
        }
        return 41;
    }

    private double calculateFee(BankAccount x, BankAccount y, double amount) {
        if (x.getOwner().equals(y.getOwner())) {
            if (x.getBank().getName().equals(y.getBank().getName())) {
                return 0;
            } else {
                return amount * 0.02;
            }
        } else {
            if (x.getBank().getName().equals(y.getBank().getName())) {
                return amount * 0.03;
            } else {
                return amount * 0.06;
            }
        }
    }
}


