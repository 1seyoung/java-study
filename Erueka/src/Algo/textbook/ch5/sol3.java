package Algo.textbook.ch5;

import java.util.Arrays;
import java.util.HashSet;

public class sol3 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        int[] result = solutions(numbers);

        System.out.println(Arrays.toString(result));
    }

    private static int[] solutions(int[] numbers) {
        // 더해서 만들 수 있는 모든 답안 출력
        HashSet<Integer> set = new HashSet<>(); // 중복값 제거를 위한 해시셋 생성
        int n = numbers.length;
        for(int i = 0; i < n;  i ++) {
            for( int j = i+1; j < n; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().mapToInt(Integer::intValue).sorted().toArray();


    }
}
