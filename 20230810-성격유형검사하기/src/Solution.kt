import kotlin.math.abs

class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val answers = answers(survey, choices)
        val result = checkResult(answers)

        return result
    }

    fun checkResult(answers: List<Answer>): String {
        val types = listOf("RT", "CF", "JM", "AN")

        val records = answers.fold(mutableMapOf<String, Int>()) { acc, answer ->
            acc[answer.type()] = acc.getOrDefault(answer.type(), 0) + answer.point()
            acc
        }

        return types.joinToString("") {
            val (first, second) = it.windowed(1)
            val firstScore = records[first] ?: 0
            val secondScore = records[second] ?: 0

            when {
                firstScore > secondScore -> first
                firstScore < secondScore -> second
                else -> it.toSortedSet().first().toString()
            }
        }
    }

    fun answers(survey: Array<String>, choices: IntArray): List<Answer> {
        return survey.mapIndexed { index: Int, types: String ->
            val type = types.windowed(1)
            val point = choices[index]
            val absolutePoint = abs(point - 4)

            when {
                point - 4 > 0 -> Answer(type[1], absolutePoint)
                point - 4 < 0 -> Answer(type[0], absolutePoint)
                else -> Answer("", 0)
            }
        }
    }
}

data class Answer(
    private var type: String,
    private var point: Int,
) {
    fun type(): String {
        return type
    }

    fun point(): Int {
        return point
    }
}


