package javaBasic.ch18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // 문자
        Writer writer = new FileWriter("/Users/seni/code_workspace/java-study/Eureka/src/main/java/com/ch18/test.txt");

        // ch 한글자
        char a = 'A';
        writer.write(a);
        char b = 'B';
        writer.write(b);

        // ch 배열
        char[] array = {'C', 'D', 'E' };
        writer.write(array);

        // 문자열
        writer.write("FGH");

        writer.flush();
        writer.close();
    }
}
