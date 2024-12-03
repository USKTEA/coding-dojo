class Solution {
    //문자열이 주어졌을 때 마지막 단어의 길이를 반환한다
    //문자열은 영문 대,소문자 및 빈 문자로 이루어져있다
    //문자열은 빈 문자열로 단어를 구분하고 있다
    //문자열을 뒤에서 부터 순회하고 영문 대,소문자를 만났다면 길이를 더하기 시작한다
    //길이를 더하다가 빈 문자열 또는 첫 문자까지 순회를 했다면 만나면 여태까지 더한 값을 반환한다
    fun lengthOfLastWord(words: String): Int {
        var currentIndex = words.lastIndex
        var count = 0

        while (currentIndex >= 0) {
            val character = words[currentIndex]

            if (currentIndex == words.lastIndex && character == ' ') {
                currentIndex -= 1
                continue
            }

            if (count != 0 && character == ' ') {
                return count
            }

            if (character in 'a'..'z' || character in 'A'..'Z') {
                count += 1
            }

            currentIndex -= 1
        }

        return count
    }
}
