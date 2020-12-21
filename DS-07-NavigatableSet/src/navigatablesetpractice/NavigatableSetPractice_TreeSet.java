package navigatablesetpractice;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigatableSetPractice_TreeSet {
    public static void main(String[] args) {

        NavigableSet<Long> longNavigableSet = new TreeSet<>();
        System.out.println("longNavigableSet.add(3L) : " + longNavigableSet.add(3L));
        System.out.println("longNavigableSet.add(20L) : " + longNavigableSet.add(20L));
        System.out.println("longNavigableSet.add(39L) : " + longNavigableSet.add(39L));
        System.out.println("longNavigableSet.add(27L) : " + longNavigableSet.add(27L));
        System.out.println("longNavigableSet.add(20L) : " + longNavigableSet.add(20L));

        System.out.println(longNavigableSet);

        /**   --- NavigableSet Methods on top of SortedSet ---
         *      E lower();
         *      E higher();
         *      E floor();
         *      E ceiling();
         *      E pollFirst();
         *      Iterator<E> descendingIterator();
         *      NavigableSet <E> descendingSet();
         *      */

    }


}
