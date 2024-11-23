class Solution {
    fun restoreIpAddresses(bits: String): ArrayList<String> {
        val restoredIps = mutableListOf<String>()

        dfs(
            bits = bits,
            start = 0,
            segments = mutableListOf(),
            restoredIps = restoredIps
        )

        return ArrayList(restoredIps)
    }

    private fun dfs(bits: String, start: Int, segments: MutableList<String>, restoredIps: MutableList<String>) {
        if (segments.size == 4 && bits.length == start) {
            restoredIps.add(segments.joinToString("."))
            return
        }

        val remainSegments = 4 - segments.size
        val remainBits = bits.length - start

        if (remainBits < remainSegments || remainBits > remainSegments * 3) {
            return
        }

        for (i in 1..3) {
            if (start + i > bits.length) {
                break
            }

            val segment = bits.substring(start, start + i)

            if (isValid(segment)) {
                segments.add(segment)
                dfs(bits, start + i, segments, restoredIps)
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
