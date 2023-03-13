package beispiel1_Raumschiff.exceptions.ue.transporter;

public class Starship {
    private String name;
    private Transporter transporter;


    public Starship(String name, Transporter transporter) {
        this.name = name;
        this.transporter = transporter;
    }

    //throw new RuntimeException richtig? (gewrappt)
    public void beamUp(String person, String from){
        try {
            transporter.beam(person, from, name, true);
            System.out.println(person + " wurde erfolgreich nach " + name + " gebeamt." );
        } catch (TransporterMalfunctionException e) {
            throw new RuntimeException(e);
        } finally {
            transporter.shutdown();
        }
    }
}
