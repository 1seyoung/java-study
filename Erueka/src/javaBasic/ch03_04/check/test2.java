package javaBasic.ch03_04.check;

public class test2 {
    public static void main(String[] args) {
        int score = 85;
        String result = (!(score>90)) ? "가" : "나";
        System.out.println(result);
    }
}
