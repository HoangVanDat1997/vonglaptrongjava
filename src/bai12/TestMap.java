package bai12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John" , 30);
        hashMap.put("Smith" , 25);
        hashMap.put("JohnCena" , 20);
        System.out.println(hashMap + "\n");
        System.out.println();
        Map<String , Integer> treMap = new TreeMap<>();
        System.out.println(treMap);
        Map<String , Integer> linkedHashMap = new LinkedHashMap<>(15 , 0.7f , true);
        linkedHashMap.put("John" , 30);
        linkedHashMap.put("Smith" , 32);
        linkedHashMap.put("JohnCena" , 10);
        linkedHashMap.put("JohnCrin" , 33);
        System.out.println(linkedHashMap.get("John"));
        System.out.println(linkedHashMap);
    }
}
