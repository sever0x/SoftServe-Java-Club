package homework5;

import java.util.*;

/**
 * 5. Даний клас Person з полями firstName, lastName, age.
 * Вивести повне ім'я найстаршої людини, у якої довжина цього імені не перевищує 15
 * символів
 */
public class Task5 {
    public static void main(String[] args) {
        List<Person> personList = getPersonList();

        Person oldestPerson = getOldestPerson(personList);
        System.out.println("Full name: " + oldestPerson.getFirstName() + " " + oldestPerson.getLastName());
    }

    private static Person getOldestPerson(List<Person> personList) {
        Optional<Person> oldestPerson = personList
                .stream()
                .filter(person -> (person.getFirstName() + person.getLastName()).length() <= 15).findFirst();

        return oldestPerson.orElse(null);
    }

    private static List<Person> getPersonList() {
        Person p1 = new Person("Mark", "Severov", 19);
        Person p2 = new Person("Vladyslav", "Draz", 43);
        Person p3 = new Person("Volodymyr", "Zelensky", 44);
        List<Person> personList = Arrays.asList(p1, p2, p3);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getAge() - t1.getAge();
            }
        }.reversed());

        return personList;
    }
}

class Person {
    private String firstName;

    private String lastName;

    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}