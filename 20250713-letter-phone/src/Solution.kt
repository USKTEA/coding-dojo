class Solution {
    fun letterCombinations(digits: String): ArrayList<String> {
        val digitToLetterMap = mapOf(
            '1' to listOf('1'),
            '2' to listOf('a', 'b', 'c'),
            '3' to listOf('d', 'e', 'f'),
            '4' to listOf('g', 'h', 'i'),
            '5' to listOf('j', 'k', 'l'),
            '6' to listOf('m', 'n', 'o'),
            '7' to listOf('p', 'q', 'r', 's'),
            '8' to listOf('t', 'u', 'v'),
            '9' to listOf('w', 'x', 'y', 'z'),
            '0' to listOf('0'),
        )

        val possibleMappings = digits.map { digitToLetterMap[it]!! }
        val result = mutableListOf<String>()
        val current = mutableListOf<Char>()

        fun backTracking(index: Int) {
            if (index > possibleMappings.lastIndex) {
                result.add(current.joinToString(""))
                return
            }

            val currentPossibleLetters = possibleMappings[index]

            currentPossibleLetters.forEach {
                current.add(it)
                backTracking(index + 1)
                current.removeLast()
            }
        }

        backTracking(0)

        return ArrayList(result)
    }
}
