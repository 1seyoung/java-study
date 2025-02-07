package javaBasic.practice.hashcode;

import java.util.HashMap;
import java.util.Objects;

class GoodHash {
    private String value;

    public GoodHash(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GoodHash goodHash = (GoodHash) obj;
        return value.equals(goodHash.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);  //  고유한 해시 값 반환
    }
}

public class GoodHashExample {
    public static void main(String[] args) {
        HashMap<GoodHash, String> map = new HashMap<>();

        // 여러 개의 객체 삽입
        for (int i = 0; i < 10000; i++) {
            map.put(new GoodHash("Value" + i), "Data" + i);
        }

        // 데이터 검색 시간 측정
        long start = System.nanoTime();
        String result = map.get(new GoodHash("Value5000"));  // 중간 데이터 조회
        long end = System.nanoTime();

        System.out.println("검색 결과: " + result);
        System.out.println("소요 시간 (나노초): " + (end - start));
    }
}