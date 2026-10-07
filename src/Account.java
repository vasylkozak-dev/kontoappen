public class Account {

    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;

        if (balance < 0) {
            this.balance = 0;
            System.out.println("Negativt startsaldo är inte tillåtet. Saldo sätts till 0.");
        } else {
            this.balance = balance;
        }
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Beloppet måste vara större än 0");
        } else {
            balance = balance + amount;
            System.out.println("Insättning lyckades. Saldo: " + balance);
        }
    }
    public void withdraw(int amount) {
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
