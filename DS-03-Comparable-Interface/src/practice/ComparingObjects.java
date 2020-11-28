package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparingObjects {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Mike","Stacy","Peter","Diana"));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }

}
