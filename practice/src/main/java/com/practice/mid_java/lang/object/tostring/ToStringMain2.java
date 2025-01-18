package com.practice.mid_java.lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {

        // Car 인스턴스는 toString() 을 재정의 하지 않았다. 따라서 Object 가 제공하는 기본 toString 메소드를 사용한다.
        // Dog 인스턴스는 toString() 을 재정의한 덕분에 객체의 상태를 명확하게 확인할 수 있다.

        Car car = new Car("Model Y");
        Dog dog1 = new Dog("Buddy", 3);
        Dog dog2 = new Dog("Buddy2", 7);

        System.out.println("1. 단순 toString() 메서드 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());


        System.out.println("2. println 내부에서 toString() 메서드 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Objet 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        int i = System.identityHashCode(dog1);
        System.out.println("i = " + i);


        //1. 단순 toString() 메서드 호출
        //com.practice.mid_java.lang.object.tostring.Car@251a69d7
        //Dog{dogName='Buddy', age=3}
        //Dog{dogName='Buddy2', age=7}

        //2. println 내부에서 toString() 메서드 호출
        //com.practice.mid_java.lang.object.tostring.Car@251a69d7
        //Dog{dogName='Buddy', age=3}
        //Dog{dogName='Buddy2', age=7}

        //3. Objet 다형성 활용
        //객체 정보 출력 : com.practice.mid_java.lang.object.tostring.Car@251a69d7
        //객체 정보 출력 : Dog{dogName='Buddy', age=3}
        //객체 정보 출력 : Dog{dogName='Buddy2', age=7}

        //i = 118352462
    }
}
