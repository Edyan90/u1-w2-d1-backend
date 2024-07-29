package ex3;

public class ContoOnline extends ContoCorrente {

    private double maxPrelievo;

    public ContoOnline(String _titolare, double saldo, double maxP) {
        super(_titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public ContoOnline(String titolare, double saldo) {
        super(titolare, saldo);
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            throw new BancaException("hai superato il limite del prelievo");

        }
        super.preleva(x);
    }
}

