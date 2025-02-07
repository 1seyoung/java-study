package Algo.basic.comb;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicComb {

    static int[] src = {1,2,3,4,5};
    static int[] tgt = new int[3];  // ____ ____ ___ < 현재 자리를 채우기 위해 Src의 맨 앞에서부터 수를 선택/비선택 해가면서 tgt 개수를 채운다
    //이전에 사용된 수 고려 x < select 배열 x

    public static void main(String args){
        comb(0,0);
    }

    //조합
    // src의 srcIdx 자리의 수를 tgtIdx 자리에 선택 / 비선택
    static void comb(int srcIdx, int tgtIdx) {

        //가조 조건 : 성공적인 종료  tgt 배열이 다 채워졌을 때(Ex: tgt 길이가 3이면 3개를 모두 선택 완료했다는 의미)
        if(tgtIdx == tgt.length) {
            // 조합의 경우의 수가 완성
            System.out.println(Arrays.toString(tgt));
            return;
        }

        if(srcIdx == src.length) return; // 기저 조건 1개 더
        // 실패한 종료 조건 : 더 이상 선택할 수 있는 원소가 없다는 의미

        tgt[tgtIdx] = src[srcIdx];
        comb(srcIdx + 1, tgtIdx + 1);  // 위 선택을 받아들이고 다음 자리로 재귀호출
        comb(srcIdx + 1, tgtIdx);  // 위 선택을 받아들이지 않고 srcIdx 만 증가 효과 ( 이전 선택을 srcIdx 다음 수로 덮어쓰는 경우)

    }
}
