package sortedsetinterfacepractice;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice_TreeSet {
    public static void main(String[] args) {

        // SortedSet is a type of set that maintain Sorted Order on top of uniqueness

        SortedSet<Long> longTreeSet = new TreeSet<>();
        System.out.println("longTreeSet.add(3L): " + longTreeSet.add(3L));
        System.out.println("longTreeSet.add(20L): " + longTreeSet.add(20L));
        System.out.println("longTreeSet.add(39L): " + longTreeSet.add(39L));
        System.out.println("longTreeSet.add(27L): " + longTreeSet.add(27L));
        System.out.println("longTreeSet.add(20L): " + longTreeSet.add(20L));
        longTreeSet.add(3L);
        longTreeSet.add(39L);
        longTreeSet.add(30L);
        longTreeSet.add(30L);

        System.out.println(longTreeSet);


    }

}
