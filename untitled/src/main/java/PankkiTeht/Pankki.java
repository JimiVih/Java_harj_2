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

    public static void PoistaTili(String tilinumero){
        ArrayList<Pankkitili> valiaikainenArr = new ArrayList<>();
        String poistettuTili = "";

        for (int i = 0; i < tilienMäärä - 1; i++) {
            if (pankkitilit.get(i).tilinumero == tilinumero){
                poistettuTili = pankkitilit.get(i).tilinumero;
                pankkitilit.remove(i);
            }
            else{
                valiaikainenArr.add(pankkitilit.get(i));
            }
        }
        tilienMäärä = pankkitilit.size();
        System.out.println("Nykyiset tilit:");

        for (int i = 0; i < tilienMäärä - 1; i++) {
            pankkitilit.add(valiaikainenArr.get(i));
            System.out.println(pankkitilit.get(i).tilinumero);
        }

        System.out.println(poistettuTili + " poistettu onnistuneesti");


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
            //NOSTA RAHAA
            case 0:
                tulostus = tili.Nosta(_rahasumma);
                break;

            //TALLETA RAHAA
            case 1:
                tulostus = tili.Talleta(_rahasumma);
                break;

            //TULOSTA SALDO
            case 2:
                tulostus = tili.Tulosta();
                break;

            //TULOSTA KAIKKI TIEDOT
            case 3:
                tulostus = tili.TulostaTiedot();
                break;

            case 4:
                PoistaTili(_tilinumero);
                break;

        }
        return tulostus;
    }
}
