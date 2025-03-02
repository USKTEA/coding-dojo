

//오름차순으로 정렬되어 있는 링크드리스트가 들어왔을 떄 내림차순으로 정렬시켜 반환해라.
//현재노드는 linkedList
//현재노드가 null일 때 까지 반복한다
//
//while (current != null) {
//
// }
//cuurrent 의 previous를 current.next의 next로 할당하고
//curren를 current.next로 할당하면 되나
//[1, 2, 3, null] => [3. 2, 1, null]
//[2, 1, 3, null]
//[3, 2, 1, null]
class Solution {
    fun reverseList(linkedList: ListNode): ListNode {
        var previous: ListNode? = null
        var current: ListNode? = linkedList
        var temp: ListNode? = null
        while (current != null) {
            temp = current.next

            current.next = previous
            previous = current
            current = temp
        }

        return previous!!
    }
}

data class ListNode(
    var `val`: Int = 0,
    var next: ListNode? = null
)
