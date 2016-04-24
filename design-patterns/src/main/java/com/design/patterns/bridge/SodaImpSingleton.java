package com.design.patterns.bridge;

public class SodaImpSingleton {  
    private static SodaImp sodaImp;
   
    public SodaImpSingleton(SodaImp sodaImpIn) {
        SodaImpSingleton.sodaImp = sodaImpIn;
    }
    
    public static SodaImp getTheSodaImp() {
        return sodaImp;
    }
}