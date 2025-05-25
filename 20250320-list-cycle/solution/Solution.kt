class Solution {
    //1 -> 2 -> 3 <-> 4
    //
    //[1, 2, 3, 4, 3] => 3

    //1, 1
    //2, 3
    //3, 5
    //4, 3
    //5, 5
    //3, 3
    //[1, 2, 3, 4, 5, 3] => 3


    //1, 1
    //2, 3
    //3, 5
    //4, 2
    //5, 4
    //6, 6
    //2, 2
    //[1, 2, 3, 4, 5, 6, 2] => 2


    //1, 1
    //2, 1
    //1, 1
    //[1, 2]

    //1, 1
    //2, 3
    //3, 2
    //1, 1
    //[1, 2, 3, 1]
    fun detectCycle(head: ListNode): ListNode? {
        var slow: ListNode? = head
        var fast: ListNode? = head

        // 1. 사이클 검출
        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
            if (slow == fast) { // 사이클 내에서 만남
                break
            }
        }

        if (fast?.next == null) {
            return null
        }

        // 2. 사이클 시작점 찾기
        slow = head
        while (slow != fast) {
            slow = slow?.next
            fast = fast?.next
        }

        return slow
    }
}

data class ListNode(val `val`: Int, var next: ListNode? = null)
