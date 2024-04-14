package PankkiTeht;
public class Pankkitili {
    static String tilinumero = "";
    int saldo = 0;
    String omistaja = "";



    String Nosta(int nostettavaSumma){
        return "Nostit: " + nostettavaSumma + "€ tililtäsi";
    }

    String Talleta(int talletettavaSumma){
        return "Talletit: " + talletettavaSumma + "€ tilillesi";
    }

    String Tulosta(){
        return "Tilisi saldo on: " + saldo + "€";
    }

    protected String TulostaTiedot(){
        return "Omistaja: " + omistaja + " Tilinumero: " + tilinumero + " Saldo: " + saldo + "€";
    }

}
