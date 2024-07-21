class Solution {
    fun decodeString(s: String): String {
        return decodeStringHelper(s, 0).first
    }

    private fun decodeStringHelper(s: String, index: Int): Pair<String, Int> {
        var result = ""
        var i = index
        var num = 0

        while (i < s.length) {
            when {
                s[i].isDigit() -> {
                    num = num * 10 + (s[i] - '0')
                }
                s[i] == '[' -> {
                    val (decodedSubstring, newIndex) = decodeStringHelper(s, i + 1)
                    result += decodedSubstring.repeat(num)
                    num = 0
                    i = newIndex
                }
                s[i] == ']' -> {
                    return Pair(result, i)
                }
                else -> {
                    result += s[i]
                }
            }
            i++
        }

        return Pair(result, i)
    }
}
