class Solution {
    //numberSounds는 -로 단위가 구분된다
    //numberSounds의 마지막 단위는 and가 있어야 한다
    //crore, lakh, thousand, hundred 앞에는 단위가 있어야 한다
    private val parsingFunctions: List<(parsedResult: ParsedResult) -> ParsedResult> = listOf(
        { parsedResult -> parse(parsedResult, IndianUnit.CRORE) },
        { parsedResult -> parse(parsedResult, IndianUnit.LAKH) },
        { parsedResult -> parse(parsedResult, IndianUnit.THOUSAND) },
        { parsedResult -> parse(parsedResult, IndianUnit.HUNDRED) },
        { parsedResult -> parse(parsedResult, IndianUnit.TEN) },
        { parsedResult -> parse(parsedResult, IndianUnit.ONE) },
    )

    fun solve(number: String, numberSounds: String): Int {
        val parsed = parsingFunctions.fold(ParsedResult(number.toInt())) { acc, function -> function(acc) }
        val sounds = speak(parsed.result)

        if (sounds == numberSounds) {
            return 1
        }

        return 0
    }

    private fun speak(results: List<IndianNumber>): String {
        return results.mapIndexedNotNull { index, result ->
            if (result.unit == IndianUnit.ONE && results.firstOrNull { it.unit == IndianUnit.TEN && it.count != 0 } == null) {
                if (result.count != 0) {
                    if (results.any { it.count > 0 && it.unit != IndianUnit.ONE }) {
                        return@mapIndexedNotNull "and-${result.sound()}"
                    }

                    return@mapIndexedNotNull result.sound()
                }
            }

            if (result.unit == IndianUnit.TEN && result.count != 0) {
                if (index != 0) {
                    return@mapIndexedNotNull "and-${result.sound()}"
                }

                return@mapIndexedNotNull result.sound()
            }

            return@mapIndexedNotNull result.sound()
        }.joinToString("-")
    }

    fun parse(parsedResult: ParsedResult, indianUnit: IndianUnit): ParsedResult {
        if (parsedResult.original >= indianUnit.unit) {
            return parsedResult.copy(
                original = indianUnit.mod(parsedResult.original),
                result = buildList {
                    addAll(parsedResult.result)
                    add(
                        IndianNumber(
                            count = indianUnit.count(parsedResult.original),
                            unit = indianUnit
                        )
                    )
                }
            )
        }

        return parsedResult
    }
}

data class ParsedResult(
    val original: Int,
    val result: List<IndianNumber> = emptyList(),
)

data class IndianNumber(
    val count: Int,
    val unit: IndianUnit
) {
    fun sound(): String? {
        if (count == 0) {
            return null
        }

        if (unit == IndianUnit.ONE) {
            return mapUnitOne(count)
        }

        if (unit == IndianUnit.TEN) {
            return mapUnitTen(count * 10)
        }

        val unitTen = count / 10 * 10
        val unitOne = count % 10

        if (count < 20 && count != 10) {
            return mapUnitOne(count) + "-" + unit.name.lowercase()
        }

        if (unitOne == 0) {
            return mapUnitTen(unitTen) + "-" + unit.name.lowercase()
        }

        return mapUnitTen(unitTen) + "-" + mapUnitOne(unitOne) + "-" + unit.name.lowercase()
    }

    private fun mapUnitTen(number: Int): String {
        return when (number) {
            10 -> "ten"
            20 -> "twenty"
            30 -> "thirty"
            40 -> "forty"
            50 -> "fifty"
            60 -> "sixty"
            70 -> "seventy"
            80 -> "eighty"
            else -> "ninety"
        }
    }

    private fun mapUnitOne(number: Int): String {
        return when (number) {
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "four"
            5 -> "five"
            6 -> "six"
            7 -> "seven"
            8 -> "eight"
            9 -> "nine"
            11 -> "eleven"
            12 -> "twelve"
            13 -> "thirteen"
            14 -> "fourteen"
            15 -> "fifteen"
            16 -> "sixteen"
            17 -> "seventeen"
            18 -> "eighteen"
            else -> "nineteen"
        }
    }
}

enum class IndianUnit(
    override val unit: Int
) : Countable, Modable {
    CRORE(1_00_00_000),
    LAKH(1_00_000),
    THOUSAND(1_000),
    HUNDRED(100),
    TEN(10) {
        override fun count(number: Int): Int {
            if (number == 10) {
                return number / this.unit
            }

            if (number < 20) {
                return 0
            }

            return number / this.unit
        }

        override fun mod(number: Int): Int {
            if (number >= 20 || number == 10) {
                return number % this.unit
            }

            return number
        }
    },
    ONE(1);
}

interface Countable {
    val unit: Int
    fun count(number: Int): Int {
        return number / unit
    }
}

interface Modable {
    val unit: Int
    fun mod(number: Int): Int {
        return number % unit
    }
}
