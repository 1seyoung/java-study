package javaBasic.ch7.typepoly;

public class Test {
    public static void main(String[] args) {
        // 타입 다형성 : assign
        A a = new A();   // 부모 - 부모
        B b = new B();   // 자식 - 자식
        A ab = new B();  // 부모 - 자식
        // B ba = new A();  // 자식 - 부모 (X)

        // 타입 다형성 : parameter
        {
//            A a = new A();
//            B b = new B();
//
//            m1(a);  // OK
//            m1(b);  // OK
//            // m2(a);  // X
//            m2(b);  // OK
        }
    }

    // 타입 다형성 : parameter
    static void m1(A a) {}
    static void m2(B b) {}

    // 타입 다형성 : return type
    static A m3() { return new A(); }
    static B m4() { return new B(); }
    static A m5() { return new B(); }
    // static B m6() { return new A(); }  // X
}

// 컴파일러가 자동으로 하는 일
// 1. 생성자가 없으면 기본 생성자를 추가
// 2. java.lang 자동 import
// 3. 생성자에 super() 가 없으면 자동으로 추가
// 4. 아므것도 상속받지 않는 클래스는 자동으로 extends Object 를 추가한다.


// OOP 3가지
// 1. Encapsulation <- access modifier 와 setter, getter 구조
// 2. Inheritance (  상속 만들기, 부모 자식 접근)
// 3. Polymorphism ( 타입 (상위타입, 하위타입 ), 메소드 ( Overloading, Overriding )