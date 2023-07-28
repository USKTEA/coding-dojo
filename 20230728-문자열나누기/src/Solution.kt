import org.junit.platform.commons.util.StringUtils

class Solution {
    fun solution(s: String): Int {
        val sliced = mutableListOf<String>()
        var current = ""
        var compare = ""
        var compareCount = 0
        var otherCount = 0

        s.forEach { c: Char ->
            if (compare.isNotBlank() && compare == c.toString()) {
                compareCount += 1
            }

            if (compare.isBlank()) {
                compare = c.toString()
                compareCount += 1
            }

            if (compare != c.toString()) {
                otherCount += 1
            }

            current += c.toString()

            if (compareCount === otherCount) {
                compare = ""
                compareCount = 0
                otherCount = 0
                sliced.add(current)
                current = ""
            }
        }

        if (current.isNotBlank()) {
            sliced.add(current)
        }

        return sliced.size
    }
}