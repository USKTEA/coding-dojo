class Solution {
    fun specialStrings(words: ArrayList<String>): ArrayList<String> {
        val sortedWords = words.map { it.toList().sorted().joinToString("") }
        val result = mutableListOf<String>()
        val specialWord = StringBuilder()

        fun backTracking(index: Int) {
            if (index == sortedWords.size) {
                result.add(specialWord.toString())
                return
            }

            val currentWord = sortedWords[index]

            currentWord.forEach { character ->
                specialWord.append(character)
                backTracking(index + 1)
                specialWord.deleteAt(specialWord.length - 1)
            }
        }

        backTracking(0)

        return ArrayList(result)
    }
}
