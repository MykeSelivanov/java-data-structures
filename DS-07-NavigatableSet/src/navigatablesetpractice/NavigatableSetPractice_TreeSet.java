package navigatablesetpractice;

import java.util.*;

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
        // basically lower is >
        System.out.println("longNavigableSet.lower(15L): " + longNavigableSet.lower(15L));
        System.out.println("longNavigableSet.lower(15L): " + longNavigableSet.lower(2L));
        System.out.println("longNavigableSet.lower(15L): " + longNavigableSet.lower(25L));
        System.out.println("longNavigableSet.lower(15L): " + longNavigableSet.lower(20L));

        // returns closest element, higher than parameter, null if there is no such an element if parameter is equal to
        // one of the list values, still returns greater value
        // basically higher is <
        System.out.println("longNavigableSet.higher(15L): " + longNavigableSet.higher(20L));

        // floor gives the closest lower value, but when parameter is equal to one of the set values, it will return this value
        // floor is >=
        System.out.println("longNavigableSet.floor(20L): " + longNavigableSet.floor(20L));
        System.out.println("longNavigableSet.floor(19L): " + longNavigableSet.floor(19L));

        // ceiling gives the closest greater value, but when parameter is equal to one of the set values, it will return this value
        // ceiling is <=
        System.out.println("longNavigableSet.ceiling(20L): " + longNavigableSet.ceiling(20L));
        System.out.println("longNavigableSet.ceiling(20L): " + longNavigableSet.ceiling(45L));

        // pollFirst is a safety check without a risk to run into NoSuchElementException and to remove value that you're polling
        longNavigableSet.clear();
        // System.out.println(longNavigableSet.first()); - will give a NoSuchElementException
        System.out.println("longNavigableSet.pollFirst(): " + longNavigableSet.pollFirst()); // will give null if item is not there
        // same logic with the pollLast
        longNavigableSet.add(20L);
        longNavigableSet.pollLast();
        System.out.println(longNavigableSet); // empty set

        longNavigableSet.addAll(Arrays.asList(11L,22L,33L,44L,55L));
        System.out.println(longNavigableSet);
        Set<Long> newSetInDesc = longNavigableSet.descendingSet();
        System.out.println(newSetInDesc);

        longNavigableSet.addAll(Arrays.asList(66L,77L,88L,99L,100L,110L));
        System.out.println(longNavigableSet);
        System.out.println("longNavigableSet.subSet(22L,false,99L,true): " +
                longNavigableSet.subSet(22L,false,99L,true));






    }


}
