package javaBasic.ch05;

public class Test1 {
    public static void main(String[] args) {
        // 참조타입 객체 생성 == 비교 <= heap의 객체 위치 비교
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        MyClass mc3 = mc1;

        System.out.println(mc1 == mc2); // false
        System.out.println(mc1 == mc3); // true

        //null
        System.out.println(mc1);
        //local 변수는 사용 전 반드시 초기화가 되어야한다.
        MyClass mc4 = null;
        System.out.println(mc4);

        //메소드를 통한 객체 return
        mc4 = getObject();
        System.out.println(mc4); // 정상적인 객체일 경우 클래스명@16진수
        System.out.println(mc4.getName()); // mc4가 null 인 경우 NullPointerException 발생
    }

    static MyClass getObject() {
        return null;
    }
}
