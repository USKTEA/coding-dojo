class Solution {
    //문자열 words와 otherWords가 주어졌을 때 가장 큰 공통 나눔자를 구하라
    //나눔자는 words = d + d + d 로 표현할 수 있는 문자열이다.
    //모든 문자열은 본인이 가장 큰 나눔자이다.
    //words와 otherWords 중 길이가 작은 것을 선택해 해당 문자열의 나눔자를 구한다.
    //구해진 나눔자들을 길이로 정렬하고 가장 큰 나눔자 부터 하나씩 시도해본다.
    //만약 어떤 나눔자도 둘을 나눌 수 없다면 "" 빈 문자열을 반환한다.
    fun gcdOfStrings(word: String, otherWord: String): String {
        if (word.isEmpty() || otherWord.isEmpty()) {
            return ""
        }

        val (small, large) = divide(word, otherWord)
        val smallerWordDivisors = getDivisors(small).sortedByDescending { it.length }

        smallerWordDivisors.forEach { divisor ->
            var start = 0
            var end = divisor.lastIndex

            while (end <= large.lastIndex) {
                val sliced = large.slice(start..end)

                if (sliced != divisor) {
                    return@forEach
                }

                if (end == large.lastIndex) {
                    return divisor
                }

                start += divisor.lastIndex + 1
                end += divisor.lastIndex + 1
            }
        }

        return ""
    }

    private fun divide(word: String, otherWord: String) : Pair<String, String> {
        if (word.length <= otherWord.length) {
            return Pair(word, otherWord)
        }

        return Pair(otherWord, word)
    }

    fun getDivisors(smallerWord: String): List<String> {
        var current = 0
        var divisorLength = 1
        var currentDivisor = smallerWord.slice(0 until divisorLength)
        val divisors = mutableListOf<String>()

        while (currentDivisor.length <= smallerWord.length) {
            var divided = smallerWord.slice(0 until divisorLength)

            while (divided == currentDivisor) {
                current += 1

                if (current * divisorLength == smallerWord.length) {
                    divisors.add(currentDivisor)

                    continue
                }

                if (current * divisorLength + divisorLength > smallerWord.length) {
                    break
                }

                divided = smallerWord.slice(current * divisorLength until current * divisorLength + divisorLength)
            }

            current = 0
            divisorLength += 1

            if (divisorLength > smallerWord.length) {
                break
            }

            currentDivisor = smallerWord.slice(0 until divisorLength)
        }

        return divisors
    }
}
