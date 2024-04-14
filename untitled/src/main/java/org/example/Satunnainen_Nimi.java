package org.example;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Random;
import java.lang.System;
import java.io.Console.*;

public class Satunnainen_Nimi {


     public static String PalautaNimi(){
         String[] Etunimia = {"Matti", "Jorma", "Jarkko", "Jaakko", "Krista", "Jenni", "Lumi", "Taika", "Joonatan",
                 "Niko", "Rebecca", "Iiris", "Joni", "Matilda", "Maria", "Kristiina", "Matilda", "Reino", "Aino", "Veera"};
         String[] Sukunimia = {"Kivelä", "Järvinen", "Mattila", "Vihinen", "Jokela", "Vanhanen", "Jokisipilä", "Ainola",
                 "Kivinen", "Ollila", "Marttinen", "Jaakkola", "heinonen", "Heikkilä"};

        Random rand = new Random();
        int pituusEtu = Etunimia.length - 1;
        int pituusSuk = Sukunimia.length - 1;

        int randIntEtu = rand.nextInt(pituusEtu);
        int randIntSuku = rand.nextInt(pituusSuk);

        String Etunimi = Etunimia[randIntEtu];
        String Sukunimi = Sukunimia[randIntSuku];

        return Etunimi + " " + Sukunimi;
    }




}
