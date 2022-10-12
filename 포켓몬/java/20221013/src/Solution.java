import java.util.HashSet;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] nums) {
        int kinds = toSet(nums).size();
        int halfAmount = nums.length / 2;

        return choose(halfAmount, kinds);
    }

    public HashSet<Integer> toSet(int[] ints) {
        HashSet<Integer> set = new HashSet<>();

        IntStream.range(0, ints.length).forEach(number -> set.add(ints[number]));

        return set;
    }

    public int choose(int half, int kinds) {
        return half > kinds ? kinds : half;
    }
}
