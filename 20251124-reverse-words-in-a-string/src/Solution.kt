class Solution {
    //영문 대소문자, 숫자 그리고 공백으로 구성된 words가 주어졌을 때 공백을 기준으로 각 문자를 분리하고 기존 순서의 역순으로 정렬된 문자를 반환해라.
    //역순으로 정렬된 문자열의 각 문자 부분은 최대 1개의 공백으로 이어져야 한다.
    // the sky is  blue -> blue is sky the
    fun reverseWords(words: String): String {
        val trimmedWord = trim(words)
        val splitWords = splitAndReverse(trimmedWord)

        return splitWords.joinToString(" ")
    }

    fun trim(words: String): String {
        return words.trim()
    }

    fun splitAndReverse(words: String): List<String> {
        var currentIndex = 0
        val result = mutableListOf<String>()
        val current = StringBuilder()

        while (currentIndex <= words.lastIndex) {
            val currentCharacter = words[currentIndex]

            if (currentCharacter == ' ' && current.isNotEmpty()) {
                result.add(0, current.toString())
                current.clear()
            }

            if (currentCharacter != ' ') {
                current.append(currentCharacter)
            }

            if (currentIndex + 1 > words.lastIndex) {
                result.add(0, current.toString())
            }

            currentIndex += 1
        }

        return result
    }
}
