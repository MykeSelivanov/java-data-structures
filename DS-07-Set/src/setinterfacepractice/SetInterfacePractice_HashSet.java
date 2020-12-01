package setinterfacepractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterfacePractice_HashSet {
    public static void main(String[] args) {

        // Collection of unique items
        // Set interface -- HashSet is implementing class

        Set<Long> longSet = new HashSet<>();
        longSet.addAll(Arrays.asList(7L, 7L, 7L, 7L, 10L, 10L, 10L));
        System.out.println(longSet.size());
        System.out.println(longSet);


    }


}
