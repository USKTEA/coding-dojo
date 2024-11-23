class Solution {
    fun intToRoman(number: Int): String {
        return romanSequence(number).joinToString("")
    }
}

fun romanSequence(initialValue: Int): Sequence<Roman> {
    return sequence {
        var value = initialValue

        while (value > 0) {
            val roman = Roman.getMax(value)
            value -= roman
            yield(roman)
        }
    }
}

enum class Roman(
    val value: Int
) {
    M(1000),
    CM(900),
    D(500),
    CD(400),
    C(100),
    XC(90),
    L(50),
    XL(40),
    X(10),
    IX(9),
    V(5),
    IV(4),
    I(1);

    companion object {
        fun getMax(currentNumber: Int): Roman {
            return Roman.entries.first { currentNumber >= it }
        }
    }
}

private operator fun Int.compareTo(m: Roman): Int {
    return this.compareTo(m.value)
}

private operator fun Int.minus(m: Roman): Int {
    return this.minus(m.value)
}
