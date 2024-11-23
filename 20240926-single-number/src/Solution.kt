class Solution {
    fun singleNumber(numbers: List<Int>): Int {
        var current = 0

        for (num in numbers) {
            current = current xor num
        }

        return current
    }

    fun singleNumberThrice(numbers: List<Int>): Int {
        var result = 0

        repeat(32) {
            var sum = 0

            for (num in numbers) {
                if (num and (1 shl it) != 0) {
                    sum += 1
                }
            }

            if (sum % 3 != 0) {
                result = result or (1 shl it)
            }
        }

        return result
    }
}
