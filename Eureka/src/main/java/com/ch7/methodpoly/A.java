package com.ch7.methodpoly;

public class A {
    void a() {
        System.out.println("A - a()");
    }
}

class B extends A {
    void a(int i) {
        System.out.println("B - a(int i)");
    }

    void b() {
        System.out.println("B - b()");
    }
}

class C extends B {
    void a() {
        System.out.println("C - a()");
    }

    void c() {
        System.out.println("C - c()");
    }
}

class D extends C {
    void a(int i) {
        System.out.println("D - a(int i)");
    }

    void b() {
        System.out.println("D - b()");
    }

    void d() {
        System.out.println("D - d()");
    }
}

// 실제로 동작하는 모습을 봐야한다. 가장 어려운 예제이다.