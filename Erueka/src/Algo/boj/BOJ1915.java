package Algo.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1915 {
  static int[][] arr = new int[1001][1001]; // 입력받는 배열
  static int[][] dp = new int[1001][1001]; // dp 를 위한 배열
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    //1. N,M 입력받기
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    // 목표 : 1로된 가장 큰 정사각형의 크기를 구하기
    int maxSize = 0;

    // 2. 행렬 데이터 입력 받기 [ y가 행(세로), x가 열(가로) ]
    for (int y = 1; y <= n; y++) {
      String line = br.readLine();
      for (int x = 1; x <= m; x++) {
        arr[y][x] = line.charAt(x-1) - '0';
      }
    }

    //3.  Dp 테이블 초기화 (첫번째 행, 열 복사)
    for (int y = 1; y <= n; y++) {
      dp[y][0] = arr[y][0];  // 첫 열 초기화
    }
    for (int x = 1; x <= m; x++) {
      dp[0][x] = arr[0][x];  // 첫 행 초기화
    }

    //4. 점화식 이용해서 dp 배열 업데이트
    for(int y = 1; y <=n;y++) {
      for(int x =1; x <= m; x ++){
        if (arr[y][x] ==1) {
          // 4-1 점화식 min(왼, 위, 대각선) +1
          dp[y][x] = Math.min(Math.min(dp[y-1][x], dp[y][x-1]), dp[y-1][x-1]) + 1;
          // 4-2 한 변의 최대값 업데이트
          maxSize = Math.max(maxSize,dp[y][x]);
        }
      }
    }

    // 5. 최대 넓이 출력
    System.out.println(maxSize * maxSize);
    br.close();
  }
}
