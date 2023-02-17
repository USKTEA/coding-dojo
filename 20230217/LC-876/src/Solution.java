import java.util.Objects;

class Solution {
    public ListNode middleNode(ListNode head) {
        int nodeSize = getSize(head);

        int middleIndex = getMiddleIndex(nodeSize);

        ListNode middleNode = getMiddle(head, middleIndex);
        
        return middleNode;
    }

    public int getSize(ListNode head) {
        int size = 0;

        while (Objects.nonNull(head.next)) {
            size += 1;
            head = head.next;
        }

        return size;
    }

    public int getMiddleIndex(int size) {
        if (size % 2 == 0) {
            return size / 2;
        }

        return size / 2 + 1;
    }

    public ListNode getMiddle(ListNode head, int middleIndex) {
        for (int i = 0; i < middleIndex; i += 1) {
            head = head.next;
        }

        return head;
    }
}
