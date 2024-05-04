import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val rooms = solution.minMeetingRooms(arrayOf(intArrayOf(0, 1)))
        assertEquals(1, rooms)
    }

    @Test
    fun test_case_2() {
        val rooms = solution.minMeetingRooms(arrayOf(intArrayOf(0, 1), intArrayOf(1, 2)))
        assertEquals(1, rooms)
    }

    @Test
    fun test_case_3() {
        val rooms = solution.minMeetingRooms(arrayOf(
            intArrayOf(0, 30),
            intArrayOf(5, 10),
            intArrayOf(15, 20),
        ))

        assertEquals(2, rooms)
    }

    @Test
    fun test_case_4() {
        val rooms = solution.minMeetingRooms(arrayOf(
            intArrayOf(7, 10),
            intArrayOf(2, 4),
        ))

        assertEquals(1, rooms)
    }

    @Test
    fun test_case_5() {
        val rooms = solution.minMeetingRooms(arrayOf(
            intArrayOf(5, 8),
            intArrayOf(6, 8),
        ))

        assertEquals(2, rooms)
    }

    @Test
    fun test_case_6() {
        val rooms = solution.minMeetingRooms(arrayOf(
            intArrayOf(9, 14),
            intArrayOf(5, 6),
            intArrayOf(3, 5),
            intArrayOf(12, 19),
        ))

        assertEquals(2, rooms)
    }
}
