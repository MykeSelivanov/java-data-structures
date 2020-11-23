package iteratorpractice;

import java.util.*;

public class IteratingAnyCollection {
    public static void main(String[] args) {

        Collection<Integer> coll = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

         // ConcurrentModificationException example
         for (Integer each: coll) {
             System.out.println(each);
          //   if (each >= 5) coll.remove(each);
         }

         Iterator<Integer> myIterator = coll.iterator();




    }

}
