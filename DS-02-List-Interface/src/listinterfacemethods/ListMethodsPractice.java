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

        //getting indexes of certain items
        System.out.println("list.indexOf(4.0) : " + list.indexOf(4.0));
        // if you have multiple values it will return index of first occurrence
        System.out.println("Index of first occurrence of 3.0 : " + list.indexOf(3.0));
        // In order to get the last index of the element - lastindexOf
        System.out.println("Last index of 3.0 : " + list.lastIndexOf(3.0));

        // In case when you don't have the value you're looking index for, method will return you -1
        System.out.println("If item not found : " + list.indexOf(100d));

        //remove(Object) - comes from Collection
        //remove(index) - comes from List returns the element that you are removing
        list.remove(1);
        System.out.println(list);

        // addAll at certain index, after insertion, rest the elements will shift
        list.addAll(2, Arrays.asList(88D, 99D));

        // replaceAll (Function : UnaryOperator
        System.out.print("Replace each item with new value increased by 5 : ");
        list.replaceAll(each -> each + 5);
        System.out.println(list);

        // sort
        // using null as a comparator will sort list in the natural ascending order, not a good practice
        //list.sort(null);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
