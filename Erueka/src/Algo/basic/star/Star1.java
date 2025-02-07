package Algo.basic.star;

public class Star1 {
    public static void main(String[] args) {
        // 내가 쓴 코드
//        for(int j = 0 ; j < 5; j++) {
//            for(int i = -j+1 ; i < 5;i++) {
//                System.out.print(" ");
//            }
//            for(int x = 5-j; x >0 ; x--){ //
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

        //정답
        for(int i = 0; i <5; i++) { //행
            for(int j = 0; j<5; j++){ //열
                if (j<i) {
                    //왼쪽 아래 공간
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

