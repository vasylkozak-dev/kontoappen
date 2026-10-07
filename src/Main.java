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
            choice = enterInt(scanner);

            if (choice == 1) {
                System.out.println("Namn: ");
                String name = enterName(scanner);
                System.out.println("Startsaldo: ");
                int balance = enterInt(scanner);

                while (balance < 0) {
                    System.out.println("Saldo kan inte vara negativt. Försök igen: ");
                    balance = enterInt(scanner);
                }
                register.newAccount(name, balance);
                    System.out.println("Kontot skapat");
            } else if (choice == 2) {
                register.printAllAccounts();
            } else if (choice == 3) {
                System.out.println("Namn: ");
                String name = enterName(scanner);
                Account found = register.findAccount(name);
                    while (found == null) {
                        System.out.println("Kontot saknas. Vill du prova igen? Skriv namn: ");
                        name = enterName(scanner);
                        found = register.findAccount(name);

                    }
                        System.out.println("Ange belopp: ");
                        int amount = enterInt(scanner);
                        found.deposit(amount);
            } else if (choice == 4) {
                System.out.println("Namn: ");
                String name = enterName(scanner);
                Account found = register.findAccount(name);
                    while (found == null) {
                        System.out.println("Kontot saknas. Vill du prova igen? Skriv namn: ");
                        name = enterName(scanner);
                        found = register.findAccount(name);
                    }
                        System.out.println("Ange belopp för uttag: ");
                        int amount = enterInt(scanner);
                        found.withdraw(amount);
            } else if (choice == 5) {
                System.out.println("Hej då!");
            } else {
                System.out.println("Ogiltigt val. Välj en siffra från menyn");
            }

            }

        }

        public static int enterInt(Scanner scanner) {

            while (!scanner.hasNextInt()) {
                System.out.println("Ogiltig inmatning. Ange ett heltal.");
                scanner.nextLine();
            }
            int number = scanner.nextInt();
            scanner.nextLine();
            return number;
        }

        public static String enterName(Scanner scanner) {
            String name = scanner.nextLine();

            while (name.isBlank()) {
                System.out.println("Ogiltigt val. Skriv namn");
                name = scanner.nextLine();
            }
            return name;
        }
}
