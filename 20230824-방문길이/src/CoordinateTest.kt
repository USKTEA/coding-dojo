import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CoordinateTest {

    @Test
    fun checkIfOutOfBoundary() {
        val coordinate = Coordinate(5)
        val position1 = intArrayOf(0, 5)
        val position2 = intArrayOf(0, 6)
        val position3 = intArrayOf(6, 0)
        val position4 = intArrayOf(0, -6)
        val position5 = intArrayOf(-6, 0)

        val result1 = coordinate.checkIfOutOfBoundary(position1)

        assertFalse(result1)

        val result2 = coordinate.checkIfOutOfBoundary(position2)
        val result3 = coordinate.checkIfOutOfBoundary(position3)
        val result4 = coordinate.checkIfOutOfBoundary(position4)
        val result5 = coordinate.checkIfOutOfBoundary(position5)

        assertAll(
            "전부 벗어나지 않는다",
            { assertTrue(result2) },
            { assertTrue(result3) },
            { assertTrue(result4) },
            { assertTrue(result5) },
        )
    }
}
