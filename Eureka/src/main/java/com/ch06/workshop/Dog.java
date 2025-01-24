package com.ch06.workshop;

public class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog is barking");
        test();
    }
    
    void test() {
        System.out.println("Dog is testing");
    }
}
