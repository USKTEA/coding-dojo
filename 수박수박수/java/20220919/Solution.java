public class Solution {
    public String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();

        int times = n / 2;

        for (int i = 0; i < times; i += 1) {
            stringBuilder.append("수박");
        }

        if (n % 2 == 1) {
            stringBuilder.append("수");
        }

        return stringBuilder.toString();
    }
}
