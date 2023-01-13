public class Database {
     private final Cache cache;

    public Database(int cacheSize) {
        this.cache = new Cache(cacheSize);
    }

    public int search(String[] cities, int index, int hit, int miss) {
        if (index == cities.length) {
            return getProcessTime(hit, miss);
        }

        if (cache.match(cities[index].toLowerCase())) {
            return search(cities, index + 1, hit + 1, miss);
        }

        return search(cities, index +1, hit, miss + 1);
    }

    private int getProcessTime(int hit, int miss) {
        return hit * 1 + miss * 5;
    }
}
