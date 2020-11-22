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

        // adding multiple items in one shot
        coll.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(coll);

        // getting size
        System.out.println("cool.size() : " + coll.size());

        // checking empty or not

    }

}
