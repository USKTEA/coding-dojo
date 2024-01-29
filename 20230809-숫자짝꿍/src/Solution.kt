class Solution {
    fun solution(x: String, y: String): String {
        val dictionaryX = toDictionary(x)
        val dictionaryY = toDictionary(y)
        val equals = mutableListOf<String>()

        for (key in dictionaryX.keys) {
            if (!dictionaryY.containsKey(key)) {
                continue
            }

            val length = minOf(dictionaryY[key]!!, dictionaryX[key]!!)

            repeat(length) {
                equals.add(key)
            }
        }

        val result = equals.sortedDescending().joinToString("")

        if (result.isEmpty()) {
            return "-1"
        }

        if (result.replace("0", "").isEmpty()) {
            return "0"
        }

        return result
    }

    fun toDictionary(x: String): MutableMap<String, Int> {
        val dictionary = mutableMapOf<String, Int>()

        for (i in x.indices) {
            val current = x[i].toString()

            dictionary[current] = dictionary.getOrDefault(current, 0) + 1
        }

        return dictionary
    }
}
