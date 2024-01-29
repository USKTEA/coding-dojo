import java.util.stream.LongStream;

public class Solution {
    public long solution(int price, int money, int count) {
        long total = sum(price, count);

        if (canAfford(money, total)) {
            return 0;
        }

        return total - money;
    }
    
    public long sum(int price, int count) {
        return LongStream.range(1, count + 1).map(index -> price * index).sum();
    }

    public boolean canAfford(int money, long price) {
        return money >= price;
    }
}
