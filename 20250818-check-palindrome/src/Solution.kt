class Solution {
    //만약에 letters의 길이가 홀수라면 총수가 홀수인 charactor는 하나만 있어야 함
    //만약 letters의 길이가 짝수라면 총수가 홀수인 charactor는 하나도 있으면 안됨
    fun solve(letters: String): Int {
        if (letters.isEmpty()) {
            return 0
        }
        val characters = mutableMapOf<Char, Int>()

        when (letters.length % 2 == 0) {
            true -> {
                letters.forEach { letter ->
                    characters[letter] = characters.getOrDefault(letter, 0) + 1
                }

                val found = characters.values.find { it % 2 != 0 }

                if (found != null) {
                    return 0
                }

                return 1
            }
            false -> {
                letters.forEach { letter ->
                    characters[letter] = characters.getOrDefault(letter, 0) + 1
                }

                val found = characters.values.filter { it % 2 != 0 }

                if (found.size > 1) {
                    return 0
                }

                return 1
            }
        }
    }
}
