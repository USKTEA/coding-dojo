class Solution {
    fun solve(words: String): String {
        return words.split(Regex("\\s+"))
            .reversed()
            .joinToString(" ")
            .trim()
    }
}
