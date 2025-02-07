package Algo.basic.array;

public class Array1 {
    public static void main(String[] args) {
        // 1. 주어진 배열의 원소들 중에서 제시된 규칙과 다른 항목이 몇건?
        // 맨앞부터 3개씩 묶어서 곱셉결과가 맞으면 통과 틀리면 wrongCnt 증가
        // 3 2 6 -> 3*2 = 6 통과
        // 3,4,4, -> 3*4 = 12 !=4 cnt 증가
        int[] intArray = {3,2,6, 3,4,4, 1,4,2, 2,3,6, 1,3,5, 1,5,1, 1,1,1, 2,4,2, 2,2,4};
        int wrongCnt = 0;

        int len = intArray.length / 3;

        //구현
        for(int i = 0; i < len ; i++) {
            int idx = i *3;
            int a = intArray[idx];
            int b = intArray[idx+1];
            int c = intArray[idx+2];

            int ab = a*b;
            if (!(ab==c)){
                wrongCnt++;
            }
        }
        System.out.println(wrongCnt);

        System.out.println("-----강사님 답안------");
        int wrongCnt2 =0;
        int inLength = intArray.length -2;
        for(int i =0; i<inLength; i +=3) {
            if(intArray[i] * intArray[i+1] != intArray[i+2]) wrongCnt2++;
        }

        System.out.println(wrongCnt2);









    }
}
