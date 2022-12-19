import java.util.Objects;

public class BinaryCalculator {
    private int removedZeroCount = 0;
    private int count = 0;

    public int[] calculate(String s) {
        if (Objects.equals(s, "1")) {
            return new int[]{count, removedZeroCount};
        }

        String[] pickedResult = pickZeros(s);

        int removedZeros = Integer.parseInt(pickedResult[0]);

        String result = pickedResult[1];

        removedZeroCount += removedZeros;
        count += 1;

        return calculate(toBinary(result));
    }

    public String[] pickZeros(String s) {
        String picked = String.join("", s.split("0"));

        String removed = Integer.toString(s.length() - picked.length());

        return new String[]{removed, picked};
    }

    public String toBinary(String number) {
        StringBuilder stringBuilder = new StringBuilder();

        int numberLength = number.length();

        if (numberLength == 1) {
            return "1";
        }

        while (numberLength > 1) {
            stringBuilder.append(numberLength % 2);

            numberLength = numberLength / 2;
        }

        stringBuilder.append(numberLength);

        return stringBuilder.reverse().toString();
    }
}
