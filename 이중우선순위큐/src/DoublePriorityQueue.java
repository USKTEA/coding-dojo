import java.util.Comparator;
import java.util.PriorityQueue;

public class DoublePriorityQueue {
    private PriorityQueue<Integer> naturalOrder;
    private PriorityQueue<Integer> reverseOrder;

    public DoublePriorityQueue() {
        this.naturalOrder = new PriorityQueue<>(Comparator.naturalOrder());
        this.reverseOrder = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void add(int number) {
        this.naturalOrder.add(number);
        this.reverseOrder.add(number);
    }

    public void removeBiggest() {
        naturalOrder.remove(reverseOrder.poll());
    }

    public void removeSmallest() {
        reverseOrder.remove(naturalOrder.poll());
    }

    public int size() {
        return naturalOrder.size();
    }

    public int smallest() {
        return naturalOrder.poll();
    }

    public int biggest() {
        return reverseOrder.poll();
    }
}
