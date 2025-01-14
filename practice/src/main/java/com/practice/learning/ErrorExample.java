package com.practice.learning;

public class ErrorExample {
    public static void main(String[] args) {
        try {
            // 무한 재귀 호출로 StackOverflowError 발생
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("Error caught: " + e);
        }
        System.out.println("Program continues...");
    }

    public static void recursiveMethod() {
        recursiveMethod(); // 무한 호출
    }
}