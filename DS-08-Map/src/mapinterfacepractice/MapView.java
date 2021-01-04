package mapinterfacepractice;

import java.util.*;

public class MapView {
    public static void main(String[] args) {

        Map<String,Integer> scoreMap = new HashMap<>();

        scoreMap.put("Adam",90);
        scoreMap.put("John",88);
        scoreMap.put("Mary",55);
        scoreMap.put("Pete",35);
        scoreMap.put("Glen",41);

        System.out.println(scoreMap);

        //--------------- Map View ---------------

        // Set<K> keySet();
        Set<String> keys = scoreMap.keySet();
        System.out.println(keys);
        keys.remove("Adam"); // after removing from keyView it will also reflect on the original map
        System.out.println(scoreMap);

        for (String key: keys) {
            System.out.println("Key is: " + key + " value is: " + scoreMap.get(key));
        }

        // Collection<V> values();
        Collection<Integer> valuesList = scoreMap.values();
        System.out.println(valuesList);
        valuesList.remove(55); // removing from a valueView will also reflect on the original map
        System.out.println(scoreMap);

        // Set<Entry<K,V>> entrySet(); - Entry is an interface embedded into map interface and it is used to represent
        // mapEntry - key,value pair together as one
        // when you get the entrySet view out of the map your datatype will be the Entry, each item in the Set will be
        // seen as one entry, there are 3 methods available in entry interface:
        // getValue(), setValue(), getKey()



    }

}
