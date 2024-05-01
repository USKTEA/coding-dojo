import java.util.*

class Solution {
    fun findBuildings(heights: IntArray): IntArray {
        val treeSet = TreeSet<Building>()
        val result = mutableListOf<Int>()

        heights.forEachIndexed { index: Int, i: Int ->
            treeSet.add(Building(i, index))
        }

        for (i in heights.indices) {
            val building = Building(heights[i], i)
            treeSet.remove(building)

            if (treeSet.isEmpty() || building > treeSet.last()) {
                result.add(i)
            }
        }

        return result.toIntArray()
    }
}

class Building(
    val height: Int,
    val order: Int,
) : Comparable<Building> {
    override fun compareTo(other: Building): Int {
        if (this.height != other.height) {
            return this.height - other.height
        }

        return this.order - other.order
    }

    override fun toString(): String {
        return "B(height=$height, order=$order)"
    }
}
