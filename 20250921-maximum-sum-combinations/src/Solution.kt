import java.util.PriorityQueue

class Solution {
    fun solve(numbers: ArrayList<Int>, otherNumbers: ArrayList<Int>, maximumSize: Int): ArrayList<Int> {
        val sortedNumbers = numbers.sortedDescending()
        val otherSortedNumbers = otherNumbers.sortedDescending()

        val nodes = PriorityQueue<Node>()
        val visited = mutableSetOf<Pair<Int, Int>>()
        val result = arrayListOf<Int>()

        nodes.add(Node(sortedNumbers[0] + otherSortedNumbers[0], 0, 0))
        visited.add(Pair(0, 0))

        repeat(maximumSize) {
            val node = nodes.poll()
            result.add(node.value)

            val i = node.i
            val j = node.j

            if (i + 1 < numbers.size && !visited.contains(Pair(i + 1, j))) {
                nodes.add(Node(sortedNumbers[i + 1] + otherSortedNumbers[j], i + 1, j))
                visited.add(Pair(i + 1, j))
            }

            if (j + 1 < otherNumbers.size && !visited.contains(Pair(i, j + 1))) {
                nodes.add(Node(sortedNumbers[i] + otherSortedNumbers[j + 1], i, j + 1))
                visited.add(Pair(i, j + 1))
            }
        }

        return result
    }

    data class Node(val value: Int, val i: Int, val j: Int) : Comparable<Node> {
        override fun compareTo(other: Node): Int {
            return other.value.compareTo(value)
        }
    }
}
