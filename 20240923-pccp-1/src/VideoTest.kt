import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class VideoTest {
    private val video = Video(
        length = MinuteSecond(minute = 10, second = 10),
        opStart = MinuteSecond(minute = 0, second = 0),
        opEnd = MinuteSecond(minute = 0, second = 10)
    )

    @Test
    fun checkIsOpening() {
        val current = MinuteSecond(
            minute = 0, second = 5
        )

        val current2 = MinuteSecond(
            minute = 0, second = 12
        )

        assertTrue(video.checkIsOpening(current))
        assertFalse(video.checkIsOpening(current2))
    }
}
