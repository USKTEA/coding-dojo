import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Solution {
    private List<Position> visited = new ArrayList<>();
    private List<Position> toVisit = new ArrayList<>();

    public int[] solution(String[] maps) {
        return getSums(toIntMaps(maps));
    }

    public int[][] toIntMaps(String[] maps) {
        int[][] intMaps = new int[maps.length][maps[0].split("").length];

        for (int i = 0; i < maps.length; i += 1) {
            String[] map = maps[i].split("");

            for (int j = 0; j < map.length; j += 1) {
                if (Objects.equals(map[j], "X")) {
                    intMaps[i][j] = 0;

                    continue;
                }

                intMaps[i][j] = Integer.parseInt(map[j]);
            }
        }

        return intMaps;
    }

    public int[] getSums(int[][] ints) {
        List<Integer> sums = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < ints.length; i += 1) {
            for (int j = 0; j < ints[i].length; j += 1) {
                if (ints[i][j] == 0) {
                    continue;
                }

                if (visited.contains(new Position(i, j))) {
                    continue;
                }

                visited.add(new Position(i, j));

                sum += ints[i][j];

                if (j > 0 && ints[i][j - 1] != 0 && !visited.contains(new Position(i, j - 1))) {
                    toVisit.add(new Position(i, j - 1));
                }

                if (i + 1 < ints.length && ints[i + 1][j] != 0 && !visited.contains(new Position(i + 1, j))) {
                    toVisit.add(new Position(i + 1, j));
                }

                if (j + 1 < ints[i].length && ints[i][j + 1] != 0 && !visited.contains(new Position(i, j + 1))) {
                    toVisit.add(new Position(i, j + 1));
                }

                while (toVisit.size() != 0) {
                    Position position = toVisit.remove(0);

                    if (visited.contains(position)) {
                        continue;
                    }

                    int a = position.getY();
                    int b = position.getX();

                    visited.add(position);

                    sum += ints[a][b];

                    if (b > 0 && ints[a][b - 1] != 0 && !visited.contains(new Position(a, b - 1))) {
                        toVisit.add(new Position(a, b - 1));
                    }

                    if (a + 1 < ints.length && ints[a + 1][b] != 0 && !visited.contains(new Position(a + 1, b))) {
                        toVisit.add(new Position(a + 1, b));
                    }

                    if (b + 1 < ints[0].length && ints[a][b + 1] != 0 && !visited.contains(new Position(a, b + 1))) {
                        toVisit.add(new Position(a, b + 1));
                    }
                }

                sums.add(sum);
                sum = 0;
            }
        }

        if (sums.size() == 0) {
            return new int[]{-1};
        }

        return sums.stream()
                .mapToInt(v -> v)
                .sorted()
                .toArray();
    }
}
