class Solution {
    fun addBinary(binary: String, otherBinary: String): String {
        var tempResult = DEFAULT
        var binaryIndex = binary.lastIndex
        var otherBinaryIndex = otherBinary.lastIndex
        var result = ""

        while (binaryIndex >= 0 && otherBinaryIndex >= 0) {
            tempResult = xor(binary[binaryIndex], otherBinary[otherBinaryIndex], tempResult.carry)
            result = "${tempResult.number}$result"
            binaryIndex -= 1
            otherBinaryIndex -= 1
        }

        while (binaryIndex >= 0) {
            tempResult = xor(binary[binaryIndex], '0', tempResult.carry)
            result = "${tempResult.number}$result"
            binaryIndex -= 1
        }

        while (otherBinaryIndex >= 0) {
            tempResult = xor('0', otherBinary[otherBinaryIndex], tempResult.carry)
            result = "${tempResult.number}$result"
            otherBinaryIndex -= 1
        }

        if (tempResult.carry == 1) {
            return "${tempResult.carry}$result"
        }

        return result
    }

    fun xor(bit: Char, otherBit: Char, carry: Int): XorResult {
        return XorResult(
            if ((carry == 1 && (bit == '1' || otherBit == '1')) ||
                bit == '1' && otherBit == '1'
            ) 1 else 0,
            Character.getNumericValue(bit) xor Character.getNumericValue(otherBit) xor carry
        )
    }

    companion object {
        private val DEFAULT = XorResult(0, 0)
    }

    data class XorResult(
        val carry: Int,
        val number: Int,
    )
}
