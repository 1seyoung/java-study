package Algo.textbook.ch5;

import java.util.Arrays;

public class sol4 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        int[] scores = new int[3];

        int[][] patters = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };

        int maxIdx = 0;
        for (int i = 0; i < patters.length ; i++) {
            int result = solution(numbers, patters[i]);
            scores[i] = result;
            if (scores[maxIdx] < result) {
                maxIdx = i;
            }
        }

        System.out.println(maxIdx + 1);

    }

    private static int solution(int[] numbers, int[] pattern) {
        int score = 0;
        for(int i = 0; i < numbers.length; i++) {
                if (numbers[i] == pattern[i % pattern.length]) {
                    score += 1;
                }
            }


        return score;
    }
}
