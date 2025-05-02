package com.gevernova.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileException {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileReader fileReader=new FileReader("com/gevernova/java8/exceptionHandling/ComparingDifferentExceptions.java");
        }catch (FileNotFoundException e){
            throw new FileNotFoundException("File not found");
        }



    }
}
