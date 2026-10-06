public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Beloppet måste vara större än 0");
        } else {
            balance = balance + amount;
            System.out.println("Insättning lyckades. Saldo: " + balance);
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Beloppet måste vara större än 0");
        } else if (amount > balance) {
            System.out.println("Otillräckligt saldo");
        } else {
            balance = balance - amount;
            System.out.println("Uttaget lyckades. Saldo: " + balance);
        }
    }
}
