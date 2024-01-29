import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Solution {
    public int solution(String s) {
        List<String> zipped = new ArrayList<>();

        for (int i = 1; i <= s.length() / 2 + 1; i += 1) {
            List<String> sliced = slice(s, i);

            zipped.add(zip(sliced));
        }

        zipped.sort(Comparator.comparingInt(String::length));

        return zipped.get(0).length();
    }

    public String zip(List<String> sliced) {
        StringBuilder stringBuilder = new StringBuilder();
        int zipped = 0;
        String zipping = null;

        for (int i = 0; i < sliced.size(); i += 1) {
            if (Objects.isNull(zipping)) {
                zipping = sliced.get(i);
                zipped += 1;

                continue;
            }

            if (Objects.equals(zipping, sliced.get(i))) {
                zipped += 1;

                continue;
            }

            if (!Objects.equals(zipping, sliced.get(i))) {
                if (zipped == 1) {
                    stringBuilder.append(zipping);
                }

                if (zipped > 1) {
                    stringBuilder.append(zipped + zipping);
                }

                zipping = sliced.get(i);
                zipped = 1;
            }
        }

        if (zipped == 1) {
            stringBuilder.append(zipping);
        }

        if (zipped > 1) {
            stringBuilder.append(zipped + zipping);
        }

        return stringBuilder.toString();
    }

    public List<String> slice(String s, int piece) {
        List<String> sliced = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i += piece) {
            for (int j = i; j < i + piece; j += 1) {
                if (j == s.length()) {
                    break;
                }

                stringBuilder.append(s.charAt(j));
            }

            sliced.add(stringBuilder.toString());
            stringBuilder = new StringBuilder();
        }

        return sliced;
    }
}
