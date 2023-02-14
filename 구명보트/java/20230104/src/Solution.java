import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] people, int limit) {
        Boat boat = new Boat(limit);

        List<Person> remains = sort(toPeople(people));

        while(remains.size() > 0) {
            boat.onBoard(remains);
        }

        return boat.count();
    }

    public List<Person> toPeople(int[] ints) {
        return Arrays.stream(ints)
                .mapToObj((weight) -> new Person(weight))
                .collect(Collectors.toList());
    }

    public List<Person> sort(List<Person> persons) {
        persons.sort(Comparator.naturalOrder());

        return persons;
    }

    public List<Person> onBoard(List<Person> persons, Boat boat) {
        List<Person> afterBoarded = boat.onBoard(persons);

        return afterBoarded;
    }
}
