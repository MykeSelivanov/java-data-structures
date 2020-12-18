package hashsetpractice;

import utils.Person;

import java.util.HashSet;
import java.util.Set;

public class SetOfPerson_HashSet {
    public static void main(String[] args) {

        Set<Person> personSet = new HashSet<>();

        Person p1 = new Person("John",20);
        Person p2 = new Person("John",20);
        Person p3 = new Person("John",21);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        // each hashcode will be unique, meaning all of those objects will be added to HashSet
        // you need to Override hashcode() and equal() methods in Person class in order for HashSet to stop accepting duplicate values
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);

        System.out.println(personSet.size());

        // After generating overriden methods in Person class, equals will start checking for the actual objects equality
        System.out.println(p1.equals(p2));

    }


}
