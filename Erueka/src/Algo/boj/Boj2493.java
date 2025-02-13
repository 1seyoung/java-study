package Algo.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

/*
N개의 서로 다른 탑 차례로
(꼭대기에 송신기 -> 지표면과 평행하게 직선의 왼쪽 방향으로 발사 )
__       __ __ ...
      __
   __
__ __ __ __ __ ...n개
 */
public class Boj2493 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];

        //배열의 첫 번째 원소 (arr[0])는 탑의 인덱스, 두 번째 원소 (arr[1])는 탑의 높이를 의미하도록 약속
        Stack<int[]> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++) {
            int height = Integer.parseInt(st.nextToken());

            //스택의 top에 있는 높이가 지금 들어온 탑의 높이보다 낮으면 제거
            while(!stack.isEmpty() && stack.peek()[1] < height) {
                stack.pop();
            }

            //스택이 비어있으면 수신할 탑이 없기 때문에 0
            if(stack.isEmpty()) {
              stack.push(new int[]{i+1, height});
            } else {
                //스택이 비어있지 않으면 수신할 탑이 있기 때문에 수신할 탑의 인덱스를 저장
                result[i] = stack.peek()[0];
            }

            // 현재 들어온 탑 저장
            stack.push(new int[] {i, height});

            for(int j = 0; j < N; j++) {
                bw.write(result[j] + " ");
            }

            bw.flush();
            bw.close();
            br.close();

        }







    }

}
