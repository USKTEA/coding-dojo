import java.util.stream.IntStream;

public class Command {
    private int sliceStart;
    private int sliceEnd;
    private int pick;

    public Command(int sliceStart, int sliceEnd, int pick) {
        this.sliceStart = sliceStart - 1;
        this.sliceEnd = sliceEnd - 1;
        this.pick = pick - 1;
    }

    public Numbers slice(Numbers numbers) {
        Numbers slicedNumbers = new Numbers(new int[]{});
        IntStream.rangeClosed(sliceStart, sliceEnd)
                .forEach(index -> slicedNumbers.add(numbers.get(index)));

        return slicedNumbers;
    }

    public int pick(Numbers numbers) {
        return numbers.sort().get(pick);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        Command otherCommand = (Command) other;

        return sliceStart == otherCommand.sliceStart
                && sliceEnd == otherCommand.sliceEnd
                && pick == otherCommand.pick;
    }
}
