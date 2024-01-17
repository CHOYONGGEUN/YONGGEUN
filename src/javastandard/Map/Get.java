package javastandard.Map;
import java.util.HashMap;

public class Get {
    public static void main(String[] args) {
        HashMap<String,String>map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people")); //사람 출력
        System.out.println(map.get("java"));//null 출력
        System.out.println(map.keySet());//모든 key값 출력
        System.out.println(map.values());//모든 value값 출력
    }
}
