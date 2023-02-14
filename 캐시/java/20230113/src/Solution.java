public class Solution {
    public int solution(int cacheSize, String[] cities) {
        Database database = new Database(cacheSize);

        int time = database.search(cities, 0, 0, 0);

        return time;
    }
}
