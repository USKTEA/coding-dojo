import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun merge_easy() {
        val numbers = arrayListOf(1)
        val otherNumbers = arrayListOf(1)

        solution.merge(numbers, otherNumbers)

        assertEquals(arrayListOf(1, 1), numbers)
    }


    @Test
    fun merge_easy_1() {
        val numbers = arrayListOf(1, 2)
        val otherNumbers = arrayListOf(1)

        solution.merge(numbers, otherNumbers)

        assertEquals(arrayListOf(1, 1, 2), numbers)
    }

    @Test
    fun merge_easy_2() {
        val numbers = arrayListOf(1, 2, 3)
        val otherNumbers = arrayListOf(1)

        solution.merge(numbers, otherNumbers)

        assertEquals(arrayListOf(1, 1, 2, 3), numbers)
    }

    @Test
    fun merge_easy_3() {
        val numbers = arrayListOf(1, 2, 3)
        val otherNumbers = arrayListOf(1, 2)

        solution.merge(numbers, otherNumbers)

        assertEquals(arrayListOf(1, 1, 2, 2, 3), numbers)
    }

    @Test
    fun merge_easy_4() {
        val numbers = arrayListOf(1, 2, 3)
        val otherNumbers = arrayListOf(1, 2, 7)

        solution.merge(numbers, otherNumbers)

        assertEquals(arrayListOf(1, 1, 2, 2, 3, 7), numbers)
    }

    @Test
    fun merge() {
        val numbers = arrayListOf(1, 5, 8)
        val otherNumbers = arrayListOf(6, 9)

        solution.merge(numbers, otherNumbers)

        assertEquals(arrayListOf(1, 5, 6, 8, 9), numbers)
    }

    @Test
    fun merge_2() {
        val numbers = arrayListOf(1, 1, 1, 2, 2)
        val otherNumbers = arrayListOf(6, 9, 10, 11, 12, 13, 14)

        solution.merge(numbers, otherNumbers)
    }
}
