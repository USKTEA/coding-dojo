class Solution {
    fun singleNumber(number: List<Int>): Int {
        return number.reduce { result, number ->
            result xor number
        }
    }

    fun singleNumberThrice(numbers: List<Int>): Int {
        var result = 0

        repeat(32) { index ->
            val count = numbers.count { number ->
                (number and (1 shl index)) != 0
            }

            if (count % 3 != 0) {
                result = result or (1 shl index)
            }
        }

        return result
    }
}
