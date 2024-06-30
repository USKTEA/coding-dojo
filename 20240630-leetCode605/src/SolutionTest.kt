import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun ccanPlaceFlowers_1() {
        val result = solution.canPlaceFlowers(intArrayOf(0), 1)

        assertTrue(result)
    }

    @Test
    fun canPlaceFlowers_2() {
        val result = solution.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 1)
        assertTrue(result)
    }

    @Test
    fun canPlaceFlowers_3() {
        val result = solution.canPlaceFlowers(intArrayOf(1, 0, 0, 0, 0, 1), 2)
        assertFalse(result)
    }

    @Test
    fun canPlaceFlowers_4() {
        val result = solution.canPlaceFlowers(intArrayOf(0, 0, 1, 0, 1), 1)
        assertTrue(result)
    }

    @Test
    fun mapBedInUse() {
        val flowerBed = solution.mapBedInUse(intArrayOf(0))

        assertArrayEquals(intArrayOf(0), flowerBed)
    }

    @Test
    fun mapBedInUse_2() {
        val flowerBed = solution.mapBedInUse(intArrayOf(1, 0, 0, 0, 1))

        assertArrayEquals(intArrayOf(1, 1, 0, 1, 1), flowerBed)
    }

    @Test
    fun mapBedInUse_3() {
        val flowerBed = solution.mapBedInUse(intArrayOf(0, 1, 0, 1, 0))

        assertArrayEquals(intArrayOf(1, 1, 1, 1, 1), flowerBed)
    }

    @Test
    fun plants() {
        val remains = solution.plants(intArrayOf(1, 1, 0, 1, 1), 1)

        assertEquals(0, remains)
    }

    @Test
    fun plants_2() {
        val remains = solution.plants(intArrayOf(1, 1, 0, 0, 1, 1), 2)

        assertEquals(1, remains)
    }
}
