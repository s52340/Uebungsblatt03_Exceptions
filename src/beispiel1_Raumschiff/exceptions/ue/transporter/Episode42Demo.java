package beispiel1_Raumschiff.exceptions.ue.transporter;

public class Episode42Demo {
    public static void main(String[] args) throws TransporterMalfunctionException {

        Transporter transporter = new Transporter();
        Starship enterprise = new Starship("Enterprise", transporter);

        enterprise.beamUp("Captain Kirk","Riga IV");
/*
        try {
            transporter.beam("Maddi", "Australia", "Austria", false);
        } catch (TransporterMalfunctionException e) {
            throw new RuntimeException(e);
        }

*/
        /**
         * RuntimeException? richtig? :///
         */
    }
}
