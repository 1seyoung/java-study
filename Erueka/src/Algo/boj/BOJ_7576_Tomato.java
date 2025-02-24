package Algo.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_7576_Tomato {

    static int[][] matrix;
    static boolean[] visit; // 정점에 대해서 관리

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};



    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        matrix = new int[M][N];
        visit = new boolean[M * N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        bfs();


        // 최소 날짜 계산
        int maxDays = 0;
        boolean allRipe = true;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] == 0) {
                    allRipe = false; // 아직 안 익은 토마토 발견
                }
                maxDays = Math.max(maxDays, matrix[i][j]);
            }
        }

        // 출력 (모두 익었으면 최소 날짜, 못 익는 경우 -1)
        System.out.println(allRipe ? maxDays - 1 : -1);



    }

    private static void bfs() {

        Queue<Integer> queue = new ArrayDeque<>();

        // 익은 토마토 찾기
        for(int j = 0; j < matrix.length; j++) {
            for(int k = 0; k < matrix[j].length; k++) {
                if(matrix[j][k] == 1) {
                    queue.offer(j * matrix[j].length + k);
                    visit[j * matrix[j].length + k] = true;
                }
            }
        }

        while(!queue.isEmpty()) {
            int v = queue.poll(); // 익은 토마토
            int x = v / matrix[0].length; //
            int y = v % matrix[0].length; //

            for(int j = 0; j < 4; j++) {
                int nx = x + dx[j];
                int ny = y + dy[j];

                // 범위 넘어가면 무시
                if(nx < 0 || ny < 0 || nx >= matrix.length || ny >= matrix[0].length) continue;

                // 익지 않은 토마토가 있고 방문하지 않았으면 Queue 에 넣는다.
                if(matrix[nx][ny] == 0 && !visit[nx * matrix[0].length + ny]) {

                    // Queue 에 넣는다. 뭘 넣은거지 ?? nx * matrix[0].length + ny -> 1차원 배열로 변환 ??
                    queue.offer((nx * matrix[0].length + ny));

                    // 방문 처리
                    visit[nx * matrix[0].length + ny] = true;

                    // 익은 토마토로 바꾸기
                    matrix[nx][ny] = matrix[x][y] + 1; // 날짜 증가

                }


            }
         }



    }



//    static void bfs( int sv ) {
//        // 시작  Node 를 queue 에 넣고 출발
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.offer( sv );
//        visit[sv] = true;
//
//        while( ! queue.isEmpty() ) {
//
//            int v = queue.poll();
//            System.out.print(v + " -> ");
//
//            for (int i = 1; i <= 4; i++) {
//                if( ! matrix[v][i] || visit[i] ) continue; // 갈 수 없거나, 이미 방문한 정점 제외
//                queue.offer(i);
//                visit[i] = true;
//            }
//        }
//    }
}


/*

        //첫 줄에는 상자의 크기를 나타내는 두 정수 M,N이 주어진다
        //M은 상자의 가로 칸의 수, N은 상자의 세로 칸의 수
        //단, 2 ≤ M,N ≤ 1,000

        //둘째 줄부터는 하나의 상자에 저장된 토마토들의 정보가 주어진다.
        //즉, 둘째 줄부터 N개의 줄에는 상자에 담긴 토마토의 정보가 주어진다.
        //하나의 줄에는 상자 가로줄에 들어있는 토마토의 상태가 M개의 정수로 주어진다.


        // 0 익지 않은 토마토
        // 1 익은 토마토
        // -1 비어 있음

        // 토마토가 모두 익을 때까지의 최소 날짜를 출력한다.

        // 1. 익은 토마토를 찾아서 Queue 에 넣는다.
        // 2. Queue 에서 하나씩 꺼내면서 익은 토마토의 상하좌우를 확인한다.
        // 3. 익지 않은 토마토가 있으면 익은 토마토로 바꾸고 Queue 에 넣는다.
        // 4. Queue 가 빌 때까지 반복한다.
        // 5. 모든 토마토가 익었는지 확인한다.
 */