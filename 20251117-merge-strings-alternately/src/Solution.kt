class Solution {
    //문자열 word1 와 word2 가 주어질 때 word1 부터 시작해 문자를 하나씩 추가하고 만약 하나의 길이가 더 길다면 나머지를 문자열 끝에 추가해.
    fun mergeAlternately(left: String, right: String): String {
        val mergedString = StringBuilder()
        var index = 0

        while (mergedString.length != (right.length + left.length)) {
            val bothNotNull = left.getOrNull(index) != null && right.getOrNull(index) != null
            val leftNotNull = left.getOrNull(index) != null
            val rightNotNull = right.getOrNull(index) != null

            if (bothNotNull) {
                mergedString.append(left[index])
                mergedString.append(right[index])

                index += 1
                continue
            }

            if (leftNotNull) {
                val leftLast = left.slice(index until left.length)
                mergedString.append(leftLast)

                println(leftLast)
                index += leftLast.length
                continue
            }

            if (rightNotNull) {
                val rightLast = right.slice(index until right.length)

                mergedString.append(rightLast)

                index += rightLast.length
                continue
            }
        }

        return mergedString.toString()
    }
}
