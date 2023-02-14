import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void toPersons() {
        Solution solution = new Solution();
        List<Person> people = solution.toPeople(new int[]{70, 50, 80, 50});

        assertEquals(List.of(
                new Person(70),
                new Person(50),
                new Person(80),
                new Person(50)
        ), people);
    }

    @Test
    void sortByWeight() {
        Solution solution = new Solution();

        List<Person> people = Arrays.asList(
                new Person(30),
                new Person(40),
                new Person(50),
                new Person(60)
        );

        List<Person> sorted = solution.sort(people);

        assertEquals(Arrays.asList(
                new Person(60),
                new Person(50),
                new Person(40),
                new Person(30)
        ), sorted);
    }

    @Test
    void onBoard() {
        Solution solution = new Solution();

        ArrayList<Person> people = new ArrayList<>(Arrays.asList(
                new Person(80),
                new Person(70),
                new Person(50),
                new Person(50)
        ));

        Boat boat = new Boat(100);

        List<Person> afterOnBoard = solution.onBoard(people, boat);

        assertEquals(afterOnBoard,
                List.of(new Person(70), new Person(50), new Person(50)));
    }

    @Test
    void solution() {
        Solution solution = new Solution();
//
//        int[] people = new int[]{70, 50, 80, 50};
//        int limit = 100;
//
//        int answer = solution.solution(people, limit);
//        assertEquals(3, answer);
//
//        int[] people2 = new int[]{70, 80, 50};
//        int limit2 = 100;
//
//        int answer2 = solution.solution(people2, limit2);
//        assertEquals(3, answer2);
//
//        int[] people3 = new int[]{40, 40, 40, 40, 50};
//        int limit3 = 200;
//
//        int answer3 = solution.solution(people3, limit3);
//        assertEquals(3, answer3);
//
//        int[] people4 = new int[]{60, 60, 51, 51, 100};
//        int limit4 = 100;
//
//        int answer4 = solution.solution(people4, limit4);
//        assertEquals(5, answer4);
//
//        int[] people5 = new int[]{40};
//        int limit5 = 40;
//
//        int answer5 = solution.solution(people5, limit5);
//        assertEquals(1, answer5);
//
//        int[] people6 = new int[]{40, 55, 55, 60, 60, 60, 70, 80};
//        int limit6 = 100;
//
//        int answer6 = solution.solution(people6, limit6);
//        assertEquals(7, answer6);
//
//        int[] people7 = new int[]{30, 70, 50, 50, 70, 70};
//        int limit7 = 100;
//
//        int answer7 = solution.solution(people7, limit7);
//        assertEquals(4, answer7);
//
//        int[] people8 = new int[]{70, 50, 80, 50, 90, 40};
//        int limit8 = 240;
//
//        int answer8 = solution.solution(people8, limit8);
//
//        assertEquals(3, answer8);

        int[] people9 = new int[]{30, 40, 50, 60};
        int limit9 = 100;

        int answer9 = solution.solution(people9, limit9);

        assertEquals(2, answer9);
    }
}
