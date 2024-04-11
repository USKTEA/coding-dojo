import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun simpleTestCase() {
        val intervals = arrayOf(intArrayOf(1, 2))

        val result = solution.merge(intervals)

        assertArrayEquals(arrayOf(intArrayOf(1, 2)), result)
    }

    @Test
    fun complexTestCase1() {
        val intervals = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))

        val result = solution.merge(intervals)

        assertArrayEquals(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), result)
    }

    @Test
    fun complexTestCase2() {
        val intervals = arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))

        val result = solution.merge(intervals)

        assertArrayEquals(arrayOf(intArrayOf(1, 5)), result)
    }

    @Test
    //[[1, 3], [2, 6], [8, 10], [15, 18]] => [[1, 6], [8, 10], [15, 18]]
    fun complexTestCase3() {
        val intervals = arrayOf(
            intArrayOf(1, 3),
            intArrayOf(2, 6),
            intArrayOf(8, 10),
            intArrayOf(15, 18),
        )

        val result = solution.merge(intervals)

        assertArrayEquals(
            arrayOf(
                intArrayOf(1, 6),
                intArrayOf(8, 10),
                intArrayOf(15, 18),
            ), result
        )
    }

    @Test
    fun toNode() {
        val interval = intArrayOf(1, 2)

        val node = solution.toNode(interval)

        assertEquals(Node(start = 1, end = 2), node)
    }

    @Test
    fun sortNode() {
        val nodes = listOf(Node(2, 3), Node(1, 2), Node(4, 6))
        val sorted = solution.sort(nodes)

        assertEquals(listOf(Node(1, 2), Node(2, 3), Node(4, 6)), sorted)
    }
}
