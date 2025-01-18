package com.practice.mid_java.lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id001");
        UserV1 userV2 = new UserV1("id001");

        System.out.println("identity comparison: " + (userV1 == userV2)); // false
        System.out.println("equality comparison: " + userV1.equals(userV2)); // false


        // 왜 둘 다 false일까?

        // public boolean equals(Object obj) {
        //     return (this == obj);
        // }

        // Object 가 기본으로 제공하는 equals() 메서드는 == 연산자와 동일한 결과를 반환한다.

        // 오버라이딩이 필요하다. 이유 : 동등성이란 개념은 각각의 클래스마다 다르다.

    }
}

//Object 는 동등성 비교를 위해 equals() 메서드를 제공한다.

// 동일성(Identity) : == 연산자를 사용하여 비교하는 것, 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
// 동등성(Equality) : equals() 메서드를 사용하여 비교하는 것, 두 객체가 논리적으로 동등한지 확인

// 동일은 완전히 같음을 의미한다. 반면 동등은 같은 가치나 수준을 의미하지만 형태나 외관 등이 같지 않을 수 있다.

// 동일성은 물리적으로 같은 메모리에 있는 객체 인스턴스인지 참조값을 확인하는 것이고, 동등성은 논리적으로 같은지 확인하는 것이다.
// 동일성은 자바 머신 기준이고 메모리의 참조가 기준이므로 물리적이다. 반면 동등성은 보통 사람이 생각하는 논리적인 기준에 맞추어 비교한다.

// User a = new User("홍길동");
// User b = new User("홍길동");
// 물리적으로는 a와 b는 다른 객체이다. 하지만 논리적으로는 같은 객체이다. -> 동일성은 다르지만 동등성은 같다

