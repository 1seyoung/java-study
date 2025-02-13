package Algo.textbook.ch5;

import java.util.Arrays;
import java.util.Collections;

public class sol2 {
    public static void main(String[] args) {
        // 배열 제거어하기
        // 배열 중복ㄱ밧 제거하고 배열 데이터를 내림차순으로 정렬해서 반환하는 Solution 함수

        int[]  org = {1, 1, 3, 3, 0, 1, 1};
        int[] result = solution(org);

        System.out.println(Arrays.toString(result));
    }

    static int[] solution(int[] org) {
        Integer [] arr = Arrays.stream(org).boxed().distinct().toArray(Integer[]::new);

        Arrays.sort(arr, Collections.reverseOrder());


        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();


    }
}
