package Algo.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/*
11
1 4
3 5
0 6
5 7
3 8
5 9
6 10
8 11
8 12
2 13
12 14 -> 11개의 회의와 시작시간, 끝나는 시간이 주어질 때 가장 많은 회의를 할 수 있는 경우를 출력

1. 끝나는 시간 순으로 정렬
2. 끝나는 시간이 같다면 시작시간이 빠른 순으로 정렬

 */
public class BOJ1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            String arrStr = br.readLine();

            arr[i][0] = Integer.parseInt(arrStr.split(" ")[0]);
            arr[i][1] = Integer.parseInt(arrStr.split(" ")[1]);
        }
        //1. 끝나는 시간 순으로 정렬
        //2. 끝나는 시간이 같다면 시작시간이 빠른 순으로 정렬
        Arrays.sort(arr, (a,b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);


        //최대로 선택 가능한 회의는?
        int count = 0;
        //끝나는 시간 기준
        int endTime = 0;

        for(int i =0; i < N ; i++) {
            // 현재 끝나는 시간이 다음 회의의 시작 이후 일 경우 선택함 아니라면 겹치기 때문에 선택 x
            if(endTime <= arr[i][0]) {
                count +=1;
                endTime = arr[i][1];
            }
        }



        bw.flush();
        br.close();
        bw.close();






    }
}
