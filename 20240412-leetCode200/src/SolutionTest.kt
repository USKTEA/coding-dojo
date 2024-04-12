import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun grid1() {
        val grid = arrayOf(
            charArrayOf('1', '1', '1', '1', '0'),
            charArrayOf('1', '1', '0', '1', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0'),
        )

        assertEquals(1, solution.numIslands(grid))
    }

    @Test
    fun grid2() {
        val grid = arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '1', '0', '0'),
            charArrayOf('0', '0', '0', '1', '1'),
        )

        assertEquals(3, solution.numIslands(grid))
    }

    @Test
    fun grid3() {
        val grid = arrayOf(
            charArrayOf('1', '1', '1'),
            charArrayOf('0', '1', '0'),
            charArrayOf('1', '1', '1')
        )

        assertEquals(1, solution.numIslands(grid))
    }

    @Test
    fun grid4() {
        val grid = arrayOf(
            charArrayOf('1', '0', '1', '1', '0', '1', '1')
        )

        assertEquals(3, solution.numIslands(grid))
    }

    @Test
    fun getIsland() {
        val fields = mutableListOf(
            mutableListOf(Field('1', 0, 0), Field('1', 1, 0), Field('1', 2, 0)),
            mutableListOf(Field('0', 0, 1), Field('1', 1, 1), Field('0', 2, 1)),
            mutableListOf(Field('1', 0, 2), Field('1', 1, 2), Field('1', 2, 2)),
        )

        val island = solution.getIsland(0, 0, fields)

        assertEquals(7, island.size)
        assertEquals(true, fields[0][0].traversed)
    }
}
