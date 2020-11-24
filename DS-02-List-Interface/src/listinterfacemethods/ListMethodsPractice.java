package listinterfacemethods;

import java.util.*;

public class ListMethodsPractice {
    public static void main(String[] args) {

        // Common List interface methods / those are coming on top of methods from Collection interface

        List<Double> list = new LinkedList<>(Arrays.asList(3d, 4d, 27d, 66d, 3d, 3d, 44d));
        System.out.println(list);

        // Accessing items using index
        System.out.println("first item : list.get(0) : " + list.get(0));

        // adding items in certain index (adding 5.0 at the index 1, 4.0 and consequent objects shifted to index+1
        list.add(1, 5d);
        System.out.println(list);

        // updating items in certain index (replacing old value with the new one)
        list.set(0, 99.0);
        System.out.println(list);
    }
}
