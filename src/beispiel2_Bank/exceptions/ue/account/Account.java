package beispiel2_Bank.exceptions.ue.account;

public class Account {
    private String owner;
    private double balance;         //Gleichgewicht/ Restbetrag
    private double overdraftFrame;  //Ueberziehungsrahmen

    public Account(String owner, double balance, double overdraftFrame) {
        this.owner = owner;
        this.balance = balance;
        this.overdraftFrame = overdraftFrame;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double getOverdraftFrame() {
        return overdraftFrame;
    }

    public void credit(double amount){
        balance = balance + amount;
    }

    public void debit(double amount) throws NotEnoughMoneyException {
        if (balance + overdraftFrame < amount){
            throw new NotEnoughMoneyException("Der Betrag übersteigt Ihren Überziehungsrahmen");
        }
        else {
            balance = balance - amount;
        }
    }


}
