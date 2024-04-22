public class BilletIDøren implements Billet{

    private final String billetType = "Standard billet - døren";
    private int billetPris = 150;
    private int billetId = 0;

    //Constructor
    public BilletIDøren(){
    }


    @Override
    public void beregnBilletPris() {



    }

    @Override
    public void udskrivBillet() {

    }

    @Override
    public String toString() {
        return  "BilletId: " + billetId + ", billetType: ='" + billetType + ", billetPris:" + billetPris;
    }
}
