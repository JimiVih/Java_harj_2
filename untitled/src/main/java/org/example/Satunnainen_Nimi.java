package org.example;

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
        int randIntEtu = rand.nextInt(Etunimia.length);
        int randIntSuku = rand.nextInt(Sukunimia.length);

        String Etunimi = Etunimia[randIntEtu];
        String Sukunimi = Sukunimia[randIntEtu];

        return Etunimi + " " + Sukunimi;
    }




}
