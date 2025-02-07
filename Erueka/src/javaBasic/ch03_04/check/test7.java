package javaBasic.ch03_04.check;

public class test7 {
    public static void main(String[] args) {
        //%를 수행한 결과값에 10으,ㄹ 더하는 코드이다. NaN을 검사해서 올바른 결과가 출력될 수 있도록 코드를 작성하라
        double x = 5.0;
        double y = 0.0;

        double z = 5 % y;

        if (Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 10);
        }
    }
}
