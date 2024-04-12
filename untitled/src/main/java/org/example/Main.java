package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.println(Satunnainen_Nimi.PalautaNimi());

        //System.out.println(TiedostoKoko.TiedKoko("C:\\Users\\OMISTAJA\\Desktop"));
//        Singleton singleton = Singleton.getInstance();
//        singleton.setInstance("Sabaton");
//        System.out.println(singleton.getInstance());

        int[] numbers = {1, 2, 3, 4, 5, 6, 8, 9, 10, 11};
        System.out.println("Puuttuva luku: " + PuuttuvaLuku.missingNumb(numbers));
    }
}