import java.util.ArrayList;

public class SolgteBilletter {

    //Attributter
    private ArrayList<Billet> solgteBilletter;

    //Constructor

    public SolgteBilletter() {
        solgteBilletter = tilføjSolgteBilletter();
    }


    //Metoder

    public void tilføjSolgteBilletter(){
        Billet billet1 = new BilletForsalg(12, 25);
        Billet billet2 = new BilletForsalg(5, 28);
        Billet billet3 = new BilletForsalg(30, 86);
        Billet billet4 = new BilletForsalg(8, 17);
        Billet billet5 = new BilletForsalg(23, 117);
        Billet billet6 = new BilletIDøren();
        Billet billet7 = new BilletIDøren();
        Billet billet8 = new BilletIDøren();
    }
}

public void hentAlleStudiekortId(){
    //skal være sorteret med mindste nummer først
}
