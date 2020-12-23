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

        // int size();
        System.out.println(scoreMap);

        // boolean isEmpty();
        // boolean containsKey(Object key);
        // boolean containsValue(Object value);
        // V get(Object key);
        // V put(K key, V value);
        // V remove(Object key);
        // void putAll(Map<? extends K, ? extends V> m);
        // void clear();

        // ---Java 8 addition---
        // V putIfAbsent(K key, V value);
        // V getOrDefault(Object key, V defaultValue);
        // boolean remove(Object key, Object value);
        // boolean replace(K key, V oldValue, V newValue);
        // V replace(K key, V value);

        //

    }

}
