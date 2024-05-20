import java.util.*

class Solution {
    //[1, 1, 1, 2, 2, 3], 2 => [1, 2]
    //[1], 1 => [1]
    //[1, 1, 1], 1 => [1]
    //[1, 3, 3], 1 => [3]
    //PriorityQueue.offer()
    //PriorityQueue.poll()
    //Record(number, occurrence)
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val records = nums.fold(mutableMapOf<Int, Int>()) { numbers, number ->
            numbers.compute(number) { key, value -> (numbers[number] ?: 0) + 1 }
            numbers
        }.entries.fold(PriorityQueue<Record>()) { records, (number, occurrence) ->
            records.offer(
                Record(
                    number = number,
                    occurrence = occurrence
                )
            )

            records
        }

        return (1..k).map { records.poll().number }.toIntArray()
    }
}

data class Record(
    val number: Int,
    var occurrence: Int,
): Comparable<Record> {
    override fun compareTo(other: Record): Int {
        if (this.occurrence < other.occurrence) {
            return 1
        }

        if (this.occurrence > other.occurrence) {
            return -1
        }

        return 0
    }
}
