package listinterfacemethods;

import java.util.*;

public class ListMethodsPractice {
    public static void main(String[] args) {

        // Common List interface methods / those are coming on top of methods from Collection interface

        List<Double> list = new LinkedList<>(Arrays.asList(3d, 4d, 27d, 66d, 3d, 3d, 44d));

        // Accessing items using index
        System.out.println("first item : list.get(0) : " + list.get(0));



    }
}
