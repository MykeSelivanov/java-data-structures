package sortedmappractice;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterfacePractice {
    public static void main(String[] args) {

        /** Map
         * General implementation -- HashMap
         *
         * SortedMap      extends Map interface
         * NavigatableMap extends SortedMap interface
         * TreeMap        implements NavigatableMap
         */

        SortedMap<String,Integer> scoreSortedMap = new TreeMap<>();
        // V put(K key, V value);
        scoreSortedMap.put("Adam", 90);
        scoreSortedMap.put("Jill", 74);
        scoreSortedMap.put("Peter", 65);
        scoreSortedMap.put("Alice", 88);
        scoreSortedMap.put("Jane", 95);
        scoreSortedMap.put("Tom", 67);
        scoreSortedMap.put("Craig", 73);

        System.out.println(scoreSortedMap); // sorted by keys

        // ----------SortedMap methods----------
        // K firstKey();
        System.out.println("scoreSortedMap.firstKey() : " + scoreSortedMap.firstKey());

        // K lastKey();
        System.out.println("scoreSortedMap.lastKey() : " + scoreSortedMap.lastKey());

        // ----- view -----
        // SortedMap<K,V> subMap(K fromKey, K toKey);
        System.out.println("scoreSortedMap.subMap(\"Alice\",\"Jill\") : " + scoreSortedMap.subMap("Alice","Jill"));
//      System.out.println(scoreSortedMap.subMap("abc", "Peter")); // will throw an exception if starting point is not in map
        System.out.println(scoreSortedMap.subMap("Jane", "abc")); // will give a subMap from existing starting

        // SortedMap<K,V> headMap(K toKey);
        System.out.println("scoreSortedMap.headMap(\"Jane\") : " + scoreSortedMap.headMap("Jane"));
        System.out.println("scoreSortedMap.headMap(\"abc\") : " + scoreSortedMap.headMap("abc")); // will give all values

        // SortedMap<K,V> tailMap(K toKey);
        System.out.println("scoreSortedMap.tailMap(\"Craig\") : " + scoreSortedMap.tailMap("Craig"));


    }

}
