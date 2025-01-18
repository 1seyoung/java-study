package com.practice.mid_java.lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound(); : 컴파일 오류, Object 클래스에는 sound() 메서드가 없다.
        //obj.move(); : 컴파일 오류, Object 클래스에는 move() 메서드가 없다.

        // 객체에 맞는 다운캐스팅 필요
        if (obj instanceof Dog dog) {
            // (Dog)obj.sound(); ->  다운 캐스팅
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }

        // Object 를 활용한 다형성 한계
        // - 오브젝트는 모든 객체를 대상으로 다형적 참조를 할 수 있다ㅣ. 쉽게 말해, 모든 객체의 부모이므로 모든 객체를 담을 수 있다.
        // - Object를 통해 전달 받은 객체를 호출하려면 각 객체에 맞는 다운 캐스팅 과정이 필요하다, Object가 모든 메서드를 알고있는 것이 아니다.

        //다형성을 제대로 활용하려면 다형적 참조 + 메소드 오버라이딩을 함께 사용해야한다. 따라서, Obejct 를 사용한 다형성에는 한계가 있다.
        // 오브젝트는 모든 객체의 부모이므로 다형적 참조를 할 수 있지만 모든 메소드가 정의 되어 있지 않기 때문에 메소드 오버라이딩을 활용할 수 없다.

    }
}
