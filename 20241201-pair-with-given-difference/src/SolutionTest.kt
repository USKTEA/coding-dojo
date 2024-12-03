import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(arrayListOf(5, 10, 3, 2, 50, 80), 78)

        assertEquals(1, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve(arrayListOf(-10, 20), 30)

        assertEquals(1, result)
    }

    @Test
    fun solve_3() {
        val result = solution.solve(arrayListOf(-259, -825, 459, 825, 221, 870, 626, 934, 205, 783, 850, 398), -42)

        assertEquals(1, result)
    }

    @Test
    fun solve_4() {
        val result = solution.solve(
            arrayListOf(
                90,
                497,
                -411,
                990,
                145,
                353,
                314,
                -349,
                -260,
                -956,
                258,
                -665,
                -241,
                192,
                605,
                264,
                -819,
                -497,
                829,
                775,
                -392,
                292,
                997,
                549,
                556,
                561,
                627,
                -533,
                541,
                -871,
                240,
                813,
                174,
                -399,
                -923,
                -785
            ), -466
        )

        assertEquals(1, result)
    }
}
