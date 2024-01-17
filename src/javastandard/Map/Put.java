package javastandard.Map;
import java.util.HashMap;

public class Put {
    public static void main(String[] args) {
        HashMap<String,String>map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
    }
}
/*put 메서드는 key와 value를 추가할 수 있다.
* HashMap의 제네릭스는 key, value 모두 String 자료형이므로, key, value에 String 이외의 자료형은 사용할 수 없다.*/
