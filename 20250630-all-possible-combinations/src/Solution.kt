class Solution {
    fun specialStrings(words: ArrayList<String>): ArrayList<String> {
        val sortedWords = words.map { it.toCharArray().sorted() }
        val answer = ArrayList<String>()
        val current = ArrayList<Char>()

        fun backTracking(index: Int) {
            if (index >= sortedWords.size) {
                answer.add(current.joinToString(""))
                return
            }

            val currentWord = sortedWords[index]

            currentWord.forEach { char ->
                current.add(char)
                backTracking(index + 1)
                current.removeLast()
            }
        }

        backTracking(0)

        return answer
    }
}
