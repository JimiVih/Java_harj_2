package PankkiTeht;
public class Pankkitili {
    final public String tilinumero;
    protected int saldo = 0;
    protected String omistaja = "";

    Pankkitili(String _omistaja, String _tilinumero, int _saldo){
        tilinumero = _tilinumero;
        saldo = _saldo;
        omistaja = _omistaja;
    }

    public String Nosta(int nostettavaSumma){
        return "Nostit: " + nostettavaSumma + "€ tililtäsi";
    }

    public String Talleta(int talletettavaSumma){
        return "Talletit: " + talletettavaSumma + "€ tilillesi";
    }

    public String Tulosta(){
        return "Tilisi saldo on: " + saldo + "€";
    }

    protected String TulostaTiedot(){
        return "Omistaja: " + omistaja + " Tilinumero: " + tilinumero + " Saldo: " + saldo + "€";
    }

}
