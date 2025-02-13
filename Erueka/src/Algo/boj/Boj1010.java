package Algo.boj;

/*
문제 분석

서쪽 사이트 : N개
동쪽 사이트 : M개  (N <= M)

서쪽과 동쪽의 연결
조건 : 한 사이트에는 최대 한개의 다리만 연결될 수 있다.
최대한 많이 지을 것 -> N개의 다리 나오는 사이트 조합

1. 테스트 케이스 입력 받기 T
2. 테스트 케이스 별 N, M 입력받기
3. 경우의 수 계산
    3-1. M! / (N! * (M-N)!) ... 조합 공식 > for 문 활용


4. 경우의 수 출력
5. 다음 테스트 케이스 진행(없다면 종료)
 */

import java.util.Scanner;

public class Boj1010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T>0) {
            int N = sc.nextInt();
            int M = sc.nextInt();


            long result = calculator(M, N);

            System.out.println(result);

            T--;
        }

    }

    static long calculator(int M, int N) {
        long result = 1;
        for(int i = 0; i < N; i++) {
            result = result * (M - i) / (i + 1);
        }
        return result;
    }
}
