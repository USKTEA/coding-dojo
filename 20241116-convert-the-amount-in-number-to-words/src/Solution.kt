class Solution {
    fun solve(number: String, words: String): Int {
        val numberWords = words.split("-")
            .also {
                it.forEachIndexed { index, word ->
                    if (word == "zero") {
                        if (it.size > 1) {
                            return 0
                        }
                    }

                    if (word == "thousand") {
                        val subList = it.subList(index + 1, it.lastIndex + 1)

                        if (subList.isNotEmpty() && !subList.contains("and") && !subList.contains("hundred")) {
                            return 0
                        }
                    }
                    if (word == "hundred") {
                        if (index != it.lastIndex && it[index + 1] != "and") {
                            return 0
                        }
                    }
                }
            }.filter { it != "and" }
            .map { it.toNumber() }

        var index = 0
        var result = 0

        while (index <= numberWords.lastIndex) {
            val currentNumber = numberWords[index] ?: return 0

            if (index == numberWords.lastIndex) {
                result += currentNumber

                break
            }

            val nextNumber = numberWords[index + 1] ?: return 0

            if (currentNumber < nextNumber) {
                result += currentNumber * nextNumber

                index += 2

                continue
            }

            result += currentNumber

            index += 1
        }

        if (result == number.toInt()) {
            return 1
        }

        return 0
    }

    private fun String.toNumber(): Int? {
        return indianNumberDictionary.getOrDefault(this, null)
    }

    private val indianNumberDictionary = mapOf(
        "zero" to 0,
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9,
        "ten" to 10,
        "eleven" to 11,
        "twelve" to 12,
        "thirteen" to 13,
        "fourteen" to 14,
        "fifteen" to 15,
        "sixteen" to 16,
        "seventeen" to 17,
        "eighteen" to 18,
        "nineteen" to 19,
        "twenty" to 20,
        "thirty" to 30,
        "forty" to 40,
        "fifty" to 50,
        "sixty" to 60,
        "seventy" to 70,
        "eighty" to 80,
        "ninety" to 90,
        "hundred" to 100,
        "thousand" to 1000,
        "million" to 1000000,
    )
}
