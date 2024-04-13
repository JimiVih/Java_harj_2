package org.example;

import java.lang.reflect.Array;

public class KaannaTeksti {
    public static String Kaanna(String sana) {
        int pituus = sana.length();
        char[] sanaArray = new char[pituus];
        String kaannettySana = "";

        for (int i = 0; i < pituus; i++)
        {
            sanaArray[i] = sana.charAt(i);
        }
        int j = sanaArray.length - 1;
        for (int i = 0; i < pituus; i++) {
            kaannettySana += sanaArray[j];
            --j;
        }
        return kaannettySana;

    }


}
