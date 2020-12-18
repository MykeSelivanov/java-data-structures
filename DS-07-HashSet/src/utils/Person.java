package utils;

import java.util.Objects;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int hashCode() {
//        return 1000;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        Person p = (Person) obj;
//        if (this.name.equals(p.name) && this.age == p.age) return true;
//        return false;
//    }

    // Generate equals and hashcode methods to check the actual objects equality
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
