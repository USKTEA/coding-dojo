class Solution {
    //[0] => [1]
    //[0, 0] => [1]
    //[1, 2] => [1, 3]
    //[9] => [1, 0]
    //[1, 9] => [2, 0]
    //reverse, i + 1, if (array[i] + 1) > 10 , carry = 1, array[i+1] = array[i + 1] + carry
    fun plusOne(numbers: ArrayList<Int>): ArrayList<Int> {
        val result = MutableList(numbers.size) { 0 }
        var toAdd = 1

        for (i: Int in numbers.size - 1 downTo 0 step 1) {
            val added = numbers[i] + toAdd

            if (added == 10) {
                result[i] = 0

                continue
            }

            result[i] = added
            toAdd = 0
        }

        if (toAdd == 1) {
            result.add(0, 1)
        }

        while (result.first() == 0) {
            result.removeFirst()
        }

        return ArrayList(result.toList())
    }
}
