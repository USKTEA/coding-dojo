class Solution {
    //1 -> A
    //2 -> B
    //26 -> Z
    //27 -> AA

    //26 27 ..26
    //   1
    fun convertToTitle(number: Int): String {
        val numbers = buildList {
            var current = number

            while (current > 0) {
                val left = (current - 1) % 26
                add(left + 1)
                current = (current - 1) / 26
            }
        }

        return numbers.reversed().fold("") {acc, i ->
            acc + requireNotNull(numberMap[i])
        }
    }

    companion object {
        private val numberMap = mapOf(
                1 to "A",
                2 to "B",
                3 to "C",
                4 to "D",
                5 to "E",
                6 to "F",
                7 to "G",
                8 to "H",
                9 to "I",
                10 to "J",
                11 to "K",
                12 to "L",
                13 to "M",
                14 to "N",
                15 to "O",
                16 to "P",
                17 to "Q",
                18 to "R",
                19 to "S",
                20 to "T",
                21 to "U",
                22 to "V",
                23 to "W",
                24 to "X",
                25 to "Y",
                26 to "Z",
        )
    }
}
