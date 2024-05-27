import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val result = solution.perfectPeak(arrayListOf(1, 2, 3))

        assertEquals(1, result)
    }

    @Test
    fun test_case_2() {
        val result = solution.perfectPeak(arrayListOf(5, 1, 4, 3, 6, 8, 10, 7, 9))

        assertEquals(1, result)
    }

    @Test
    fun test_case_3() {
        val result = solution.perfectPeak(arrayListOf(5, 1, 4, 4))

        assertEquals(0, result)
    }

    @Test
    fun test_case_4() {
        val result = solution.perfectPeak(
            arrayListOf(
                5706,
                26963,
                24465,
                29359,
                16828,
                26501,
                28146,
                18468,
                9962,
                2996,
                492,
                11479,
                23282,
                19170,
                15725,
                6335
            )
        )

        assertEquals(0, result)
    }

    @Test
    fun test_cae_5() {
        val result = solution.perfectPeak(
            arrayListOf(
                9488,
                25784,
                5652,
                9861,
                31311,
                8611,
                1671,
                7129,
                28183,
                2743,
                11059,
                4473,
                7927,
                21287,
                2259,
                7214,
                32529,
            )
        )

        assertEquals(0, result)
    }

    @Test
    fun test_cae_6() {
        val result = solution.perfectPeak(
            arrayListOf(
                1, 2, 3, 4, 5, 4, 3, 2, 3, 10
            )
        )

        assertEquals(0, result)
    }
}
