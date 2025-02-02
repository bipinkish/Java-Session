package Streams;

import java.util.List;

import static Streams.Gender.FEMALE;
import static Streams.Gender.MALE;

public class Stream_ {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Robert", MALE, 53),
                new Person("Steve", MALE, 38),
                new Person("Natasha", FEMALE, 24),
                new Person("Bruce", MALE, 42),
                new Person("Wanda", MALE, 28),
                new Person("Clark", MALE, 46)
        );

        boolean containsMale = personList.stream()
                .map(Person::gender)
                .anyMatch(x -> x == MALE);

        System.out.println(containsMale);



    }
}
