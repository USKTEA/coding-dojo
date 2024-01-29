import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        return match(split(s), split(t));
    }

    public String[] split(String word) {
        return word.split("");
    }

    public boolean match(String[] s, String[] t) {
        Map<String, String> matcher = new HashMap<>();

        for (int i = 0; i < s.length; i += 1) {
            if (matcher.containsKey(s[i])) {
                if (!Objects.equals(matcher.get(s[i]), t[i])) {
                    return false;
                }
            }

            if (matcher.containsValue(t[i])) {
                if (!matcher.containsKey(s[i])) {
                    return false;
                }
            }

            matcher.put(s[i], t[i]);
        }

        return true;
    }
}
