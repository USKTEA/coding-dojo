class Solution {
    //비디오 길이, pos, opStart, opEnd는 분초를 나타내는 mm:ss 문자열로 들어온다
    //prev commands는 현재 동영상 재생시간을 -10초, next는 +10초 한다
    //현재 위치가 10초 미만일 때 prev 명령이 들어오면 처음 위치로, 동영상 남은 시간이 10초 미만이면 동영상 마지막 위치로 이동한다 (00:00), (videoLength)
    //commands는 선입선출이다
    //opStart <= pos <= opEnd라면 pos는 opEnd로 이동한다
    fun solution(videoLength: String, pos: String, opStart: String, opEnd: String, commands: Array<String>): String {
        val parsedVideoLength = MinuteSecond.fromString(videoLength)
        val parsedPos = MinuteSecond.fromString(pos)
        val parsedOpStart = MinuteSecond.fromString(opStart)
        val parsedOpEnd = MinuteSecond.fromString(opEnd)

        val video = Video(
            length = parsedVideoLength,
            opStart = parsedOpStart,
            opEnd = parsedOpEnd,
        )

        val player = VideoPlayer(
            video = video,
            current = parsedPos,
        )

        commands.fold(player) { player, command ->
            player.command(command)
            player
        }

        val current = player.current()

        return current.toString()
    }
}

data class VideoPlayer(
    private val video: Video,
    private var current: MinuteSecond,
    private val commands: MutableList<String> = mutableListOf(),
) {
    init {
        adjustTime()
    }

    fun current(): MinuteSecond {
        return current
    }

    fun command(command: String) {
        commands.add(command)

        if (command == "prev") {
            current -= MinuteSecond(0, 10)
        }

        if (command == "next") {
            current += MinuteSecond(0, 10)

            if (current > video.length) {
                current = video.length
            }
        }

        adjustTime()
    }

    private fun adjustTime() {
        if (video.checkIsOpening(current)) {
            current = video.opEnd
        }
    }
}

data class Video(
    val length: MinuteSecond,
    val opStart: MinuteSecond,
    val opEnd: MinuteSecond,
) {
    fun checkIsOpening(current: MinuteSecond): Boolean {
        return current in opStart..opEnd
    }
}

data class MinuteSecond(
    private val minute: Int,
    private val second: Int,
) : Comparable<MinuteSecond> {
    override operator fun compareTo(other: MinuteSecond): Int {
        if (this.minute != other.minute) {
            return this.minute - other.minute
        }

        return this.second - other.second
    }

    operator fun minus(other: MinuteSecond): MinuteSecond {
        if (this.minute < other.minute) {
            return MinuteSecond(0, 0)
        }

        if (this.second < other.second) {
            if (this.minute >= 1) {
                return MinuteSecond(this.minute - 1, 60 - other.second + this.second)
            }

            return MinuteSecond(0, 0)
        }

        return MinuteSecond(this.minute - other.minute, this.second - other.second)
    }

    operator fun plus(other: MinuteSecond): MinuteSecond {
        val secondsAdded = this.second + other.second
        if (secondsAdded >= 60) {
            val minute = secondsAdded / 60
            val second = secondsAdded % 60

            return MinuteSecond(this.minute + other.minute + minute, second)
        }
        return MinuteSecond(this.minute + other.minute, this.second + other.second)
    }

    override fun toString(): String {
        return String.format("%02d:%02d", minute, second)
    }

    companion object {
        fun fromString(string: String): MinuteSecond {
            val (minute, second) = string.split(":")

            return MinuteSecond(
                minute = minute.toInt(), second = second.toInt()
            )
        }
    }
}
