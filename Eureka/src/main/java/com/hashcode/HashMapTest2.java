package com.hashcode;

import java.util.HashMap;
import java.util.Objects;

class Person2 {
    String name;

    public Person2(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person2 person = (Person2) obj;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name); // name을 기반으로 한 해시 코드 생성
    }
}

public class HashMapTest2 {
    public static void main(String[] args) {
        HashMap<Person2, Integer> map = new HashMap<>();

        Person2 p1 = new Person2("Alice");
        Person2 p2 = new Person2("Alice"); // 같은 이름이지만 다른 객체

        map.put(p1, 100);

        // ✅ 같은 "Alice"를 찾을 수 있음!
        System.out.println(map.get(p2)); // 100 출력 (정상 동작)
    }
}