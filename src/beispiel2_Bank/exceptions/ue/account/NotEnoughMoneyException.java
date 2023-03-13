package beispiel2_Bank.exceptions.ue.account;

public class NotEnoughMoneyException extends BankException{
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
