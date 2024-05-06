import java.util.*

class Solution {
    //[5, 5, 4], 1 => 1
    //[4, 3, 1, 1, 3, 3, 2], 3 => 2
    //val treeMap = TreeMap()
    //arr.forEach( arr.merge() )
    //treeMap.peek()
    //treeMap.poll()
    fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
        val map = toMap(arr)
        val treeMap = TreeMap<Int, MutableList<Int>>()

        for ((value, count) in map) {
            treeMap.merge(count, mutableListOf(value)) { list1, list2 ->
                list1.addAll(list2)
                list1
            }
        }

        var toDelete = k

        while (toDelete > 0) {
            val (count, numbers) = treeMap.firstEntry()
            if (toDelete - numbers.size * count >= 0) {
                toDelete -= numbers.size * count
                treeMap.remove(count)

                continue
            }

            val shouldDelete = toDelete / count
            treeMap[count] = numbers.slice(0..numbers.lastIndex - shouldDelete).toMutableList()
            toDelete = 0
        }

        return treeMap.values.fold(0) { acc: Int, numbers: MutableList<Int> ->
            acc + numbers.size
        }
    }

    fun toMap(arr: IntArray): MutableMap<Int, Int> {
        val map = mutableMapOf<Int, Int>()

        for (number in arr) {
            val value = map.getOrDefault(number, 0)
            map[number] = value + 1
        }

        return map
    }
}
