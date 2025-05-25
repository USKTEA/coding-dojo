class Solution {
    //오름차순으로 정렬되어 있는 linkedList가 주어졌을 때 중복된 값이 있는 노드는 하나만 남기고 나머지는 제거하고 중복이 제거된 링크드리스트를 반환하는 문제
    //current, currentVal,
    //while(current != null)
    //var next = curent.next
    // nodeValue
    //while (curentValue == next.val) {next = next.val}

    fun deleteDuplicates(linkedList: ListNode): ListNode {
        var current: ListNode? = linkedList

        while (current != null) {
            val currentNodeValue = current.`val`
            var next = current.next
            while (currentNodeValue == next?.`val`) {
                next = next.next
            }

            current.next = next
            current = next
        }

        return linkedList
    }
}

data class ListNode(var `val`: Int = 0, var next: ListNode? = null)
