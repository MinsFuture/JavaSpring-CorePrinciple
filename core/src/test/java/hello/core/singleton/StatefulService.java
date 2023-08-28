package hello.core.singleton;

public class StatefulService {

    // private int price; // 상태를 유지하는 필드

    public int order(String name, int price) {
        System.out.println("name = " + name + " price" + price);
        // this.price = price; // 특정 클라이언트가 값을 변경할 수 있도록 하는 코드... stateful의 원인!!
        return price;
    }
}
