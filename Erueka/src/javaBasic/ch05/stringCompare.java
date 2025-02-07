package javaBasic.ch05;

public class stringCompare {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = str1.substring(0, 5); // "Hello"
        String str3 = "Hello";

        System.out.println(str1 == str2);        // false

        // 참조 비교
        System.out.println(str2 == str3);        // false
        // 값 비교
        System.out.println(str2.equals(str3));  // true

        System.out.println("---------------------");

        String literal = "example";
        String newString = new String("example");
        String str = "exa";


        // Substring 호출
        String literalSubstring = literal.substring(0, 3); // "exa"
        String newStringSubstring = newString.substring(0, 3); // "exa"

        // 값 비교
        System.out.println(literalSubstring.equals(newStringSubstring)); // true

        // 참조 비교
        System.out.println(literalSubstring == newStringSubstring); // false

        // 참조 비교
        System.out.println(literal == newString); // false

        // 값 비교
        System.out.println(literal.equals(newString)); // true

        // 참조 비교
        System.out.println(literal == str + "mple"); // false

        // 값 비교
        System.out.println(literal.equals(str + "mple")); // true

        // 참조 비교
        System.out.println(literal == "exa" + "mple"); // true

        // 값 비교
        System.out.println(literal.equals("exa" + "mple")); // true

        System.out.println("---------------------");
        System.out.println(str.equals(literalSubstring));
        System.out.println(str == literalSubstring);

        System.out.println("---------------------");

    }
}


