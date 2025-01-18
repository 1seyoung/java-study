package com.practice.mid_java.lang.object.poly;

public class ObejctPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car(); // 옵션 + 커맨트 + v : 자동완성

        Object object = new Object();


        Object[] objects = { dog, car , object};
        // Object objects[0] = new Dog();
        // Object objects[1] = new Car();
        // Object objects[2] = new Object();

        size(objects);

    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는 : " + objects.length);
    }

}
