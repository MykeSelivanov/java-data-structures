package comparatorinterface;

import utils.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfacePractice {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Mike", 25));
        personList.add(new Person("Anna", 27));
        personList.add(new Person("Josh", 47));
        personList.add(new Person("Helena", 18));

        Comparator<Person> comp = new PersonNameComparator();
        Collections.sort(personList, comp);
        System.out.println(personList);

    }
}
