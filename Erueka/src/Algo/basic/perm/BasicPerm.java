package Algo.basic.perm;

import java.util.Arrays;

public class BasicPerm {
    //기본 순열
    static int[] src = {1,2,3,4,5};
    static int[] tgt = new int[3]; // __ __ __ 현재 자리를 채우기 위해 Src 전체를 고려하되, 혀s재 자리 이전에 사용된 수 제외

    //현재 자리 이전 자리에 사용된 수
    static  boolean[] select = new boolean[src.length];

    public static void main(String[] args) {
        perm(0);
    }

    static void perm(int tgtIdx) {
        //기저 조건
        //이 조건 이전의 재귀호출로 이미 Tgt 배열이 완성
        if(tgtIdx == tgt.length) {
            System.out.println(Arrays.toString(tgt));
            return;
        }

        // 현재 파라미터로 넘어온 tgtIdx 자리에 src 로부터 채울 수를 선택 , 고려
        //src 전체를 대상으로 하되, select 배열에 사용중인 것은 제외
        for(int i =0; i < src.length; i++) {
            // 앞자리에 사용된 수이면 skip
            if (select[i]) continue;


            tgt[tgtIdx]= src[i]; // 선택
        }

        //현재 파라미터로 넘어온 tgtIdx 자리에 src로부터 채울 수를 선택, 고려
        //src 전체를 대상으로 하되, select 배열에 사용중인 것은 제외
        for(int i =0; i < src.length; i++) {
            if(select[i]) continue;

            tgt[tgtIdx] = src[i]; // 선택

            select[i] = true;  // 선택 표시
            perm(tgtIdx +1); // 다음 자리를 위한 재귀 호출

            select[i] = false; // 선택 원복

        }
    }

}
