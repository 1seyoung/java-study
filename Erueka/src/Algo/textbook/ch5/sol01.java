package Algo.textbook.ch5;

import java.util.Arrays;

public class sol01 {
    public static void main (String[] arg) {
        // 정수 배열을 정렬해서 반환하는 solution
        // 정수 배열의 길이 10의 5승 이하 -> 3초 기준 O(n^2) x

        int[] org = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int[] result = solution(org);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] org) {
        int [] clone = org;
        Arrays.sort(clone);
        return clone;
    }
}
