package beispiel2_Bank.exceptions.ue.account;

public class AccountNotFoundException extends BankException{
    public AccountNotFoundException(String message) {
        super(message);
    }
}
