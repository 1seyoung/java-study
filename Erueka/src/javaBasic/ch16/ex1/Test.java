package javaBasic.ch16.ex1;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        person.action( () -> {
            System.out.println("출근");
            System.out.println("코딩");
            System.out.println("칼퇴");
        });

        person.action( () -> {
            System.out.println("칼퇴!");
        });

        person.action( () -> System.out.println("칼퇴"));
    }
}
