import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun search() {
        val result = solution.search(listOf(4, 5, 6, 7, 0, 1, 2, 3), 4)

        assertEquals(0, result)
    }

    @Test
    fun search_1() {
        val result = solution.search(listOf(5, 17, 100, 3), 6)

        assertEquals(-1, result)
    }

    @Test
    fun search_2() {
        val result = solution.search(listOf(5, 6, 7, 8, 9, 0, 1, 2, 3), 6)

        assertEquals(1, result)
    }

    @Test
    fun search_3() {
        val result = solution.search(listOf(1, 7, 67, 133, 178), 1)

        assertEquals(0, result)
    }

    @Test
    fun search_4() {
        val result = solution.search(
            listOf(
                104070457,
                104071068,
                104078162,
                104078209,
                104079815,
                104079971,
                104081111,
                104081245,
                104082317,
                104084884,
                104086437,
                104087881,
                104088057,
                104090763,
                104090783,
                104091029,
                104091594,
                104092661,
                104093353,
                104096049,
                104096945,
                104097643,
                104099107,
                104100382,
                104101624,
                0,
                1,
                2,
                5972
            ), 5972
        )

        assertEquals(28, result)
    }

    @Test
    fun searchPivotIndex() {
        val pivotIndex = solution.searchPivotIndex(listOf(4, 1, 2))

        assertEquals(1, pivotIndex)
    }

    @Test
    fun searchPivotIndex_1() {
        val pivotIndex = solution.searchPivotIndex(listOf(4, 1, 2, 3))

        assertEquals(1, pivotIndex)
    }

    @Test
    fun searchPivotIndex_2() {
        val pivotIndex = solution.searchPivotIndex(listOf(4, 5, 1, 2, 3))

        assertEquals(2, pivotIndex)
    }

    @Test
    fun searchPivotIndex_3() {
        val pivotIndex = solution.searchPivotIndex(listOf(4, 5, 6, 7, 8, 19, 2))

        assertEquals(6, pivotIndex)
    }

    @Test
    fun searchNumber() {
        val reuslt = solution.searchNumber(listOf(1, 2, 3), 0, 2, 2)

        assertEquals(1, reuslt)
    }

    @Test
    fun searchNumber_1() {
        val reuslt = solution.searchNumber(listOf(1, 2, 3, 4), 0, 3, 2)

        assertEquals(1, reuslt)
    }
}
