package PankkiTeht;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.random.*;

public class Pankki extends Pankkitili{

    public static List<Pankkitili> pankkitilit = new ArrayList<>();
    static int tilienMäärä = 0;

    Pankki() {
        super("Super", "1234123412341234", 0);
        ++tilienMäärä;
    }

    public static void LuoTili(String nimi, int _saldo){
        String tilinumero = "";

        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            int numeroYhd = rand.nextInt(1000,9999);
            tilinumero = tilinumero + Integer.toString(numeroYhd);

        }

        Pankkitili tili = new Pankkitili(nimi, tilinumero, _saldo);
        pankkitilit.add(tili);
        ++tilienMäärä;
        System.out.println("Tili " + tilienMäärä + ": " + tilinumero);

    }

    public static void PoistaTili(){

    }

    public static String TulostaTieto(int valinta, String tilinumero, int rahaSumma){
        Pankkitili tili = null;
        String _tilinumero = tilinumero;
        int _valinta = valinta;
        int _rahasumma = rahaSumma;
        String tulostus = "";

        for (int i = 0; i < tilienMäärä; i++) {
            if (pankkitilit.get(i).tilinumero == _tilinumero){
                tili = pankkitilit.get(i);
                break;
            }
        }

        switch (valinta){
            case 0:
                tulostus = tili.Nosta(rahaSumma);
                break;

            case 1:
                tulostus = tili.Talleta(rahaSumma);
                break;

            case 2:
                tulostus = tili.Tulosta();
                break;

            case 3:
                tulostus = tili.TulostaTiedot();
        }
        return tulostus;
    }
}
