class Solution {
    //문자열 lettersr가 주어졌을 때 모음의 순서만 역순으로 재배치한 결과를 반환해라
    //IceCreAm -> AceCreIm
    //left = 0, right = letters.lastIndex
    //while (left > right) {
    // val leftCharacter = letters[left];
    // val rightCharacter = letters[right];
    // while left not in vowels left += 1
    // if left == right return
    // while right not in vowels right -= 1
    // if right == left return
    // swap
    // left += 1
    // }

    private val lowerCaseVowels = listOf('a', 'e', 'i', 'o', 'u')
    private val upperCaseVowels = listOf('A', 'E', 'I', 'O', 'U')
    fun reverseVowels(letters: String): String {
        val result = letters.toCharArray()
        var left = 0
        var right = result.lastIndex

        while (left < right) {
            var leftCharacter = result[left]
            var rightCharacter = result[right]


            while (!isVowel(leftCharacter)) {
                left += 1

                if (left > right) {
                    break
                }

                leftCharacter = result[left]
            }

            while (!isVowel(rightCharacter)) {
                right -= 1

                if (right < left) {
                    break
                }

                rightCharacter = result[right]
            }

            if (left >= right) {
                return result.joinToString("")
            }

            if (isVowel(leftCharacter) && isVowel(rightCharacter)) {
                swap(result, left, right)
            }

            left += 1
            right -= 1
        }

        return result.joinToString("")
    }

    private fun swap(result: CharArray, leftIndex: Int, rightIndex: Int) {
        val left = result[leftIndex]
        val right = result[rightIndex]

        result[leftIndex] = right
        result[rightIndex] = left
    }
    private fun isVowel(character: Char): Boolean {
        return character in lowerCaseVowels || character in upperCaseVowels
    }
}
