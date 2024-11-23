
class Solution {
    //IP주소는 4개의 세그먼트로 이루어진다
    //세그먼트는 0-255 사이이다.
    //세그먼트는 0이 아닌 이상 0으로 시작하지 않는다.
    fun restoreIpAddresses(digits: String): ArrayList<String> {
        val result = arrayListOf<String>()

        restore(digits, result)

        return ArrayList(result)
    }

    private fun restore(
        digits: String,
        result: MutableList<String>,
        index: Int = 0,
        segments: MutableList<String> = mutableListOf()
    ) {
        if (segments.size == 4 && index == digits.length) {
            result.add(segments.joinToString("."))

            return
        }

        val digitLeft = digits.length - index
        val segmentLeft = 4 - segments.size

        if (segmentLeft > digitLeft || segmentLeft * 3 < digitLeft) {
            return
        }

        for (i in 1..3) {
            if (index + i > digits.length) {
                break
            }

            val segment = digits.substring(index, index + i)

            if (segment.isValid()) {
                segments.add(segment)
                restore(digits, result, index + i ,segments)
                segments.removeLast()
            }
        }
    }
}

private fun String.isValid(): Boolean {
    return this.toInt() in 0..255
}
