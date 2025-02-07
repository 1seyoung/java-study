package Algo.basic.array;

public class Array3 {
    public static void main(String[] args) {
        String str = "abbcccddddeeeeeffffggghhiabbcccddddeeeeeffffggghhi";

        int[] alphaCnt = new int[26]; // 해당 알파벳 - 'a', 'a' - 'a' : 0, 'b' - 'a' : 1, 초기값은 모두 0
        // 문자열을 char 배열로 변경 가능. String.charAt() 이용
        int strLen = str.length();

        for (int i = 0; i < strLen; i++) {
            alphaCnt[ str.charAt(i) - 'a' ]++;
        }

        // 출력
        for (int i = 0; i < 26; i++) {
            System.out.println( (char)( i + 'a' ) + " : " + alphaCnt[i] );
        }
    }

}
