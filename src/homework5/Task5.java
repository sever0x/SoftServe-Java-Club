package homework5;

/**
 * 5. Даний клас Person з полями firstName, lastName, age.
 * Вивести повне ім'я найстаршої людини, у якої довжина цього імені не перевищує 15
 * символів
 */
public class Task5 {
    public static void main(String[] args) {
        Person p1 = new Person("Mark", "Severov", 19);
        Person p2 = new Person("Vladyslav", "Draz", 67);
        Person p3 = new Person("Volodymyr", "Zelensky", 44);

        // TODO
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
}

interface PersonChecks {
    boolean isNameNotExceedLimit(Person person);
}