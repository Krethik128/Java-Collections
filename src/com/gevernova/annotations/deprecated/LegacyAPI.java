package com.gevernova.annotations.deprecated;

public class LegacyAPI {
    // old method to be marked deprecated
    @Deprecated
    public void oldMethod(){
        System.out.println("This is the old feature. Please avoid using it.");
    }
    // recommended new method
    public void newMethod(){
        System.out.println("This is the new and improved feature.");
    }
}
