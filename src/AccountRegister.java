import java.util.ArrayList;
import java.util.List;

public class AccountRegister {

    private List<Account> accounts = new ArrayList<>();

    public void newAccount(String name, double balance) {
        Account account = new Account(name, balance);
        accounts.add(account);
    }





}
