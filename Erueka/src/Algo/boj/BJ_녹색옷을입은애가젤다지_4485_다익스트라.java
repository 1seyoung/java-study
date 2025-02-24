package Algo.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BJ_녹색옷을입은애가젤다지_4485_다익스트라 {

  static int N;
  static int[][] map;

  static int[] dy = { -1, 1, 0, 0 };
  static int[] dx = {  0, 0,-1, 1 };

  static PriorityQueue<Vertex> pqueue = new PriorityQueue<Vertex>( (e1, e2) -> e1.c - e2.c );
  static int[][] cost;

  static final int INF = Integer.MAX_VALUE;
  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = 1;
    while(true) {

      N = Integer.parseInt(br.readLine());
      if( N == 0 ) break;

      map = new int[N][N];
      cost = new int[N][N];
      for (int i = 0; i < N; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < N; j++) {
          map[i][j] = Integer.parseInt(st.nextToken());
          cost[i][j] = INF;
        }
      }
      dijkstra();

      sb.append("Problem ").append(t).append(": ").append(cost[N-1][N-1]).append("\n");
      t++;
    }
    System.out.println(sb);
  }
  static void dijkstra() {
    // 첫 번째 방문부터 비용 발생할 수 있다.
    cost[0][0] = map[0][0];
    pqueue.offer(new Vertex(0, 0, map[0][0]));

    while( !pqueue.isEmpty() ) {
      Vertex vertex = pqueue.poll();

      if( cost[vertex.y][vertex.x] < vertex.c ) continue;

      for (int d = 0; d < 4; d++) {
        int ny = vertex.y + dy[d];
        int nx = vertex.x + dx[d];
        if( ny < 0 || nx < 0 || ny >= N || nx >= N  ) continue;
        // 시작점에서 pqueue에서 꺼낸 Edge e까지의 비용 + e로부터 ny,nx 로 가는 비용 < 시작점에서 ny, nx 로 가는 비용 이면
        if( vertex.c + map[ny][nx] < cost[ny][nx] ) { // cost[e.y][e.x] == e.c ??
          cost[ny][nx] = vertex.c + map[ny][nx];
          pqueue.add(new Vertex(ny, nx, cost[ny][nx]));
        }
      }
    }
  }

  // 방향이 있음.
  static class Vertex{
    int y;
    int x;
    int c;

    public Vertex(int y, int x, int w) {
      this.y = y;
      this.x = x;
      this.c = w;
    }
  }
}
