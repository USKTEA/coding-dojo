public class Flogjmp {

    public int distance(int x, int y) {
        return y - x;
    }

    public long jump(int distance, int jumpDistance) {
        long time = distance / jumpDistance;

        if (distance % jumpDistance == 0) {
            return time;
        }

        return time + 1;
    }
}
