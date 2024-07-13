import java.lang.Math.pow

class Solution {
    //[1, 0] => [0, 1]
    //[0, 2, 1, 3] => [0, 1, 2, 3]
    fun arrange(numbers: ArrayList<Int>) {
        val bucket = bucket(numbers.size) //[0, 0]
        var index = 0

        var sum = 1

        println(bucket.toList())

        for (i: Int in numbers.indices) {
            bucket[i] = numbers[numbers[i]]
            sum *= numbers[i] * (i + 1)
        }

        println(sum)

        for (i: Int in bucket.indices) {
            numbers[index] = bucket[i]
            index += 1
        }
    }

    private fun bucket(size: Int): ArrayList<Int> {
        return ArrayList(Array(size) { 0 }.toList())
    }
}
