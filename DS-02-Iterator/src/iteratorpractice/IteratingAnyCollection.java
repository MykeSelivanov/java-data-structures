package iteratorpractice;

import java.util.*;

public class IteratingAnyCollection {
    public static void main(String[] args) {

        Collection<Integer> coll = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

         // ConcurrentModificationException example
         for (Integer each: coll) {
             System.out.println(each);
          //   if (each > 5) coll.remove(each);
         }

         Iterator<Integer> myIterator = coll.iterator();

         // hasNext(); return boolean, does not move iterator to the next location
        System.out.println(myIterator.hasNext());

        // next(); moves iterator to the next location, whenever you call this method
        System.out.println(myIterator.next()); // 1
        System.out.println(myIterator.next()); // 2
        System.out.println(myIterator.next()); // 3

        // remove(); removes item from the current iterator's location
        myIterator.remove(); //3 was removed
        System.out.println(coll);

        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(10,11,12,13,14,15,16,17,18,19,20));
        System.out.println(numbers);

        Iterator<Integer> numsIterator = numbers.iterator();

        // remove all numbers > 15
        while (numsIterator.hasNext()) {
            Integer number =
        }





    }

}
