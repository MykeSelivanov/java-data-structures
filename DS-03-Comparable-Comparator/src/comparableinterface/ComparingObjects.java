package comparableinterface;

import utils.Person;

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

        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(new Person("John",20), new Person("Marry", 21),
                                        new Person("Adam", 35), new Person("Oksana", 37)));

        System.out.println(personList);
        Collections.sort(personList); // Person class implements Comparable interface allowing us to compare Persons
        System.out.println(personList);


    }

}
