package listiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class SpecialListIterator {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        // list iterator
        ListIterator<Integer> listIterator = numbers.listIterator();

        System.out.println("listIterator.hasNext() : " + listIterator.hasNext());

        // returns next element's index
        System.out.println("listIterator.nextIndex() : " + listIterator.nextIndex()); // since we did not start itertind it will return next index 0

        while(listIterator.hasNext()){
            System.out.print("listIterator.nextIndex() : " + listIterator.nextIndex());
            var item = listIterator.next();
            System.out.println(" Item is: " + item);
        }



    }

}
