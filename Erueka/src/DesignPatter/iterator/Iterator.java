package DesignPatter.iterator;
//java.util에서 제공하는 Iteraotr 대신 우리만의 Iterator를 작성
// 컬렉션을 순회하기 위한 메소드 제공
public interface Iterator<T> {
    boolean hasNext();
    //Object next(); // generic 적용 전
    T next();
}
