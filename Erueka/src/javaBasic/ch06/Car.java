package javaBasic.ch06;

public class Car {

    //필드 추가
    String name;
    int spped;

    //생성자가 없는 경우
    // 컴파일러가 기본 생성자를 추가


    //생성자가 추가
    // 컴파일러가 기본 생성자를 추가 x
//    public Car(int spped) {
//        // 추가된 필드에 값 지정
//        this.spped = spped;
//
//    }

    //생성자 여러개 Overloading
    public Car(String name, int spped) {
        this.name = name;
        this.spped = spped;
    }

    // this 활용
    public Car(int speed) {
        this("아반떼", speed);
        //this.spped = speed;
        //this.name = "아반떼"; 선택가능한 코드 여역
    }

    //메소드 추가
    public void drive() {
        System.out.println(this.name + "가" + this.spped + "로 달립니다.");
    }

    public String getDriveInfo() {
        return this.name + "가" + this.spped + "로 달립니다.";
    }


}
