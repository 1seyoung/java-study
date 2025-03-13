package Algo.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ2493_2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    int[] result = new int[N];

    // 탑의 인덱스와 높이를 같이 저장해야함
    Stack<int[]> stack = new Stack<>();

    StringTokenizer st = new StringTokenizer((br.readLine()));
    for(int i =0; i < N; i++) {
      // 지금 신호탑 높이
      int height = Integer.parseInt(st.nextToken());

      // 스택의 top 에 있는 높이가(이전 신호탑의 높이가) 지금 들어온 탑의 높이 보다 낮으면 필요 x
      while(!stack.isEmpty() && stack.peek()[1] < height) {
        stack.pop();
      }

      // 만약 스택이 비어있으면 ? 일단 수신할 탑은 없음 result에  0 입력하고  스택에는 비교할 대상 없으니깐 저장
      if(stack.isEmpty()){
        //길이가 2인 정수 배열을 생성하고, 첫 번째 요소에 i+1, 두 번째 요소에 height를 저장
        stack.push(new int[]{i+1, height});
      } else {
        // 아니면 초기화는 잘된것 / 수신할 탑이 있기 대문에 수신할 탑의 인덱스를 저장해야함
          result[i] = stack.peek()[0]; // 제거 x 그냥 값만
      }

      //현재 들어온 값도 저장
      stack.push(new int[]{i+1, height});
    }

    for(int j = 0; j < N; j++) {
      bw.write(result[j] + " ");
    }


    bw.flush();
    bw.close();
    br.close();
  }

}
