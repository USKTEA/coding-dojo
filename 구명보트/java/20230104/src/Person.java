import java.util.Objects;

public class Person implements Comparable<Person> {
    private int weight;

    public Person(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Person person = (Person) object;

        return weight == person.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    public int weight() {
        return weight;
    }

    @Override
    public int compareTo(Person person) {
        if (weight > person.weight()) {
            return -1;
        }

        if (weight < person.weight()) {
            return 1;
        }

        return 0;
    }
}
