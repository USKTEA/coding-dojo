class Solution {
    //IP를 표현하는 문자열을 받아서 가능한 ip 주소 조합을 반환하는 문제
    //IP는 4개의 byte로 이루어져있고 각 byte는 .으로 구분된다
    //byte의 앞자리는 0이 될 수 없고 0인 경우에는 해당 byte가 0인 경우다
    //letters를 순회하면서 abcd 초기값 -1을 가진채 시작한다
    //-1이라면 현재 bit를 할당하고 아니라면 bit * 10 + bit
    //0이라면 바로 넘긴다
    //만약 bit * 10 + bit값이 255를 넘어도 넘긴다
    //마지막으로 결과 값아 result.add(arraylist(a,b,c,d))
    fun restoreIpAddresses(letters: String): ArrayList<String> {
        val ipAddresses = arrayListOf<String>()
        val restored = mutableListOf(-1, -1, -1, -1)

        for (i in letters.indices) {
            restore(
                bits = letters,
                currentBitsIndex = i,
                currentBitIndex = 0,
                ipAddresses = ipAddresses,
                restored = restored,
            )
        }

        return ipAddresses
    }

    private fun restore(
        bits: String,
        currentBitsIndex: Int,
        currentBitIndex: Int,
        restored: MutableList<Int>,
        ipAddresses: ArrayList<String>
    ) {
        if (currentBitsIndex > bits.lastIndex) {
            return
        }

        for (i in currentBitsIndex..bits.lastIndex) {
            if (currentBitIndex > restored.lastIndex) {
                return
            }

            val bitToAdd = restored[currentBitIndex]

            if (bitToAdd == 0) {
                return restore(
                    bits = bits,
                    currentBitIndex = currentBitIndex + 1,
                    currentBitsIndex = i,
                    restored = restored,
                    ipAddresses = ipAddresses,
                )
            }

            val bitAdded = addBit(bitToAdd, bits[i])

            if (bitAdded > 255) {
                return restore(
                    bits = bits,
                    currentBitIndex = currentBitIndex + 1,
                    currentBitsIndex = i,
                    restored = restored,
                    ipAddresses = ipAddresses,
                )
            }

            restored[currentBitIndex] = bitAdded

            restore(
                bits = bits,
                currentBitIndex = currentBitIndex,
                currentBitsIndex = i + 1,
                restored = restored,
                ipAddresses = ipAddresses,
            )
        }

        ipAddresses.add(restored.joinToString(".") { it.toString() })
    }

    fun addBit(byte: Int, bit: Char): Int {
        if (byte == -1) {
            return Character.getNumericValue(bit)
        }

        return byte * 10 + Character.getNumericValue(bit)
    }
}
