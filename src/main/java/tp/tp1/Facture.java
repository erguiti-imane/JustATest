package tp.tp1;

public class Facture implements Ifacture{

    public double getFraisTransport(double montant){
        if(montant < 600) return 45;
        else return 0;
    }

    @Override
    public double getMontantFacture() {
        return 0;
    }

}
