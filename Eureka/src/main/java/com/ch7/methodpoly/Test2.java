package com.ch7.methodpoly;

public class Test2 {

    public static void main(String[] args) throws Exception{
        // Overriding 조건
        Super s = new Sub();
        s.m();
        s.m2();
        s.m3();
        s.m4();

    }

}