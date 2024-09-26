package Bank;
import java.util.HashMap;
import java.util.Map;

    class Bank {
        String name;
        String currency;
        Map<String, BankAccount> accounts = new HashMap<>();

        public Bank(String name, String currency) {
            this.name = name;
            this.currency = currency;
        }

        public String getName() {
            return name;
        }

        public String getCurrency() {
            return currency;
        }

        public void addAccount(BankAccount account) {
            accounts.put(account.getAccountNumber(), account);
        }

        public BankAccount getAccount(String accountNumber) {
            return accounts.get(accountNumber);
        }

        public boolean hasAccount(String accountNumber) {
            return accounts.containsKey(accountNumber);
        }
    }

