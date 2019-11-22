package com.fiacu.patterns.singleton;

public class ChocolateApp {
    public static void main(String args[]) {
//        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
//        boiler.fill();
//        boiler.boil();
//        boiler.drain();
//
//        // will return the existing instance
//        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
//        
        int n = 8; // Number of threads 
        for (int i=0; i<8; i++) 
        { 
            MultiThreadTest object = new MultiThreadTest(); 
            object.start(); 
        } 
    }
}
