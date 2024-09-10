package sept10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        // isEmpty
        System.out.println(map.isEmpty());

        map.put("Dhoni",90);
        map.put("Virat",80);
        map.put("Rohit",80);
        map.put("Hardik",70);

        Set<Map.Entry<String,Integer>> newSet = map.entrySet();
        System.out.println(newSet);

        // isEmpty
        System.out.println(map.isEmpty());

        System.out.println(map);

        // remove
        map.remove("Hardik");

        System.out.println(map);

        System.out.println(map.containsKey("Hardik"));

        System.out.println(map.containsValue(90));

        map.putIfAbsent("Dhoni",100);

        map.put("sachin",null);
        System.out.println(map);

        map.put(null,null);
        System.out.println(map);


        for(Map.Entry<String,Integer> s: newSet){
            System.out.println(s.getKey()+"------"+s.getValue());
        }

    }
}
