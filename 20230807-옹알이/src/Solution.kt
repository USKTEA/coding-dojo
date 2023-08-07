class Solution {
    fun solution(babbling: Array<String>): Int {
        val dictionary = arrayListOf("aya", "ye", "woo", "ma")
        var result = 0

        for (word in babbling) {
            val spoke = mutableListOf<String>()
            val chunked = word.chunked(1)
            var current = ""

            for (character in chunked) {
                current += character

                if (dictionary.contains(current)) {
                    if (spoke.isEmpty()) {
                        spoke.add(current)
                        current = ""

                        continue
                    }

                    if (spoke.last() == current) {
                        break
                    }

                    spoke.add(current)
                    current = ""
                }
            }

            if (spoke.joinToString("") == word) {
                result += 1
            }
        }

        return result
    }
}
