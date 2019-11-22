package com.fiacu.patterns.singleton;

public class MultiThreadTest extends Thread {
    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running"); 
            ChocolateBoiler boiler = ChocolateBoiler.getInstance();
            boiler.fill();
            boiler.boil();
            boiler.drain();
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
}
