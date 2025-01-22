package com.ch03_04.check;

public class test {
    public static void main(String[] args) {
        int x= 10;
        int y= 20;

        int z = (++x) + (y--);
        System.out.println(z);
    }
}
