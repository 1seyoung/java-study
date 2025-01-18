package com.practice.mid_java.lang.object.tostring;

public class ObjectPrinter {
    public static void print(Object obj) {
        String string = "객체 정보 출력 : " + obj.toString();
        System.out.println(string);

        //ObjectPrinter은 구체적인 것에 의존하는 것이 아니고 추상적인 것에 의존한다.

        //추상적 : 추상 클래스 인터페이스 이런 것을 의미하는 것이 아니다. Animal 과 같이 위로 갈수록 개념은 더 추상적이고 , Dog, Cat과 같이 아래로 갈수록 구체적이다.

        //정적 의존 관계 vs 동적 의존 관계
        //정적 의존 관계는 컴파일 시간에 결정되며, 주로 클래스 간의 관계를 의미한다. 프로그램을 실행하지 않고, 클래스 내에서 사용하는 타입들만 보면 쉽게 의존관계를 알 수 있다.
        //동적 의존 관계는 프로그램을 실행하는 런타임에 확인할 수 있는 의존 관계이다.
        //ObjectPrinter.print(object)는 인자로 어떤 객체가 전달될지  프로그램을 실행해봐야 알 수 있다. 어떤 경우에는 Car인스턴스가 넘어오고 어떤 경우에는 Dog 인스턴스가 넘어온다.
        //런타임에 결정되는 것이 동적 의존 관계이다.
        // 참고로 단순히 의존 관계 또는 어디에 의존한다고 하면 주로 정적 의존관계를 뜻한다.
        // ex - ObjectPrinter.print(object)는 ObjectPrinter가 Object에 의존한다. 이때 ObjectPrinter는 Object에 의존한다고 말한다.
    }
}



