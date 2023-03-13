package beispiel1_Raumschiff.exceptions.ue.transporter;

public class Episode42Demo {
    public static void main(String[] args){

        Transporter transporter = new Transporter();
        Starship enterprise = new Starship("Enterprise", transporter);

        try {
            enterprise.beamUp("Captain Kirk", "Riga IV");
        } catch (RuntimeException rte){      //ganzer try catch block eigentlich unnötig - muss eine runtime exception nicht noch einmal catchen; könnte ich auch weglassen!
            System.out.println("Beamen hat nicht funktioniert - Vorgang wiederholen");
            System.out.println(rte.getMessage());  //eigentlich unnötig gibt printStackTrace auch aus
            rte.printStackTrace(); //default message - kommt als letztes egal wo sie in scope steht
        }




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
