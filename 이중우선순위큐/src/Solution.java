public class Solution {
    public int[] solution(String[] operations) {
        DoublePriorityQueue doublePriorityQueue = new DoublePriorityQueue();

        for (String operation : operations) {
            char action = operation.charAt(0);
            int number = toNumber(operation.substring(2));

            if (action == 'I') {
                doublePriorityQueue.add(number);
            }

            if (action == 'D') {
                if (number > 0) {
                    doublePriorityQueue.removeBiggest();
                }

                if (number < 0) {
                    doublePriorityQueue.removeSmallest();
                }
            }
        }

        if (doublePriorityQueue.size() == 0) {
            return new int[]{0, 0};
        }

        return new int[]{doublePriorityQueue.biggest(), doublePriorityQueue.smallest()};
    }

    public int toNumber(String word) {
        if (word.charAt(0) == '-') {
            return Integer.parseInt(word.substring(1)) * -1;
        }

        return Integer.parseInt(word);
    }
}
