import java.util.List;

public class Solution {
    public int solution(int k, int[] tangerines) {
        Classifier classifier = new Classifier();

        List<Tangerine> tangerineList = classifier.classify(tangerines);

        List<Tangerine> sorted = classifier.sortByCountDsc(tangerineList);

        List<Tangerine> boxed = classifier.box(k, sorted);

        return boxed.size();
    }
}
