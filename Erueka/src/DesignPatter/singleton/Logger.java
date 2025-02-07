package DesignPatter.singleton;

import java.time.LocalDateTime;

public class Logger {

    //3. static 필드로 Looger 변수 필요
    private static Logger Logger; //lazy loading

    //1. 생성자를 private로
    private Logger() {}

    //2. 자기 객체를 생성 전달하려는 메소드 제공
    //외부에서 Logger 객체 생성 없이 호출 가능
    public static Logger getInstance() {
        //return Logger; //eager loaing
        if (Logger == null) {
            Logger = new Logger();
        }
        return Logger ;
    }

    public void log(String message) {
        LocalDateTime ldt = LocalDateTime.now();
        String date = ldt.getYear() + "/" + ldt.getMonthValue();
        String time = ldt.getHour() + ":" + ldt.getMinute();

        System.out.println("[" + date +  " "+ time+ "]" + message);
    }
}
