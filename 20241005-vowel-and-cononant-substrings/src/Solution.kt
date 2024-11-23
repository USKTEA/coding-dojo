class Solution {
    fun solve(string: String): Int {
        var count = 0
        var voewls = 0
        var consonants = 0

        for (char in string) {
            when (isVoewl(char)) {
                true -> {
                    count = (count + consonants) % 1000007
                    voewls += 1
                }
                false -> {
                    count = (count + voewls) % 1000007
                    consonants += 1
                }
            }
        }

        return count
    }

    fun isVoewl(char: Char): Boolean {
        return listOf('a', 'e', 'i', 'o', 'u').contains(char)
    }
}
