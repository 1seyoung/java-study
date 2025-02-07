package javaBasic.practice.hashcode;

import java.util.HashMap;

class BadHash {
    private String value;

    public BadHash(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BadHash badHash = (BadHash) obj;
        return value.equals(badHash.value);
    }

    @Override
    public int hashCode() {
        return 1; // 모든 객체가 같은 해시 값
    }
}

public class BadHashExample {
    public static void main(String[] args) {
        HashMap<BadHash, String> map = new HashMap<>();

        // 여러 개의 객체 삽입
        for (int i = 0; i < 10000; i++) {
            map.put(new BadHash("Value" + i), "Data" + i);
        }

        // 데이터 검색 시간 측정
        long start = System.nanoTime();
        String result = map.get(new BadHash("Value5000"));  // 중간 데이터 조회
        long end = System.nanoTime();

        System.out.println("검색 결과: " + result);
        System.out.println("소요 시간 (나노초): " + (end - start));
    }
}