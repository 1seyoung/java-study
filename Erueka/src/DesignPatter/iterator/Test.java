package DesignPatter.iterator;

//자바 컬렉션에서 제공하는 Iterator 를 사용하기 위해서는
// 해당 컬렉션이 Iterator 패턴을 적용해야한다.
public class Test {
    public static void main(String[] args) {
        StringContainer container = new StringContainer();

        Iterator itr = container.getIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}


//21// 조별 워크 geneniI wildcard(*) 교재 이행, StringContainer 에 적용된 Iterator 에 String 만이 아닌 다른 타입도 적용하도록 generic 적용