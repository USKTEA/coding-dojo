class Solution {
    //leet**cod*e => lecoe
    //erase***** => ""
    fun removeStars(word: String): String {
        return word.fold(ArrayDeque<Char>()) { acc, letter ->
            if (letter != '*') {
                acc.addLast(letter)

                return@fold acc
            }

            if (letter == '*') {
                if (acc.isEmpty()) {
                 return@fold acc
                }

                acc.removeLast()
            }

            acc
        }.joinToString("")
    }
}
