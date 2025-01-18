package com.practice.mid_java.lang.object;

public class ObejctMain {
    public static void main(String[] args) {

        Child child = new Child();

        child.parentMethod();
        child.childMethod();

        //toString() 메서드는 Object 클래스의 메서드
        String string = child.toString(); // 객체에 대한 정보 제공
        System.out.println(string); //com.practice.mid_java.lang.object.Child@251a69d7

        // 왜 Object 클래스가 최상위 부모 클래스인가?
        // 공통 기능 제공 : 객체의 정보를 제공하고, 객체를 비교하는 것은 모든 객체에 필요한 기능이다.
                        //개발자마다 일관성을 가지게 하기 위해, 모든 객체는 공통 기능을 편리하게 제공(상속) 받을 수 있다
        // 다형성의 기본 구현 : Obejct는 모든 객체를 다 담을 수 있다. 타입이 다른 객체들을 어딘가에 보관해야한다면 바로 Obejct를 사용하면 된다.
    }
}
