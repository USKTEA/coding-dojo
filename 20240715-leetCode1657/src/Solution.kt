class Solution {
    //abc, bca => true
    //a, aa => false
    //cabba, abbccc => true
    fun closeStrings(word1: String, word2: String): Boolean {
        if (word1.length != word2.length) {
            return false
        }

        if (word1.toSet() != word2.toSet()) {
            return false
        }

        val occurrences1 = getOccurrence(word1).values

        val occurrences2 = getOccurrence(word2).values.groupingBy {
            it
        }.eachCount().toMutableMap()

        val removed = occurrences1.fold(occurrences2) { acc, number ->
            val occurrence = acc[number] ?: return false

            if (occurrence - 1 == 0) {
                acc.remove(number)

                return@fold acc
            }

            acc[number] = occurrence - 1

            return@fold acc
        }

        return removed.isEmpty()
    }

    fun getOccurrence(word: String) = buildMap {
        word.forEach { letter ->
            compute(letter) { _, value ->
                val count = value ?: 0
                count + 1
            }
        }
    }
}
