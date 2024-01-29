import java.util.ArrayList;
import java.util.List;

public class Boat {
    private int count = 0;
    private int limit;
    private int currentWeight = 0;
    private List<Person> passengers = new ArrayList<>();

    public Boat(int limit) {
        this.limit = limit;
    }

    public List<Person> onBoard(List<Person> people) {
        Person passenger = people.get(0);
        passengers.add(passenger);
        currentWeight += passenger.weight();

        people.remove(0);

        Person nextPassenger = findNext(people);

        if (nextPassenger == null) {
            departure();

            return people;
        }

        people.remove(nextPassenger);
        passengers.add(nextPassenger);

        departure();

        return people;
    }

    private void departure() {
        count += 1;
        currentWeight = 0;
        passengers = new ArrayList<>();
    }

    private Person findNext(List<Person> people) {
        return people.stream()
                .filter(person -> person.weight() <= limit - currentWeight)
                .findFirst()
                .orElse(null);
    }

    public int count() {
        return count;
    }
}
