package DesignPatter.methodchain;

public class Test {
    public static void main(String[] args) {
        // StringBuilder append()
//      StringBuilder sb = new StringBuilder();
//      sb.append("abc");
//      sb.append("def");
//
//      sb.append("ghi").append("jkl"); // . . .
//      System.out.println(sb);

        // Calculator - pattern  적용 전
//      Calculator calc = new Calculator();
//      // 3 + 5
//      calc.setFirst(3);
//      calc.setSecond(5);
//      calc.add();
//
//      // 3 - 1
//      calc.setSecond(1);
//      calc.sub();
        // Calculator - pattern  적용 후
        Calculator calc = new Calculator();
        calc.setFirst(3).setSecond(5).add().setSecond(1).sub();
    }
}