package mapinterfacepractice;

import java.util.HashMap;
import java.util.Map;

public class MapInterfacePractice {
    public static void main(String[] args) {
        /**
         * An object that maps keys to values
         * A map cannot contain duplicate keys, each key can map to at most one value
         *
         *      Map
         *   General implementation - HashMap
         *
         *   SortedMap extends Map interface
         *   NavigatableMap extends SortedMap interface
         *   TreeMap implements NavigatableMap
         *
         *   Legacy class HashTable
         *
         */

        Map<String,Integer> scoreMap = new HashMap<>();

        // -----Map Interface Methods-----

        // V put(K key, V value);
        scoreMap.put("Adam",90);
        scoreMap.put("John",92);
        scoreMap.put("Mary",100);
        System.out.println(scoreMap);

        // adding duplicate key
        System.out.println(scoreMap.put("Mary",77)); // does not create duplicate key, overrides the value for the existing one

        // int size();
        System.out.println(scoreMap.size());

        // V get(Object key);
        System.out.println("Mary's score: " + scoreMap.get("Mary"));
        System.out.println("Adam's score: " + scoreMap.get("Adam"));

        // boolean isEmpty();
        System.out.println("Map isEmpty: " + scoreMap.isEmpty());

        // boolean containsKey(Object key);
        System.out.println("contains key: " + scoreMap.containsKey("John"));
        System.out.println("contains key: " + scoreMap.containsKey("Alex"));

        // boolean containsValue(Object value);
        System.out.println("contains value: " + scoreMap.containsValue(77));
        System.out.println("contains value: " + scoreMap.containsValue(150));

        // V remove(Object key);
        System.out.println("removing key Adam : " + scoreMap.remove("Adam"));

        // void putAll(Map<? extends K, ? extends V> m);
        Map<String,Integer> testMap = new HashMap<>();
        testMap.put("Victor",33);
        testMap.put("Jack",44);
        testMap.put("Ernest",55);
        System.out.println(testMap);

        scoreMap.putAll(testMap);
        System.out.println(scoreMap);

        // void clear();
        testMap.clear();
        System.out.println(testMap);

        // ---Java 8 addition---

        // V putIfAbsent(K key, V value);
        scoreMap.putIfAbsent("Mary", 100);
        scoreMap.putIfAbsent("Mary2", 100);
        System.out.println("ScoreMap: " + scoreMap);

        // V getOrDefault(Object key, V defaultValue); - gives the value if present or default if key is not found
        System.out.println("Get Alex's score: " + scoreMap.get("Alex")); // gives null
        System.out.println("Get Alex's score: " + scoreMap.getOrDefault("Alex",-1));

        // boolean remove(Object key, Object value); - takes 2 params, will remove value only when your key and value match
        System.out.println("Remove Jack's score: " + scoreMap.remove("Jack"));
        System.out.println("scoreMap: " + scoreMap);
        System.out.println("Remove Victor's score with 2 params remove, value not matching: " + scoreMap.remove("Victor", 55));
        System.out.println("scoreMap: " + scoreMap);
        System.out.println("Remove Victor's score with 2 params remove, value is matching: " + scoreMap.remove("Victor", 33));
        System.out.println("scoreMap: " + scoreMap);


        // boolean replace(K key, V oldValue, V newValue);

        // V replace(K key, V value);



    }

}
