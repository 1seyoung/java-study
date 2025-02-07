package Algo.basic.star;

public class Hourglass2 {
    public static void main(String[] args) {
        int turnCnt = 7/2 ; // 모양이 바뀌는 지점 (공백 문자가 증가하다가 감소하는 지점)
        int spaceCnt = 0; // 해당 행의 출력 공백 문자 수 (증가했다가 감소)
        boolean spaceIncrese = true; // 공백 문자가 계속 증가해야하는지 , 감소해야하는지 표현

        //1번 방법
        for (int i = 0; i < 7; i++) {//행
            for(int j =0; j<7; j++) {//열
                if(j < spaceCnt ) {
                    System.out.print(" ");
                }else if(j < 7-spaceCnt) {
                    System.out.print("*");
                }

            }
            System.out.println();

            // 공백 문자 증가 여부
            if( spaceIncrese ) spaceCnt++;
            else spaceCnt--;

            // 다음 행에서 계속 증가 또는 감소 판단
            if( spaceCnt == turnCnt ) spaceIncrese = false;
        }

        System.out.println("-------------------------");
         //#2 뒤 쪽 공백 자리는 따질 필요 X
        for (int i = 0; i < 7; i++) {//행
            for (int j = 0; j < 7 - spaceCnt; j++) { // 열
                if (j < spaceCnt) { // 앞 쪽 공백
                    System.out.print(" ");
                } else { // 뒤 쪽 공백을 고려하지 않고 * 출력
                    System.out.print("*");
                }
            }
            System.out.println();

            // 공백 문자 증가 여부
            if( spaceIncrese ) spaceCnt++;
            else spaceCnt--;

            // 다음 행에서 계속 증가 또는 감소 판단
            if( spaceCnt == turnCnt ) spaceIncrese = false;
        }

        System.out.println("-------------------------");
        // #3 if-else 제거
        // spaceCnt 를 이용해서 공백, * 각각 출력
        for (int i = 0; i < 7; i++) {//행
            for (int j = 0; j < spaceCnt; j++) {
                System.out.print(" ");
            }

            for (int j = spaceCnt; j < 7 - spaceCnt; j++) {
                System.out.print("*");
            }
            System.out.println();

            // 공백 문자 증가 여부
            if( spaceIncrese ) spaceCnt++;
            else spaceCnt--;

            // 다음 행에서 계속 증가 또는 감소 판단
            if( spaceCnt == turnCnt ) spaceIncrese = false;
        }

    }
}
