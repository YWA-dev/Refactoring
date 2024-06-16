import java.sql.Array;
import java.util.ArrayList;

public class Saalplan {
    private String standort;
    private int saalgroesse;
    private String date;
    private Veranstaltung event;
    private ArrayList<Platz> plaetze;

    public Saalplan(String standort, int saalgroesse, String date, Veranstaltung event) {
        this.standort = standort;
        this.saalgroesse = saalgroesse;
        this.date = date;
        this.event = event;
        this.plaetze = new ArrayList<Platz>();
        for (int i = 0; i < saalgroesse; i++) {
            plaetze.add(new Platz(i));

        }
    }

    public void setPlatzBesetzt(int platzNr){
        for (Platz platz:plaetze){
            if (!platz.isBelegt()&&platz.getPlatznr()==platzNr){
                platz.setBelegt(true);
                break;
            }
        }
    }
    public int getUnbesetztePlaetze(){
        int unbesetzerPlatz =0;
        for (Platz platz:plaetze){
            if (!platz.isBelegt()){
                unbesetzerPlatz++;

            }
        }
        return unbesetzerPlatz;

    }

    public String getStandort() {
        return standort;
    }

    public int getSaalgroesse() {
        return saalgroesse;
    }

    public String getDate() {
        return date;
    }

    public Veranstaltung getEvent() {
        return event;
    }

    public void ausfgabe(){
        System.out.println("Veranstaltung" + event.getEvent());
        System.out.println("Ort:"+standort);
        System.out.println("Saalgroeße"+saalgroesse);
        System.out.println("Unbesetzte Plätze"+ getUnbesetztePlaetze());
    }
}
