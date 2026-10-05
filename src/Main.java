import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AccountRegister register = new AccountRegister();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        System.out.println("=== Kontoappen ===");

        while (choice != 5) {
            System.out.println("1. Skapa konto");
            System.out.println("2. Lista konton");
            System.out.println("3. Sätt in pengar");
            System.out.println("4. Ta ut pengar");
            System.out.println("5. Avsluta");
            System.out.println("Val: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Namn: ");
                String name = scanner.nextLine();
                System.out.println("Startsaldo: ");
                double balance = scanner.nextInt();
                scanner.nextLine();
                register.newAccount(name, balance);
                        System.out.println("Kontot skapat");
            }
            if (choice == 2) {
                register.printAllAccounts();
                choice = scanner.nextInt();
                scanner.nextLine();
            } else if (choice == 3) {
                System.out.println("Namn: ");
                String name = scanner.nextLine();
                Account found = register.findAccount(name);
                while (found == null) {
                    System.out.println("Kontot finns inte. Vill du prova igen? Skriv namn: ");
                    name = scanner.nextLine();
                    found = register.findAccount(name);
                }
                    System.out.println("Ange belopp: ");
                    double amount = scanner.nextInt();
                    found.deposit(amount);
                    System.out.println("Insättning lyckades. Saldo: " + found.getBalance());
                    choice = scanner.nextInt();
                    scanner.nextLine();
                }

            }
        }
}
