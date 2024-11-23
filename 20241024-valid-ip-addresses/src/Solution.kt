class Solution {
    fun restoreIpAddresses(bits: String): ArrayList<String> {
        val restoredIps = arrayListOf<String>()

        restore(bits, 0, mutableListOf(), restoredIps)

        return restoredIps
    }

    private fun restore(bits: String, start: Int, segments: MutableList<String>, restoredIps: ArrayList<String>) {
        if (segments.size == 4 && bits.length == start) {
            restoredIps.add(segments.joinToString("."))

            return
        }

        val lastSegments = 4 - segments.size
        val lastBits = bits.length - start

        if (lastSegments > lastBits || lastBits > lastSegments * 3) {
            return
        }

        for (i in 1..3) {
            if (start + i > bits.length) {
                break
            }

            val segment = bits.substring(start, start + i)

            if (isValid(segment)) {
                segments.add(segment)
                restore(bits, start + i, segments, restoredIps)
                segments.removeLast()
            }
        }
    }

    private fun isValid(segment: String): Boolean {
        if (segment.length > 1 && segment[0] == '0') {
            return false
        }

        return segment.toInt() in 0..255
    }
}
