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
        personList.add(new Person("Helena", 19));
        personList.add(new Person("Helena", 20));

        Comparator<Person> comparator = new PersonNameComparator(); // comparing logic implemeted in PersonNameComparator class
        Collections.sort(personList, comparator);
        System.out.println("Comparing by names : " + personList);

        Comparator<Person> ageComparator = Comparator.comparing(person -> person.getAge()); // comparing logic implemented with lambda in comparing method
        Collections.sort(personList, ageComparator);
        System.out.println("Comparing by age : " + personList);

        Comparator<Person> nameDescComparator = (person1, person2) -> person2.getName().compareTo(person1.getName());
        Collections.sort(personList, nameDescComparator);
        System.out.println("Reversed(desc) by names: " + personList);

        Comparator<Person> nameDescThenAgeComparator = nameDescComparator.thenComparing(ageComparator.reversed()); // comparing by names desc and then comparing by age desc
        Collections.sort(personList, nameDescThenAgeComparator);
        System.out.println("Name desc and then age desc comparator : " + personList);


    }
}
