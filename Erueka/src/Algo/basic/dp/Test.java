package Algo.basic.dp;
/*
아파트를 각 층별로 파란색 Or 노란색
- 노란샌은 인접한 두층에 연속 사용 가능
- 파란색은 인접한 두층에 연속 사용 불가

1층을 칠할 수 있는 경우의 수 f(1) = 2
2층을 칠할 수 있는 경우의 수 f(2) = 3

구하는 것 : f(n) = ?

시작할때 노란1과 파란1
다음 선택지 맨 위가 노란이면 +1 개 됨 맨 위가 파랑이면 노랑만 가능

n 층이 노란색이면  n-1 층은 노란 Or 파란
n 층이 파란색이면 n -1 은 노란
 */

public class Test {

  public static void main(String[] args) {
    // #3. DP (점화식 + 메모이제이션)
    System.out.println( fibo_dp(8) );
  }


  // 메모이제이션 배열 (Bottom-Up DP)
  static long[] memoi_dp = new long[51];

  // #3. 반복문을 이용한 DP (Bottom-Up)
  static long fibo_dp(int n) {
    if( n == 1 ) return 2;
    if( n == 2 ) return 3;

    memoi_dp[1] = 2;
    memoi_dp[2] = 3;

    // 반복문으로 점화식 적용
    for (int i = 3; i <= n; i++) {
      memoi_dp[i] = memoi_dp[i-1] + memoi_dp[i-2];
    }

    return memoi_dp[n];
  }
}