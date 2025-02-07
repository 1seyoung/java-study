package javaBasic.ch16.ex2;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        person.action( (name, job) -> {
            System.out.println( name +"이"+ job +"을 수행합니다.");
        });

        person.action( (name, job) -> {
            System.out.println( name +"이"+ job +"을 수행하지 않습니다..");
        });

        person.action2( (content) -> System.out.println( content + "라고 말했다."));
    }
}
