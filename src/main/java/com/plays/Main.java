package main.java.com.plays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.println(arrayList.size());

//        for (int i = 0; i < 100000000; i++) {
//            arrayList.add(i);
//        }

        //System.out.println(arrayList.get(159879));

        final Map<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("one", 1);
        map1.put("three",3);
        map1.put("five",5);

        Map<String, Integer> map2 = new HashMap<String, Integer>();
        map2.put("two", 2);
        map2.put("four",4);
        map2.put("six",6);

        map1.put("two",map2.get("two"));

        System.out.println(map1.keySet());

        map2.entrySet()
                .forEach(entry->map1.merge(
                        entry.getKey(),
                        entry.getValue(),
                        (key,value) -> entry.getValue() + value));

    }
}
