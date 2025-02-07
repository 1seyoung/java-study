package javaBasic.ch06;

public class test1 {

    public static void main(String[] args) {
        //생성자가 없는 경우 컴파일러가 기본 생성자를 추가

//        {
//            Car car = new Car(); // 오류남 기본 생성자 없어서
//            System.out.println(car);
//            Car car2 = new Car(1);
//        }


        { // 이 블럭안에서만 사용하는 변수? 라는 뜻인가?
            Car car1 = new Car(1);
            Car car2 = new Car("BMW", 2);
            System.out.println(car1.name);
            System.out.println(car1.spped);
            System.out.println(car2.name);
            System.out.println(car2.spped);

            //메소드 테스트
            car1.drive();
            car2.drive();

            System.out.println(car1.getDriveInfo());
            System.out.println(car2.getDriveInfo());
        }




    }
}
