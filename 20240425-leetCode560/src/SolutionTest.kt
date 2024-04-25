
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun subArraySum() {
        val result1 = solution.subarraySum(intArrayOf(1, 1, 1), 2)
        assertEquals(2, result1)

        val result2 = solution.subarraySum(intArrayOf(1), 1)
        assertEquals(1, result2)

        val result3 = solution.subarraySum(intArrayOf(1), 0)
        assertEquals(0, result3)

        val result4 = solution.subarraySum(intArrayOf(-1, -1, 1), 0)
        assertEquals(1, result4)

        val result5 = solution.subarraySum(intArrayOf(1, -1, 0), 0)
        assertEquals(3, result5)
    }

    @Test
    fun canEqualToK() {
        assertEquals(2, solution.canEqualToK(intArrayOf(1, -1, 0), 0, 0))
        assertEquals(0, solution.canEqualToK(intArrayOf(1, -1, 0), 0, 1))
        assertEquals(1, solution.canEqualToK(intArrayOf(1, -1, 0), 0, 2))
    }
}

class Solution() {

    fun subarraySum(intArray: IntArray, k: Int): Int {
        var result = 0
        var current = 0

        while (current < intArray.size) {
            result += canEqualToK(intArray, k, current)

            current += 1
        }

        return result
    }

    fun canEqualToK(intArray: IntArray, k: Int, current: Int, sum: Int = 0, equals: Int = 0): Int {
        if (current > intArray.lastIndex) {
            return equals
        }

        val added = sum + intArray[current]

        if (added == k) {
            return canEqualToK(intArray, k, current + 1, added, equals + 1)
        }

        return canEqualToK(intArray, k, current + 1, added, equals)
    }
}
