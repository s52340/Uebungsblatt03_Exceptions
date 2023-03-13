package beispiel1_Raumschiff.exceptions.ue.transporter;

public class Transporter {


    public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException {
        if (urgent == true) {
            double random = Math.random();
            if (random < 0.5) {
                throw new TransporterMalfunctionException("Fehlfunktion - Ausfall - bitte erneut versuchen");
            }
        }

    }

    public void shutdown(){
        System.out.println("Shutdown Vorgang wurde durchgeführt");
    }
}
