package org.example;

import javax.crypto.SecretKey;

public final class Singleton {

    private static Singleton INSTANCE;
    private String song = "unknown song, or no song added...";

    private Singleton(){
    }

    public static Singleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
