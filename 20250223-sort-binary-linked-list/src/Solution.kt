class Solution {
    //[1, 0, 0, 1] => [0, 0, 1, 1]
    //0과 1로만 이루어진 바이너리 링크드리스트가 주어졌을 때 0은 항상 1보다 먼저 나타나는 링크드리스트로 변환해 반환해라
    //추가 메모리는 상수만큼만 할당해야 한다
    //linkedList를 Head에 할당하고 next를 current로 지정한다
    //currentNode가 0일 경우 다음 노드로 넘어간다
    //currentNode가 1이라면 next가 null이 될 떄까지 반복해서 해당 노드를 다음으로 지정한다
    //이때 1의 next는 previous의 next가 되어야 한다
    //이것을 currentNode가 null이 될 떄 까지 반복한다
    fun solve(linkedList: ListNode): ListNode {
        var zeroHead: ListNode? = null
        var zeroTail: ListNode? = null
        var oneHead: ListNode? = null
        var oneTail: ListNode? = null

        var current: ListNode? = linkedList

        while (current != null) {
            val next = current.next
            current.next = null
            val bit = current.`val`

            if (bit == 0) {
                if (zeroHead == null) {
                    zeroHead = current
                    zeroTail = current
                } else {
                    zeroTail?.next = current
                }

                current = next

                continue
            }

            if (bit == 1) {
                if (oneHead == null) {
                    oneHead = current
                    oneTail = current
                } else {
                    oneTail?.next = current
                }

                current = next

                continue
            }
        }

        if (oneHead == null) {
            return zeroHead!!
        }

        if (zeroHead == null) {
            return oneHead
        }

        zeroTail?.next = oneHead

        return zeroHead
    }
}

data class ListNode(var `val`: Int = 0, var next: ListNode? = null)
