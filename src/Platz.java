public class Platz {
    private int Platznr;
    private boolean belegt;
    public Platz(int Platznr){
        this.Platznr=Platznr;
        this.belegt=false;
    }

    public boolean isBelegt() {
        return belegt;
    }

    public void setBelegt(boolean belegt) {
        this.belegt = belegt;
    }

    public int getPlatznr() {
        return Platznr;
    }

}
