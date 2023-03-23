import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int[] order) {
        IntSequence containerBelt = IntSequence.of(order.length);
        Stack<Integer> subContainerBelt = new Stack<>();
        Queue<Integer> orderQueue = new LinkedList<>(Arrays.stream(order).boxed().collect(Collectors.toList()));

        while (!orderQueue.isEmpty()) {
            int box = containerBelt.checkNext();

            if (orderQueue.peek() == box) {
                containerBelt.next();
                orderQueue.poll();

                continue;
            }

            while (!subContainerBelt.isEmpty() && orderQueue.peek() == subContainerBelt.peek()) {
                orderQueue.poll();
                subContainerBelt.pop();
            }

            if (!orderQueue.isEmpty() && box > orderQueue.peek() && subContainerBelt.peek() > orderQueue.peek()) {
                break;
            }

            containerBelt.next();
            subContainerBelt.push(box);
        }

        return order.length - orderQueue.size();
    }
}
