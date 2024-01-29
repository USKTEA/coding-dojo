import java.util.HashMap;

public class Solution {

    public int solution(int[] ints) {
        Lcm lcm = new Lcm(new PrimeChecker(), new HashMap<>());

        return lcm.getLcm(ints);
    }
}
