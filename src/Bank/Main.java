package Bank;

public class Main {    public static void main(String[] args) {
    Bank bank1 = new Bank("Bank A", "USD");
    Bank bank2 = new Bank("Bank B", "EUR");

    BankAccount account1 = new BankAccount("333", "Olya", bank1, 1000);
    BankAccount account2 = new BankAccount("666", "Dasha", bank2, 700);
    BankAccount account3 = new BankAccount("999", "Danya", bank1, 800);

    System.out.println("Initial balance of account1: " + account1.getBalance());
    System.out.println("Initial balance of account2: " + account2.getBalance());
    System.out.println("Initial balance of account3: " + account3.getBalance());

    // Переказ між власними рахунками в різних банках
    account1.transfer(account2, 100);

    // Переказ між різними користувачами в одному банку
    account1.transfer(account3, 200);

    // Переказ між різними користувачами в різних банках
    account2.transfer(account3, 100);

    System.out.println("Final balance of account1: " + account1.getBalance());
    System.out.println("Final balance of account2: " + account2.getBalance());
    System.out.println("Final balance of account3: " + account3.getBalance());
    }
    }


