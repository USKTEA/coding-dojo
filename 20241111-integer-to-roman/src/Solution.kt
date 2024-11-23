class Solution {
    fun intToRoman(number: Int): String {
        var currentNumber = number
        val romans = mutableListOf<Roman>()

        while (currentNumber != 0) {
            val roman = Roman.getRoman(currentNumber)
            romans.add(roman)
            currentNumber -= roman
        }

        return romans.joinToString("")
    }

    enum class Roman(
        val value: Int,
    ) {
        I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);

        companion object {
            fun getRoman(number: Int): Roman {
                if (number >= 1000) {
                    return M
                }

                if (number >= 900) {
                    return CM
                }

                if (number >= D.value) {
                    return D
                }

                if (number >= 400) {
                    return CD
                }

                if (number >= C.value) {
                    return C
                }

                if (number >= 90) {
                    return XC
                }

                if (number >= L.value) {
                    return L
                }

                if (number >= 40) {
                    return XL
                }

                if (number >= X.value) {
                    return X
                }

                if (number == 9) {
                    return IX
                }

                if (number >= V.value) {
                    return V
                }

                if (number == 4) {
                    return IV
                }

                return I
            }
        }
    }
}

private operator fun Int.minus(roman: Solution.Roman): Int {
    return this - roman.value
}
