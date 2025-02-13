package Algo.textbook.ch5;

import java.util.Arrays;

public class sol1_1 {
    public static void main(String[] args) {
        int[] org = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int[] result = bubbleSort(org);

        System.out.println(Arrays.toString(result));
    }

    private static int[] bubbleSort(int[] org) {
        int[] arr = org.clone();
        int n = arr.length;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
