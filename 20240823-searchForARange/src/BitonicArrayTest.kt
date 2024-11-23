import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BitonicArrayTest {
    private val bitonicArray = BitonicArray()

    @Test
    fun solve() {
        val result = bitonicArray.solve(
            arrayListOf(3, 9, 10, 20, 17, 5, 1), 20
        )

        assertEquals(3, result)
    }

    @Test
    fun solve_2() {
        val result = bitonicArray.solve(
            arrayListOf(5, 6, 7, 8, 9, 10, 3, 2, 1), 30
        )

        assertEquals(-1, result)
    }

    @Test
    fun searchPeakIndex() {
        val peakIndex = bitonicArray.searchPeakIndex(arrayListOf(3, 9, 10, 20, 17, 5, 1), 0, 6)

        assertEquals(3, peakIndex)
    }

    @Test
    fun searchPeakIndex_2() {
        val peakIndex = bitonicArray.searchPeakIndex(arrayListOf(3, 1), 0, 1)

        assertEquals(0, peakIndex)
    }

    @Test
    fun searchPeakIndex_3() {
        val peakIndex = bitonicArray.searchPeakIndex(arrayListOf(1, 3), 0, 1)

        assertEquals(1, peakIndex)
    }
}
