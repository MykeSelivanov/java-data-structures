package sortedsetinterfacepractice;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPractice_TreeSet {
    public static void main(String[] args) {

        // SortedSet is a type of set that maintain Sorted Order on top of uniqueness

        SortedSet<Long> longTreeSet = new TreeSet<>();
        longTreeSet.add(3L);
        longTreeSet.add(3L);
        longTreeSet.add(39L);
        longTreeSet.add(30L);
        longTreeSet.add(30L);

        System.out.println(longTreeSet);


    }

}
