class Solution {
    //0, 0 => 0
    //1, 0 => 1
    //1, 1 => 10
    //10, 1 => 11
    //10, 10 => 100
    //11, 1 => 100
    //1010, 1011 => 10101
    fun addBinary(a: String, b: String): String {
        return add(a.reversed(), b.reversed())
    }

    fun add(a: String, b: String, index: Int = 0, carry: Int = 0, result: MutableList<Int> = mutableListOf()): String {
        var aCurrent = 0
        var bCurrent = 0

        if (index >= a.length && index >= b.length) {
            val sum = result.fold("") { acc, i ->
                acc + i
            }

            if (carry == 0) {
                return sum.reversed()
            }

            return carry.toString() + sum.reversed()
        }

        if (index <= a.length - 1) {
            aCurrent = a[index].toString().toInt()
        }

        if (index <= b.length - 1) {
            bCurrent = b[index].toString().toInt()
        }

        var toAdd = aCurrent + bCurrent + carry

        if (toAdd > 1) {
            toAdd %= 2

            result.add(toAdd)

            return add(a, b, index + 1, 1, result)
        }

        result.add(toAdd)

        return add(a, b, index + 1, 0, result)
    }
}
