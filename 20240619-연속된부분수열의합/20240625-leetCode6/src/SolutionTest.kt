import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun convert() {
        val result = solution.convert("P", 3)

        assertEquals("P", result)
    }

    @Test
    fun convert_2() {
        val result = solution.convert("PA", 3)

        assertEquals("PA", result)
    }

    @Test
    fun convert_3() {
        val result = solution.convert("PAYP", 3)

        assertEquals("PAPY", result)
    }

    @Test
    fun getMatrix() {
        val matrix = solution.getMatrix("PAYPALISHIRING", 3)

        assertArrayEquals(
            arrayOf(
                arrayOf("", "", "", "", "", "", ""),
                arrayOf("", "", "", "", "", "", ""),
                arrayOf("", "", "", "", "", "", "")
            ), matrix
        )
    }

    @Test
    fun getMatrix_1() {
        val matrix = solution.getMatrix("PAY", 3)

        assertArrayEquals(
            arrayOf(
                arrayOf(""),
                arrayOf(""),
                arrayOf("")
            ), matrix
        )
    }

    @Test
    fun getMatrix_2() {
        val matrix = solution.getMatrix("PAYP", 3)

        println(matrix.toList().map { it.toList() })
        assertArrayEquals(
            arrayOf(
                arrayOf("", ""),
                arrayOf("", ""),
                arrayOf("", "")
            ), matrix
        )
    }

    @Test
    fun getMatrix_3() {
        val matrix = solution.getMatrix("PAYPA", 3)

        assertArrayEquals(
            arrayOf(
                arrayOf("", "", ""),
                arrayOf("", "", ""),
                arrayOf("", "", "")
            ), matrix
        )
    }

    @Test
    fun getMatrix_4() {
        val matrix = solution.getMatrix("PAYPAL", 3)

        println(matrix.toList().map { it.toList() })
        assertArrayEquals(
            arrayOf(
                arrayOf("", "", ""),
                arrayOf("", "", ""),
                arrayOf("", "", "")
            ), matrix
        )
    }

    @Test
    fun getMatrix_5() {
        val matrix = solution.getMatrix("PAYPALI", 3)

        assertArrayEquals(
            arrayOf(
                arrayOf("", "", ""),
                arrayOf("", "", ""),
                arrayOf("", "", "")
            ), matrix
        )
    }

    @Test
    fun getMatrix_6() {
        val matrix = solution.getMatrix("PAYPALISHIRINGABCDEF", 3)

        println(matrix.toList().map { it.toList() })
        assertArrayEquals(
            arrayOf(
                arrayOf("", "", "", "", "", "", "", "", "", ""),
                arrayOf("", "", "", "", "", "", "", "", "", ""),
                arrayOf("", "", "", "", "", "", "", "", "", ""),
            ), matrix
        )
    }

    @Test
    fun getMatrix_7() {
        val matrix = solution.getMatrix("PAYP", 4)

        println(matrix.toList().map { it.toList() })
        assertArrayEquals(
            arrayOf(
                arrayOf(""),
                arrayOf(""),
                arrayOf(""),
                arrayOf(""),
            ), matrix
        )
    }

    @Test
    fun getMatrix_8() {
        val matrix = solution.getMatrix("PAYPA", 4)

        println(matrix.toList().map { it.toList() })
        assertArrayEquals(
            arrayOf(
                arrayOf("", ""),
                arrayOf("", ""),
                arrayOf("", ""),
                arrayOf("", ""),
            ), matrix
        )
    }

    @Test
    fun getMatrix_9() {
        val matrix = solution.getMatrix("PAYPAL", 4)

        println(matrix.toList().map { it.toList() })
        assertArrayEquals(
            arrayOf(
                arrayOf("", "", ""),
                arrayOf("", "", ""),
                arrayOf("", "", ""),
                arrayOf("", "", ""),
            ), matrix
        )
    }

    @Test
    fun getMatrix_10() {
        val matrix = solution.getMatrix("PAYPALISH", 4)

        println(matrix.toList().map { it.toList() })
        assertArrayEquals(
            arrayOf(
                arrayOf("", "", "", ""),
                arrayOf("", "", "", ""),
                arrayOf("", "", "", ""),
                arrayOf("", "", "", ""),
            ), matrix
        )
    }

    @Test
    fun getMatrix_11() {
        val matrix = solution.getMatrix("PAYPALISHI", 4)

        println(matrix.toList().map { it.toList() })
        assertArrayEquals(
            arrayOf(
                arrayOf("", "", "", ""),
                arrayOf("", "", "", ""),
                arrayOf("", "", "", ""),
                arrayOf("", "", "", ""),
            ), matrix
        )
    }
}
