package setinterfacepractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterfacePractice_HashSet {
    public static void main(String[] args) {

        // Collection of unique items
        // Set interface -- HashSet is implementing class

        Set<Long> longSet = new HashSet<>(Arrays.asList(7L, 7L, 7L, 7L, 10L, 10L, 10L));
        System.out.println("longSet.add(50L) : " + longSet.add(50L));
        System.out.println("longSet.add(50L) : " + longSet.add(50L));
        System.out.println("longSet.add(50L) : " + longSet.add(50L));
        System.out.println(longSet.size());
        System.out.println(longSet);

        longSet.addAll(Arrays.asList(2L, 3L, 4L, 4L, 4L));
        System.out.println(longSet);

        longSet.remove(4L);
        System.out.println(longSet);

        longSet.add(null);
        System.out.println(longSet);
        // Update an item -> check whatever it already exists and if so, remove it then add the item you want
        if(!longSet.add(null)) {
            longSet.remove(null);
            longSet.add(0L);
        }
        System.out.println(longSet);

    }
}
