import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        Numbers numbers = toFirstCollection(array);

        List<Command> commandList = Arrays.stream(commands)
                .map(command -> toCommandObject(command))
                .collect(Collectors.toList());

        int[] result = commandList.stream()
                .mapToInt(command ->
                        command.pick(command.slice(numbers.getNumbers())))
                .toArray();

        return result;
    }

    public Numbers toFirstCollection(int[] ints) {
        return new Numbers(ints);
    }

    public Command toCommandObject(int[] ints) {
        int sliceStart = ints[0];
        int sliceEnd = ints[1];
        int pick = ints[2];

        return new Command(sliceStart, sliceEnd, pick);
    }
}
