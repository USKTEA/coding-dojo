class Solution {
    fun specialStrings(words: ArrayList<String>): ArrayList<String> {
        val sortedWords = words.map { it.toCharArray().sorted() }
        val answer = ArrayList<String>()
        val current = mutableListOf<Char>()

        fun backTracking(index: Int) {
            if (index > sortedWords.lastIndex) {
                answer.add(current.joinToString(""))
                return
            }

            val currentWord = sortedWords[index]

            currentWord.forEach { character ->
                current.add(character)
                backTracking(index + 1)
                current.removeLast()
            }
        }

        backTracking(0)

        return answer
    }
}
