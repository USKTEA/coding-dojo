import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<String> seoul = new ArrayList<>();

    public Solution(String[] strings) {
        for (String name : strings) {
            seoul.add(name);
        }
    }

    public Solution() {
    }

    public int findIndex(String name) {
        return seoul.indexOf(name);
    }


    public String string(int index) {
        return "김서방은 " + index + "에 있다";
    }

    public String solution(String[] strings) {
        for (String name : strings) {
            seoul.add(name);
        }

        return string(findIndex("Kim"));
    }
}
