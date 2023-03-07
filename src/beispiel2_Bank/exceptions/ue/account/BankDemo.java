package beispiel2_Bank.exceptions.ue.account;

public class BankDemo {
    public static void main(String[] args) {

        Bank sparkasse = new Bank();
        try {
            sparkasse.addAccount("Bianca", 20.05, 30.00);
            sparkasse.addAccount("veri", 30.10, 100.00);
            sparkasse.transfer("Bianca", "veri", 50.05);
            System.out.println("Bianca: " + sparkasse.getAccounts().get("Bianca").getBalance());
            System.out.println("veri:" + sparkasse.getAccounts().get("veri").getBalance());
            //sparkasse.transfer("Bianca","veri",1.00);     //löst richtig aus
            //sparkasse.transfer("Heini", "Bianca", 15.45);   //löst richtig aus
            sparkasse.getAccounts().get("Bianca").credit(10.00);
            //sparkasse.getAccounts().get("Bianca").debit(10.00); //sollte eigentlich funktionieren
            System.out.println("Bianca: " + sparkasse.getAccounts().get("Bianca").getBalance());

        } catch (BankException e) {
            throw new RuntimeException(e);
        }

        /**
         * Runtime Exception falsch - wrapping ?? welche Parameter bei Exception? welche
         * Exception?? Catch ist falsch
         */
    }
}
