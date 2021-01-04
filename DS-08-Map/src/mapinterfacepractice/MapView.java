package mapinterfacepractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapView {
    public static void main(String[] args) {

        Map<String,Integer> scoreMap = new HashMap<>();

        scoreMap.put("Adam",90);
        scoreMap.put("John",90);
        scoreMap.put("Mary",90);
        scoreMap.put("Pete",90);
        scoreMap.put("Glen",90);

        System.out.println(scoreMap);

        //--------------- Map View ---------------

        // Set<K> keySet();
        Set<String> keys = scoreMap.keySet();
        System.out.println(keys);


    }

}
