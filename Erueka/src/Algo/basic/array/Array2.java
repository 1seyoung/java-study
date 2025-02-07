package Algo.basic.array;

public class Array2 {
    //#2 양 끝에서 출발해서 안쪽으로 이동하면서 각 대칭 항목이 다른 건 몇 건?
    public static void main(String[] args) {
        char[] charArray = "XYZEBFFGQOVVPWGFFCEAYX".toCharArray();

        int wrongCNT = 0;
        int cenhter = charArray.length /3;
        for (int i =0, r = charArray.length -1 ; i < cenhter; i++, r--) {
            if (charArray[i] !=charArray[r]) {
                wrongCNT++;
            }
        }
        System.out.println(wrongCNT);


    }
}
