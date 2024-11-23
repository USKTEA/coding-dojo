class Solution {
    fun restoreIpAddresses(letters: String): ArrayList<String> {
        val restoredIpAddresses = buildList {
            restore(
                letters = letters,
                index = 0,
                segments = mutableListOf(),
                restoredIpAddress = this,
            )
        }

        return ArrayList(restoredIpAddresses)
    }

    private fun restore(
        letters: String,
        index: Int,
        segments: MutableList<Int>,
        restoredIpAddress: MutableList<String>
    ) {
        if (index >= letters.length && segments.size == 4) {
            restoredIpAddress.add(segments.joinToString("."))

            return
        }

        val remainLetters = letters.substring(index, letters.length).length
        val remainSegments = 4 - segments.size

        if (remainLetters > remainSegments * 3 || remainLetters < remainSegments) {
            return
        }

        oneBasedRepeat(3) { sequence ->
            if (index + sequence > letters.length) {
                return@oneBasedRepeat
            }

            if (letters[index] == '0' && sequence > 1) {
                return@oneBasedRepeat
            }

            val segment = letters.substring(index, index + sequence).toInt()

            if (segment > 255) {
                return@oneBasedRepeat
            }

            segments.add(segment)
            restore(
                letters = letters,
                index = index + sequence,
                segments = segments,
                restoredIpAddress = restoredIpAddress,
            )
            segments.removeLast()
        }
    }
}

inline fun oneBasedRepeat(times: Int, action: (Int) -> Unit) {
    for (index in 1 until times + 1) {
        action(index)
    }
}
