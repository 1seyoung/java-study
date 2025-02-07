package javaBasic.ch03_04;

public class AccuracyExample2 {
    public static void main(String[] args) {
        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;

        int result = totalPieces - number;
        double result2 = result / 10.0;

        System.out.println("사과 한개에서" + number + "조각을 빼면,"  + result2 + "조각이 남는다.");

    }
}
