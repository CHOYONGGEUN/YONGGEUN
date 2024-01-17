package javastandard.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer>store = new HashMap<>();

        //add
        store.put("water",1);
        store.put("fruit",5);

        //add - water가 이미 있으므로 새로운 value로 업데이트
        store.put("water",2);

        //keyset을 이용하여 print
        for (String s : store.keySet()) {
            System.out.println("store.get(key) = " + store.get(s));

        }
    }

}
