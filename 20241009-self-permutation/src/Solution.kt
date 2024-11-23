class Solution {
    //두 문자열을 받아 동일한 문자가 될 수 있는 가능성을 확인한다
    //가능성이 있다면 1 없다면 0을 반환한다.
    //두 문자열의 길이가 다르다면 0을 반환한다
    //두 문자열의 요소의 갯수가 같다면 1을 반환한다
    fun permuteStrings(letters: String, otherLetters: String): Int {
        if (letters.length != otherLetters.length) {
            return 0
        }

        if (letters == otherLetters) {
            return 1
        }

        val lettersMap = letters.groupingBy { it }.eachCount()
        val otherLettersMap = otherLetters.groupingBy { it }.eachCount()

        otherLettersMap.forEach { (key, value) ->
            val count = lettersMap.getOrDefault(key, 0)

            if (count == 0 || count != value) {
                return 0
            }
        }

        lettersMap.forEach { (key, value) ->
            val count = otherLettersMap.getOrDefault(key, 0)

            if (count == 0 || count != value) {
                return 0
            }
        }

        return 1
    }
}
