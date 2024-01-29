import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> status = studentStatus(n);
        List<Integer> reserved = reflectReserved(status, reserve);
        List<Integer> afterLost = reflectLost(reserved, lost);
        List<Integer> afterBorrow = borrow(afterLost);

        return count(afterBorrow);
    }

    public List<Integer> studentStatus(int students) {
        int[] status = new int[students];

        return Arrays.stream(status).map((number) -> 1).boxed().collect(Collectors.toList());
    }

    public List<Integer> reflectReserved(List<Integer> status, int[] reserve) {
        Arrays.stream(reserve).forEach((studentNumber) -> status.set(studentNumber - 1, 2));

        return status;
    }

    public List<Integer> reflectLost(List<Integer> status, int[] lost) {
        Arrays.stream(lost)
                .forEach((studentNumber) -> status.set(studentNumber - 1, status.get(studentNumber - 1) - 1));

        return status;
    }

    public List<Integer> borrow(List<Integer> status) {
        IntStream.range(0, status.size())
                .forEach((index) -> {
                    if (status.get(index) == 0 && index == 0 && status.get(index + 1) > 1) {
                        status.set(index + 1, status.get(index + 1) - 1);
                        status.set(index, 1);

                        return;
                    }

                    if (status.get(index) == 0) {
                        if (index - 1 < 0) {
                            return;
                        }

                        if (status.get(index - 1) > 1) {
                            status.set(index - 1, status.get(index - 1) - 1);
                            status.set(index, 1);

                            return;
                        }

                        if (index + 1 > status.size() - 1) {
                            return;
                        }

                        if (status.get(index + 1) > 1) {
                            status.set(index + 1, status.get(index + 1) - 1);
                            status.set(index, 1);
                        }
                    }
                });

        return status;
    }

    public int count(List<Integer> status) {
        return IntStream.range(0, status.size()).reduce(0, (studentCantTakeLesson, index) -> {
            if (status.get(index) > 0) {
                return studentCantTakeLesson += 1;
            }

            return studentCantTakeLesson;
        });
    }
}
