class Solution {
    fun specialStrings(words: ArrayList<String>): ArrayList<String> {
        val sortedWords = words.map { it.toCharArray().sorted() }
        val answer = arrayListOf<String>()
        val current = mutableListOf<Char>()

        fun backTracking(index: Int) {
            if (index > sortedWords.lastIndex) {
                answer.add(current.joinToString(""))

                return
            }

            val sortedWord = sortedWords[index]

            sortedWord.forEach { character ->
                current.add(character)
                backTracking(index + 1)
                current.removeLast()
            }
        }

        backTracking(0)

        return answer
    }
}
