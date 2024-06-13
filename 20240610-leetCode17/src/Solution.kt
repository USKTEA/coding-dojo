class Solution {
    //"23" => ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    //"" => []
    //"2" => ["a", "b", "c"]
    //map(char to ["a", "b", "c"])

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) {
            return emptyList()
        }

        val letterMap = mapOf(
            '2' to listOf("a", "b", "c"),
            '3' to listOf("d", "e", "f"),
            '4' to listOf("g", "h", "i"),
            '5' to listOf("j", "k", "l"),
            '6' to listOf("m", "n", "o"),
            '7' to listOf("p", "q", "r", "s"),
            '8' to listOf("t", "u", "v"),
            '9' to listOf("w", "x", "y", "z")
        )


        return getLetter("", digits, 0, letterMap, mutableListOf())
    }

    private fun getLetter(
        currentLetter: String,
        digits: String,
        currentIndex: Int,
        letterMappings: Map<Char, List<String>>,
        letters: MutableList<String>
    ): List<String> {
        if (currentIndex == digits.length) {
            letters.add(currentLetter)

            return letters
        }

        val currentMapping = letterMappings.getValue(digits[currentIndex])

        for (letter in currentMapping) {
            getLetter(currentLetter + letter, digits, currentIndex + 1, letterMappings, letters)
        }

        return letters
    }
}
