import java.util.LinkedList;

public class Cache {
    private int size;
    private LinkedList<String> storage = new LinkedList<>();

    public Cache(int cacheSize) {
        this.size = cacheSize;
    }

    public boolean match(String city) {
        if (size == 0) {
            return false;
        }

        if (storage.contains(city)) {
            if (storage.size() == size) {
                storage.remove(storage.lastIndexOf(city));
                storage.addFirst(city);

                return true;
            }

            storage.addFirst(city);

            return true;
        }

        if (storage.size() == size) {
            storage.removeLast();
            storage.addFirst(city);

            return false;
        }

        storage.addFirst(city);

        return false;
    }
}
