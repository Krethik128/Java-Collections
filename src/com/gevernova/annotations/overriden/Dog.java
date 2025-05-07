package com.gevernova.annotations.overriden;

// child class
public class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
