class Solution {

    //[1, 3, 5] => 8
    //모든 숫자 Pair를 만들고
    //Bit 연산자로 다른 비트의 갯수를 구하고 Pair에 캐싱한다
    //캐싱된 결과가 있으면 바로 캐싱을 사용해 결과 값에 더하고
    //결과 값을 반환한다
    fun cntBits(numbers: ArrayList<Int>): Int {
        val pairs = toPairs(numbers)

        return pairs.sumOf {
            countDifferentBits(it)
        }
    }

    fun toPairs(numbers: ArrayList<Int>): List<Pair<Int, Int>> {
        return buildList {
            for (i in numbers.indices) {
                for (j in numbers.indices) {
                    this.add(Pair(numbers[i], numbers[j]))
                }
            }
        }
    }

    fun countDifferentBits(pair: Pair<Int, Int>): Int {
        val firstNumberBinary = toBinary(pair.first)
        val secondNumberBinary = toBinary(pair.second)
        val (slicedFirst, slicedSecond, slicedBitsCount) = slice(firstNumberBinary, secondNumberBinary)

        return slicedFirst.mapIndexed { index: Int, number: Char ->
            if (number == slicedSecond[index]) {
                return@mapIndexed 0
            }

            return@mapIndexed 1
        }.sum() + slicedBitsCount
    }

    fun slice(firstNumberBinary: String, secondNumberBinary: String): Triple<String, String, Int> {
        if (firstNumberBinary.length == secondNumberBinary.length) {
            return Triple(firstNumberBinary, secondNumberBinary, 0)
        }

        if (firstNumberBinary.length > secondNumberBinary.length) {
            return Triple(
                firstNumberBinary.substring(
                    0,
                    firstNumberBinary.lastIndex - (firstNumberBinary.length - secondNumberBinary.length) + 1
                ),
                secondNumberBinary,
                firstNumberBinary.length - secondNumberBinary.length
            )
        }

        return Triple(
            firstNumberBinary,
            secondNumberBinary.substring(
                0,
                secondNumberBinary.lastIndex - (secondNumberBinary.length - firstNumberBinary.length) + 1
            ),
            secondNumberBinary.length - firstNumberBinary.length
        )
    }

    fun toBinary(number: Int): String {
        if (number == 1) {
            return "1"
        }

        val binary = StringBuilder()
        var current = number

        while (current / 2 > 0) {
            binary.append(current % 2)

            current /= 2
        }

        binary.append(current % 2)

        return binary.reverse().toString()
    }
}

private fun Pair<Int, Int>.countDifferentBits(): Int {

    TODO("Not yet implemented")
}
