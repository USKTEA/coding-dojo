import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MinuteSecondTest {
    @Test
    fun creation() {
        val minuteSecond = MinuteSecond.fromString(
            "34:33"
        )

        assertEquals(
            MinuteSecond(
                minute = 34,
                second = 33
            ), minuteSecond
        )
    }

    @Test
    fun compareTo() {
        val bigger = MinuteSecond(minute = 34, second = 33)
        val smaller = MinuteSecond(minute = 34, second = 32)

        assertEquals(true, bigger > smaller)
        assertEquals(false, bigger < smaller)

        val theBiggest = MinuteSecond(minute = 35, second = 33)

        assertEquals(true, theBiggest > bigger)
        assertEquals(true, theBiggest > smaller)

        val equalToSmaller = MinuteSecond(minute = 34, second = 32)

        assertEquals(true, smaller == equalToSmaller)
    }

    @Test
    fun minus_second() {
        val minuteSecond = MinuteSecond(10, 10)

        assertEquals(MinuteSecond(10, 9), minuteSecond - MinuteSecond(0, 1))
    }

    @Test
    fun minus_minute() {
        val minuteSecond = MinuteSecond(10, 10)

        assertEquals(MinuteSecond(9, 9), minuteSecond - MinuteSecond(1, 1))
    }

    @Test
    fun minus_second_2() {
        val minuteSecond = MinuteSecond(10, 9)

        assertEquals(MinuteSecond(9, 59), minuteSecond - MinuteSecond(0, 10))
    }

    @Test
    fun plus() {
        val minuteSecond = MinuteSecond(10, 10)

        assertEquals(MinuteSecond(11, 11), minuteSecond + MinuteSecond(1, 1))
    }

    @Test
    fun plus_2() {
        val minuteSecond = MinuteSecond(10, 10)

        assertEquals(MinuteSecond(12, 0), minuteSecond + MinuteSecond(1, 50))
    }

    @Test
    fun plus_3() {
        val minuteSecond = MinuteSecond(10, 50)

        assertEquals(MinuteSecond(12, 40), minuteSecond + MinuteSecond(1, 50))
    }

    @Test
    fun overidedToString() {
        val minuteSecond = MinuteSecond(10, 1)

        assertEquals("10:01", minuteSecond.toString())
    }
}
