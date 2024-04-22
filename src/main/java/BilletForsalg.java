public class BilletForsalg implements Billet{

    private final String billetType;
    private double billetPris;
    private int billetId = 0;
    private int studiekortID;
    private int dageTilEvent;

    //Constructor
    public BilletForsalg(int dageTilEvent, int studiekortID){
        this.dageTilEvent = dageTilEvent;
        this.studiekortID = studiekortID;
        billetType = "";
        billetPris = 0.0;
    }


    @Override
    public void beregnBilletPris(dageTilEvent, studiekortID) {
        //hvis studerende mindre end 10 dage til event pris = 90 kr.
        //hvis studerende mere end 10 dage til 76,5
        //alm forsalgspris mindre end 10 dage til event = 120 kr.
        //alm forsalgspris mere end 10 dage til 102 kr.

        if(dageTilEvent >= 10){
            if(studiekortID > 0) {
                billetType = "Standardbillet-forsalg-early bird";
                billetPris = 102.00;
                billetId++;
            } else {
                billetType = "Studiebillet-forsalg-early bird";
                billetPris = 76.50;
                billetId++;
            }
        } else {
            if(studiekortID > 0) {
                billetType = "Standardbillet-forsalg";
                billetPris = 120.00;
                billetId++;
            } else {
                billetType = "Studiebillet-forsalg";
                billetPris = 90.00;
                billetId++;
            }

        }
    }

    @Override
    public void udskrivBillet() {

    }

    public String getBilletType() {
        return billetType;
    }

    public double getBilletPris() {
        return billetPris;
    }

    public void setBilletPris(double billetPris) {
        this.billetPris = billetPris;
    }

    public int getBilletId() {
        return billetId;
    }

    public void setBilletId(int billetId) {
        this.billetId = billetId;
    }

    public String getStudiekortID() {
        return studiekortID;
    }

    public void setStudiekortID(String studiekortID) {
        this.studiekortID = studiekortID;
    }

    public int getDageTilEvent() {
        return dageTilEvent;
    }

    public void setDageTilEvent(int dageTilEvent) {
        this.dageTilEvent = dageTilEvent;
    }

    @Override
    public String toString() {
        return "BilletId: " + billetId + ", billetType: ='" + billetType + ", studiekortID: " +studiekortID + ", billetPris:" + billetPris;
    }
}
