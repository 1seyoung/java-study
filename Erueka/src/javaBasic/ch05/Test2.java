package javaBasic.ch05;

public class Test2 {
    public static void main(String[] args) {
        //String 객체의 비교
        String str1 = new String("Hello"); // heap에 생성
        String str2 = new String("Hello"); // heap에 생성 => new 로 했기때문에
        String str3 = "Hello";  //
        String str4 = "Hello";

        // ==
        System.out.println(str1 == str2); // false
        System.out.println(str3 == str4); // true
        System.out.println(str1 == str4); // false

        //equals (내용을 비교한다.)
        System.out.println(str1.equals(str2)); // true
        System.out.println(str3.equals(str4)); // true
        System.out.println(str1.equals(str4)); // true

        //MyClass 객체의 equals()비겨
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        mc1.name = "Hello";
        mc2.name = "Hello";

        System.out.println(mc1.name);
        System.out.println(mc2.name);
        System.out.println(mc1.equals((mc2)));

    }

}
