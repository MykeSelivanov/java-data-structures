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

        // Collection<V> values();
        Collection<Integer> valuesList = scoreMap.values();
        System.out.println(valuesList);
        valuesList.remove(55); // removing from a valueView will also reflect on the original map
        System.out.println(scoreMap);


    }

}
