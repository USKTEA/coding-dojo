class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val asciiCodes = toAsciiCodes(s)
        val toSkip = toSet(skip)
        val added = addIndex(asciiCodes, toSkip, index)

        return added.map { it.toChar() }.fold("") { acc: String, c: Char -> acc + c }
    }

    fun addIndex(asciiCodes: List<Int>, toSkip: Set<Int>, index: Int): List<Int> {
        return asciiCodes.map {
            val toSkips = calculateToSkips(it, toSkip)

            it + index + toSkips
        }.map {
            if (it / 'z'.code >= 1) {
                'a'.code + it % 'z'.code
            } else it
        }
    }

    fun calculateToSkips(asciiCode: Int, toSkip: Set<Int>): Int {
        return toSkip.fold(mutableMapOf("asciiCode" to asciiCode, "toSkip" to 0)) { acc, i ->
            println(acc["asciiCode"])
            println(i)
            if (acc["asciiCode"] == i) {
                acc["asciiCode"] = acc["asciiCode"]!! + 1
                acc["toSkip"] = acc["toSkip"]!! + 1
            }

            if (acc["asciiCode"]!! > 'z'.code) {
                acc["asciiCode"] = 'a'.code + acc["asciiCode"]!! % 'z'.code
            }

            acc
        }["toSkip"]!!
    }

    fun toSet(skip: String): Set<Int> {
        return skip.toCharArray().map { it.code }.toSet()
    }

    fun toAsciiCodes(s: String): List<Int> {
        return s.toCharArray().map { it.code }
    }
}