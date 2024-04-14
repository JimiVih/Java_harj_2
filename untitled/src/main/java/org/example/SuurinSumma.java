package org.example;

public class SuurinSumma {
    public static String Summa(int[] lukuJono){
        int[] _lukuJono = lukuJono;
        int suurinLuk = 0;
        int j = 0;
        int pituus = lukuJono.length - 1;

        if(pituus < 2){
            return "Lukujonossa täytyy olla vähintään 3 lukua. Anna anna lukujono jonka pituus on 3 tai enemmän";
        }


        for (int i = 0; i < pituus; i++) {
            j = i;
            int summa = 0;

            for (int k = 0; k < 3; k++) {
                summa = summa + _lukuJono[j];
                ++j;
                if(j > pituus){
                    break;
                }
                else {
                    continue;
                }
            }

            System.out.println(summa);
            if (j > pituus){
                if (suurinLuk == 0 || summa > suurinLuk){
                    suurinLuk = summa;
                }
                break;
            }
            else {


                if (suurinLuk == 0) {
                    suurinLuk = summa;
                    continue;
                } else {
                    if (summa > suurinLuk) {
                        suurinLuk = summa;
                    } else {
                        continue;
                    }
                }
            }
        }
        return "Suurin luku: " + Integer.toString(suurinLuk);
    }
}
