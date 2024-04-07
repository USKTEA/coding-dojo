class Solution {
    //[3, 2, 3] => 3
    //[2, 2, 1, 1, 1, 2, 2] => 2
    //[1] => 1
    //[1, 1] => 1
    //[1, 1, 2, 2] => x
    //Count(mutableMap(int, Record), Record(number, count)))

    fun majorityElement(nums: IntArray): Int {
        return nums.fold(
            Pair(
                mutableMapOf(),
                Record(0, 0)
            )
        ) { (map, record): Pair<MutableMap<Int, Int>, Record>, number: Int ->
            val count = map.getOrDefault(number, 0) + 1
            map[number] = count

            if (record.number == number) {
                record.count = count
            }

            if (count > record.count) {
                return@fold Pair(map, Record(number, count))
            }

            Pair(map, record)
        }.second.number
    }
}

data class Record(
    var number: Int,
    var count: Int,
)
