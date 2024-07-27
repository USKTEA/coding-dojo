class Solution {
    //123 -> 321
    //-123 -> -321
    fun reverse(number: Int): Int {
        val char = number.toString().toCharArray()
        val isNegative = char[0] == '-'

        if (isNegative) {
            val sliced = char.slice(1..char.lastIndex)
            val reversed = sliced.reversed().joinToString("").toLong()

            if (reversed * -1 < Int.MIN_VALUE) {
                return 0
            }

            return reversed.toInt() * -1
        }

        val reversed = char.reversed().joinToString("").toLong()

        if (reversed > Int.MAX_VALUE) {
            return 0
        }

        return reversed.toInt()
    }

    fun reverse2(number: Int): Int {
        val minValue = Int.MIN_VALUE.toString()
        val maxValue = Int.MAX_VALUE.toString()

        val reversed = number.toString().reversed()
        val isNegative = reversed[reversed.lastIndex] == '-'

        if (isNegative) {
            val sliced = reversed.slice(0..<reversed.lastIndex)
            val slicedMinValue = minValue.slice(0..<minValue.lastIndex)

            if (slicedMinValue.length == sliced.length) {
                reversed.forEachIndexed { index, char ->
                    if (char > minValue[index]) {
                        return 0
                    }
                }
            }

            return sliced.toInt() * -1
        }

        if (maxValue.length == reversed.length) {
            reversed.forEachIndexed { index, char ->
                if (char > minValue[index]) {
                    return 0
                }
            }
        }

        return reversed.toInt()
    }
}
