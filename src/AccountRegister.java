import java.util.ArrayList;
import java.util.List;

public class AccountRegister {

    private List<Account> accounts = new ArrayList<>();

    public void newAccount(String name, double balance) {
        Account account = new Account(name, balance);
        accounts.add(account);
    }

    public Account findAccount(String name) {
        for (int i = 0; i < accounts.size(); i++) {
            Account candidateAccount = accounts.get(i);

            if (candidateAccount.getName().equalsIgnoreCase(name)) {
                return candidateAccount;
            }

        }
        return null;
    }




}
