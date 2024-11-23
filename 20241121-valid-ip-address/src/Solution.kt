class Solution {
    fun restoreIpAddresses(
        digits: String,
        restoredIpAddresses: ArrayList<String> = arrayListOf(),
        currentIndex: Int = 0,
        segments: MutableList<String> = mutableListOf()
    ): ArrayList<String> {
        if (segments.size == 4 && currentIndex == digits.length) {
            restoredIpAddresses.add(segments.joinToString("."))

            return restoredIpAddresses
        }

        val segmentsLeft = 4 - segments.size
        val digitsLeft = digits.length - currentIndex

        if (segmentsLeft > digitsLeft || digitsLeft > segmentsLeft * 3) {
            return restoredIpAddresses
        }

        buildSegments(digits, currentIndex).forEach {
            segments.add(it)
            restoreIpAddresses(
                digits = digits,
                restoredIpAddresses = restoredIpAddresses,
                currentIndex = currentIndex + it.length,
                segments = segments
            )
            segments.removeLast()
        }

        return restoredIpAddresses
    }

    private fun buildSegments(digits: String, currentIndex: Int): List<String> {
        return buildList {
            for (i in 1..3) {
                if (currentIndex + i > digits.length) {
                    break
                }

                val segment = digits.substring(currentIndex, currentIndex + i)

                if (segment.isValid()) {
                    this.add(segment)
                }
            }
        }
    }
}

private fun String.isValid(): Boolean {
    return this.toInt() in 0..255
}
