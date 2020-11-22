package collectioninterfacemethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MethodPractice {
    public static void main(String[] args) {

        // Common Collection interface methods
        Collection<Integer> coll = new ArrayList<>();

        // adding items
        coll.add(3);
        coll.add(30);
        coll.add(10);
        System.out.println(coll);
        // add method returns boolean
        System.out.println("coll.add(10) : " + coll.add(10));

        // adding multiple items in one shot
        coll.addAll(Arrays.asList(1,2,3,4,5,6,7,9));
        System.out.println(coll);

        // getting size
        System.out.println("cool.size() : " + coll.size());

        // checking empty or not
        System.out.println("coll.isEmpty() : " + coll.isEmpty());

        // remove item
        coll.remove(7);
        System.out.println(coll);
        // remove method returns boolean
        System.out.println("coll.remove(17) : " + coll.remove(17));

        // contains item
        System.out.println("coll.contains(7) : " + coll.contains(7));

        // contains All items
        System.out.println("coll.containsAll(Arrays.asList(30, 5, 9)) : " + coll.containsAll(Arrays.asList(30, 5, 9)));

        // remove All
        coll.removeAll(Arrays.asList(3, 5, 10));
        System.out.println(coll);
        // remove all returns boolean
        System.out.println("coll.removeAll(Arrays.asList(30, 2, 4)) : " + coll.removeAll(Arrays.asList(30, 2, 4)));

        // retains All



    }

}
