package Algo.basic.star;

public class Hourglass {
    //7 x 7 모래시계 출력
    public static void main(String[] args) {

        int standard = 7;
        int center = standard / 2 + 1;

        // 첫번째 세모
        for(int i = 0 ; i < center-1 ; i ++) {
            for (int j = 0; j < standard; j++){
                if(j < i || j >standard-i-1) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i = 0; i<center; i++) {
            for(int j = 0; j < standard;j++){
                if(j < center-i-1 || j > standard-center+i){
                    //if(j < standard - i || j > standard - (4-i)){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }
}
