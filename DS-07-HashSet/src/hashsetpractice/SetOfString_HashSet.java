package hashsetpractice;

import java.util.HashSet;
import java.util.Set;

public class SetOfString_HashSet {
    public static void main(String[] args) {

        System.out.println(new String("Adam").hashCode());
        System.out.println(new String("John").hashCode()); // same hashcode value as above
        // hashcode is equal therefore .equal method will return true

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Adam");
        stringSet.add("John");
        /*
        HashCode    |   Value
        2035631     |   Adam
        2314539     |   John
         */

        System.out.println(stringSet.size());

    }

}
