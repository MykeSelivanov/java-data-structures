package sortedsetinterfacepractice;

import java.util.Arrays;
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

        System.out.println(longTreeSet);

        System.out.println("longTreeSet.first(): " + longTreeSet.first());
        System.out.println("longTreeSet.last(): " + longTreeSet.last());

        longTreeSet.addAll(Arrays.asList(15L, 18L, 15L, 18L));
        System.out.println(longTreeSet);

        // SortedSet -->> null is not allowed!
        // longTreeSet.add(null);

        // Getting the view out of SortedSet
        // SortedSet<E> subSet(E fromElement, E toElement);
        // SortedSet<E> headSet(E toElement);
        // SortedSet<E> tailSet(E fromElement);

        System.out.println("longTreeSet.subSet(15L, 21L): " + longTreeSet.subSet(15L, 21L));
        System.out.println("longTreeSet.headSet(18L): " + longTreeSet.headSet(18L));
        System.out.println("longTreeSet.tailSet(18L): " + longTreeSet.tailSet(18L));

        SortedSet<Long> tailView = longTreeSet.tailSet(18L);
        tailView.remove(20L); // removing from a view will also remove from an original set, view is a part of the original list
        System.out.println(tailView);
        System.out.println(longTreeSet);


    }

}
