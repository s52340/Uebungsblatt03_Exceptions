package beispiel2_Bank.exceptions.ue.account;

import java.util.HashMap;

public class Bank {

    private HashMap<String, Account> accounts = new HashMap<>();


    public HashMap<String, Account> getAccounts() {
        return accounts;
    }

    public void addAccount(String owner, double balance, double overdraftFrame) throws BankException {
        Account account = new Account(owner,balance,overdraftFrame);
        if (accounts.containsValue(account.getOwner())){
            throw new BankException("Account hinzufügen nicht möglich da dieser Besitzer " + owner + "schon existiert");
        }
        accounts.put(owner, account);
    }

    public void transfer(String fromOwner, String toOwner, double amount) throws AccountNotFoundException, BankException {
        if ( !accounts.containsKey(fromOwner) || !accounts.containsKey(toOwner)) {
            throw new AccountNotFoundException("Account wurde nicht gefunden");
        }
        try {
            accounts.get(fromOwner).debit(amount);
            accounts.get(toOwner).credit(amount);
        } catch (NotEnoughMoneyException e) {
            throw new BankException("BankException");
        }



    }
}
