import java.time.LocalDate

class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val todayDate = today.toDate()
        val termsMap = toMap(terms)

        return privacies.map { it.split(" ") }
            .map { (date, type) ->
                val startDate = date.toDate()
                val monthToAdd = termsMap[type]!!
                val endDate = startDate.plusMonths(monthToAdd.toLong())

                endDate
            }.mapIndexedNotNull { index, expiredDate ->
                if (expiredDate <= todayDate) {
                    index + 1
                } else null
            }.toIntArray()
    }

    fun toMap(terms: Array<String>): Map<String, Int> {
        return terms.map { it.split(" ") }
            .fold(mutableMapOf()) { acc, (type, month) ->
                acc[type] = month.toInt()
                acc
            }
    }
}

private fun String.toDate(): LocalDate {
    val (year, month, day) = this.split(".").map { it.toInt() }

    return LocalDate.of(year, month, day)
}
