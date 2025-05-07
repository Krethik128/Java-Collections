package com.gevernova.annotations.overriden;

// main class to test the behaviour
public class Main {
    public static void main(String[] args){
        Dog dog = new Dog(); // instance of the Dog class
        dog.makeSound(); // calls the overridden method
    }
}
