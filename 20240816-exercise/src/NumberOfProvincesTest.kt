import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberOfProvincesTest {
    private val numberOfProvinces = NumberOfProvinces()

    @Test
    fun findCircleNum() {
        val result = numberOfProvinces.findCircleNum(
            arrayOf(
                intArrayOf(1, 1, 0),
                intArrayOf(1, 1, 0),
                intArrayOf(0, 0, 1),
            )
        )

        assertEquals(2, result)
    }
}
