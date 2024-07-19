class ExcelColumnTitle {
    fun convertToTitle(input: Int): String {
        val builder = StringBuilder()

        var q = input
        while (q != 0) {
            builder.append(convertToAlphabet(q % ALPHABET_LENGTH))
            q /= ALPHABET_LENGTH
        }

        return builder.reverse().toString()
    }

    private fun convertToAlphabet(remainder: Int): Char {
        return VALUES[remainder]
    }

    companion object {
        private const val ALPHABET_LENGTH = 26
        private val VALUES = charArrayOf(
            'Z',
            'A',
            'B',
            'C',
            'D',
            'E',
            'F',
            'G',
            'H',
            'I',
            'J',
            'K',
            'L',
            'M',
            'N',
            'O',
            'P',
            'Q',
            'R',
            'S',
            'T',
            'U',
            'V',
            'W',
            'X',
            'Y'
        )
    }
}
