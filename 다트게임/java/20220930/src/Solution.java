import java.util.stream.IntStream;

public class Solution {
    public int solution(String dartResult) {
        return sum(result(split(dartResult)));
    }

    public String[] split(String dartResult) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < dartResult.length(); i += 1) {
            if (Character.toString(dartResult.charAt(i)).matches("[0-9]")) {
                if (Character.toString(dartResult.charAt(i + 1)).matches("0")) {
                    if (Character.toString(dartResult.charAt(i)).matches("1")) {
                        if (i == 0) {
                            stringBuilder.append("10");

                            i += 1;

                            continue;
                        }

                        stringBuilder.append(",10");

                        i += 1;

                        continue;
                    }
                }

                if (i == 0) {
                    stringBuilder.append(dartResult.charAt(i));

                    continue;
                }
                stringBuilder.append("," + dartResult.charAt(i));

                continue;
            }

            stringBuilder.append(dartResult.charAt(i));
        }

        return stringBuilder.toString().split(",");
    }

    public int[] result(String[] strings) {
        int[] points = new int[strings.length];

        for (int i = 0; i < strings.length; i += 1) {
            String[] round = strings[i].split("");

            int point = Integer.parseInt(round[0]);
            int index = 1;

            if (round[1].matches("[0 - 9]")) {
                point = 10;
                index += 1;
            }

            if (round[index].equals("D")) {
                point = (int) Math.pow(point, 2);
            }

            if (round[index].equals("T")) {
                point = (int) Math.pow(point, 3);
            }

            index += 1;

            if (round.length == index + 1) {
                if (round[index].equals("*")) {
                    if (i >= 1) {
                        points[i - 1] *= 2;
                    }

                    point *= 2;
                }

                if (round[index].equals("#")) {
                    point *= -1;
                }
            }

            points[i] = point;
        }


        return points;
    }

    public int sum(int[] ints) {
        return IntStream.of(ints).sum();
    }
}
