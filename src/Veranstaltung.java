import java.util.ArrayList;

public class Veranstaltung {
    private String event;
    private ArrayList<Saalplan> saalplanliste;

    public Veranstaltung(String event) {
        this.event = event;
        this.saalplanliste= new ArrayList<Saalplan>();
    }

    public String getEvent() {
        return event;
    }

    public ArrayList<Saalplan> getSaalplaene() {
        return saalplanliste;
    }

    public void addSaalplan(Saalplan saalplan){
        this.saalplanliste.add(saalplan);
    }
}
