package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TiedostoKoko {

    public static long TiedKoko(String p){
        File folder = new File(p);
        long koko = Fsize(folder);
        return koko;
    }
    public static long Fsize(File f){
        long size = 0;
        File[] files = f.listFiles();
        if (files != null){
            int count = files.length;

            for (int i = 0; i < count; i++) {

                if (files[i].isFile()){
                    size += files[i].length();
                    System.out.println(files[i].getName());
                }
                else{
                    size += Fsize(files[i]);
                    System.out.println(files[i].getName());
                }
            }
        }
        else {
            System.out.println("files is null because: " + f);
        }



        return size;

    }
}
