package javaBasic.ch05;

import java.util.Scanner;

public class scoreAnalysis {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("================================================");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("================================================");
            System.out.print("선택 > ");

            int selectNum = scanner.nextInt();
            scores = new int[studentNum];
            if(selectNum == 1) {
                System.out.print("학생수> ");
                studentNum = scanner.nextInt();
                scores = new int[studentNum];
            } else if (selectNum == 2) {
                for(int i = 0; i< scores.length; i++) {
                    System.out.print("scores[" + i + "]>");
                    scores[i] = scanner.nextInt();
                }
            } else if (selectNum == 3) {
                for(int i = 0; i< scores.length; i++) {
                    System.out.println("scores[" + i + "] : " + scores[i]);
                }
            } else if (selectNum == 4) {
                int max = 0;
                int sum = 0;
                double avg = 0;
                for(int i = 0; i<scores.length; i++) {
                    if(max<scores[i]) {
                        scores[i] = max;
                    } else {
                        max = max;
                    }
                    sum += scores[i];
                }
                avg = (double) sum / studentNum;
                System.out.println("최고점수 : " + max);
                System.out.println("평균점수 : " + avg);
            } else if (selectNum == 5) {
                run = false;
            }
        }
    }
}