package sublist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class listViewSubListPractice {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);

        // getting view our of list object
        // view is a part of your original list object
        // subList(from, to); index, first index is always inclusive, last index is always exclusive

        System.out.println("List view form index 2 till before 5 \n" +
                "list.subList(2, 5) : " + list.subList(2, 5));

        var partOfListView = list.subList(3, 7);
        System.out.println(partOfListView);
        partOfListView.set(0, 99); // will also replace the value in the original list object as well
        System.out.println(partOfListView);
        System.out.println(list);

    }
}
