class Solution {
    //[[1, 2]] => [[1, 2]]
    //[[1, 2], [3, 4]] = [[1, 2], [3, 4]]
    //[[1, 3], [2, 6], [8, 10], [15, 18]] => [[1, 6], [8, 10], [15, 18]]
    //[[1, 4], [4, 5]] => [[1, 5]]
    //toNode(intArray(1, 5)) => Node(start, end)
    //Node.sortBy {it.start}
    //Nodes.fold(Node(0, 0)) { node.setNext }
    //node.setNext(Node(start, end))
    //if this.end >= node.start merge()
    //merge return Node(this.node.start, this.node.end = )
    //node.getResult()
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val nodes = intervals.map { interval -> toNode(interval) }
        val sorted = sort(nodes)
        val first = sorted.first()

        val merged = sorted.subList(1, sorted.lastIndex + 1).fold(mutableListOf(first)) { acc, node ->
            val last = acc.last()

            if (last.end >= node.start) {
                acc.removeLast()
                acc.add(last.merge(node))

                return@fold acc
            }

            acc.add(node)
            acc
        }

        return merged.map { it.toArray() }.toTypedArray()
    }

    fun sort(nodes: List<Node>): List<Node> {
        return nodes.sortedBy { it.start }
    }

    fun toNode(interval: IntArray): Node {
        return Node(start = interval[0], end = interval[1])
    }
}

data class Node(
    val start: Int,
    val end: Int,
    var previous: Node? = null,
    var next: Node? = null,
) {
    fun merge(other: Node): Node {
        if (other.end > this.end) {
            return Node(this.start, other.end)
        }

        return Node(this.start, this.end)
    }

    fun toArray(): IntArray {
        return intArrayOf(start, end)
    }
}
