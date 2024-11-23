import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun cntBits() {
        val result = solution.cntBits(arrayListOf(1, 3, 5))

        assertEquals(8, result)
    }

    @Test
    fun toPairs() {
        val pairs = solution.toPairs(arrayListOf(1, 2, 3))

        assertEquals(
            listOf(
                Pair(1, 1),
                Pair(1, 2),
                Pair(1, 3),
                Pair(2, 1),
                Pair(2, 2),
                Pair(2, 3),
                Pair(3, 1),
                Pair(3, 2),
                Pair(3, 3),
            ), pairs)
    }

    @Test
    fun countDifferentBits() {
        val count = solution.countDifferentBits(Pair(1, 1))

        assertEquals(0, count)
    }

    @Test
    fun countDifferentBits_1() {
        val count = solution.countDifferentBits(Pair(1, 2))

        assertEquals(2, count)
    }

    //1
    //11
    @Test
    fun countDifferentBits_2() {
        val count = solution.countDifferentBits(Pair(1, 3))

        assertEquals(1, count)
    }

    @Test
    fun countDifferentBits_3() {
        val count = solution.countDifferentBits(Pair(1, 3))

        assertEquals(1, count)
    }

    @Test
    fun countDifferentBits_4() {
        val count = solution.countDifferentBits(Pair(1, 5))

        assertEquals(1, count)
    }

    @Test
    fun toBinary() {
        val binary = solution.toBinary(1)

        assertEquals("1", binary)
    }

    @Test
    fun toBinary_2() {
        val binary = solution.toBinary(2)

        assertEquals("10", binary)
    }

    @Test
    fun toBinary_3() {
        val binary = solution.toBinary(3)

        assertEquals("11", binary)
    }

    @Test
    fun toBinary_4() {
        val binary = solution.toBinary(4)

        assertEquals("100", binary)
    }


    @Test
    fun toBinary_5() {
        val binary = solution.toBinary(5)

        assertEquals("101", binary)
    }

    @Test
    fun toBinary_6() {
        val binary = solution.toBinary(6)

        assertEquals("110", binary)
    }

    @Test
    fun toBinary_7() {
        val binary = solution.toBinary(7)

        assertEquals("111", binary)
    }

    @Test
    fun toBinary_8() {
        val binary = solution.toBinary(8)

        assertEquals("1000", binary)
    }

    @Test
    fun slice() {
        val sliced = solution.slice("11", "11")

        assertEquals(
            Triple("11", "11", 0)
            , sliced)
    }

    @Test
    fun slice_2() {
        val sliced = solution.slice("111", "11")

        assertEquals(
            Triple("11", "11", 1)
            , sliced)
    }

    @Test
    fun slice_3() {
        val sliced = solution.slice("11", "111")

        assertEquals(
            Triple("11", "11", 1)
            , sliced)
    }

    @Test
    fun slice_4() {
        val sliced = solution.slice("11", "1111")

        assertEquals(
            Triple("11", "11", 2)
            , sliced)
    }

    @Test
    fun slice_5() {
        val sliced = solution.slice("1111", "11")

        assertEquals(
            Triple("11", "11", 2)
            , sliced)
    }
}
