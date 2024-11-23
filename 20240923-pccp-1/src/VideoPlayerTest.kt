import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class VideoPlayerTest {
    private val video = Video(
        length = MinuteSecond(minute = 10, second = 10),
        opStart = MinuteSecond(minute = 0, second = 0),
        opEnd = MinuteSecond(minute = 0, second = 20)
    )

    @Test
    fun when_current_between_op_start_and_op_end_current_will_move_to_op_end() {
        val player = VideoPlayer(
            video = video,
            current = MinuteSecond(
                minute = 0, second = 5
            ),
        )

        assertEquals(video.opEnd, player.current())
    }

    @Test
    fun command() {
        val player = VideoPlayer(
            video = video,
            current = MinuteSecond(
                minute = 0, second = 30
            ),
        )

        assertEquals(MinuteSecond(0, 30), player.current())

        player.command("prev")

        assertEquals(MinuteSecond(0, 20), player.current())
    }
}
