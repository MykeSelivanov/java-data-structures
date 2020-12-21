package navigatablesetpractice;

import java.util.Arrays;
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
        System.out.println("longNavigableSet.addAll(Arrays.asList(66L,55L,44L,22L) : " + longNavigableSet.addAll(Arrays.asList(66L,55L,44L,22L)));

        System.out.println(longNavigableSet);

        /**   --- NavigableSet Methods on top of SortedSet ---
         *      E lower();
         *      E higher();
         *      E floor();
         *      E ceiling();
         *      E pollFirst();
         *      Iterator<E> descendingIterator();
         *      NavigableSet <E> descendingSet();
         *      NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive);
         *      NavigableSet <E> headSet(E toElement, boolean inclusive);
         *      NavigableSet<E> tailSet(E fromElement, boolean inclusive);
         **/

        // returns closest element, lower than parameter, null if there is no such an element, if parameter is equal to
        // one of the list values, still returns lower value
        System.out.println("longNavigableSet.lower(15L): " + longNavigableSet.lower(15L));
        System.out.println("longNavigableSet.lower(15L): " + longNavigableSet.lower(2L));
        System.out.println("longNavigableSet.lower(15L): " + longNavigableSet.lower(25L));
        System.out.println("longNavigableSet.lower(15L): " + longNavigableSet.lower(20L));

        // returns closest element, higher than parameter, null if there is no such an element
        System.out.println("longNavigableSet.higher(15L): " + longNavigableSet.higher(20L));


        System.out.println(longNavigableSet.floor(20L));


    }


}
