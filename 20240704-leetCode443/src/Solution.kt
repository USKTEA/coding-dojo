class Solution {
    //['a'] => 1 ['a']
    //['a', 'a'] => 2, ['a', '2']
    //['a', 'a', 'a'] => 2, ['a', '3']
    //['a', 'a', 'a', 'b'] => 3, ['a', '3', 'b']
    //['a', 'a', 'a', 'b', 'b'] => 4, ['a', '3', 'b', '2']
    //["a","b","b","b","b","b","b","b","b","b","b","b","b"] => 4, ['a', 'b', '1', '2']
    fun compress(chars: CharArray): Int {
        if (chars.size == 1) {
            return 1
        }

        var compressCharsLength = 0
        var previousChar = chars[0]
        var count = 1

        for (index in 1..chars.lastIndex) {
            val currentChar = chars[index]

            if (previousChar != currentChar) {
                chars[compressCharsLength] = previousChar
                compressCharsLength += 1

                if (count > 1) {
                    for (number in count.toString()) {
                        chars[compressCharsLength] = number
                        compressCharsLength += 1
                    }
                }

                count = 0
                previousChar = currentChar
            }

            count += 1
        }


        chars[compressCharsLength] = previousChar
        compressCharsLength += 1

        if (count > 1) {
            for (number in count.toString()) {
                chars[compressCharsLength] = number

                compressCharsLength += 1
            }
        }

        return compressCharsLength
    }
}
