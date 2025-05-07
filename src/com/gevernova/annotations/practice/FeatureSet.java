package com.gevernova.annotations.practice;

public class FeatureSet {

    @ImportantMethod(level = "CRITICAL")
    public void processPayment() {
        System.out.println("Processing payment...");
    }

    @ImportantMethod // default level: HIGH
    public void generateInvoice() {
        System.out.println("Generating invoice...");
    }

    public void helperMethod() {
        System.out.println("Helper method (not marked important).");
    }
}
