package javaBasic.practice.hashcode;

import java.util.HashMap;

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Person, Integer> map = new HashMap<>();

        Person p1 = new Person("Alice");
        Person p2 = new Person("Alice"); // 같은 이름이지만 다른 객체

        map.put(p1, 100);

        // 같은 "Alice"를 찾으려고 했는데, 다르게 인식됨!
        System.out.println(map.get(p2)); // null
    }
}
