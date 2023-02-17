import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (Objects.isNull(head)) {
            return null;
        }

        Set<ListNode> set = new HashSet<>();

        while (Objects.nonNull(head)) {
            if (set.contains(head)) {
                return head;
            }

            set.add(head);
            head = head.next;
        }

        return null;
    }
}
