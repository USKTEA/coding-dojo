class Solution {

    //secret과 guess의 요소를 비교할 때
    //문자와 위치 모두 일치한다면 A, 문자만 일치하는게 있다면 B
    //최종적으로 xAyB를 반환한다
    //secret과 guess의 길이는 동일하다 그러니까 guess를 인덱스를 가지고 순회하면서 guess[i] = secret[i] 동일하다면
    //bulls += 1 하면서 secret filter guess filter한다
    //나머지 secret에서 hashMap을 만들고 문자 그리고 count 를 만든다
    //나머지 guess를 순회하면서 secret에서 문자열이 발견된다면 문자열의 count -=1 하고 cow += 1한다
    //count가 0이라면 hashMap에서 지운다
    fun solve(secret: String, guess: String): String {
        val (bulls, subtractedSecret, subtractedGuess) = matchBulls(secret, guess)

        val secretMap = subtractedSecret.groupingBy { it }.eachCount().toMutableMap()

        val cows = matchCows(secretMap, subtractedGuess)

        return "$bulls" + "A" + "$cows" + "B"
    }

    fun matchCows(secretMap: MutableMap<Char, Int>, subtractedGuess: String): Int {
        return subtractedGuess.fold(Pair(0, secretMap)) { acc, character ->
            val count = acc.second.getOrDefault(character, 0)

            if (count == 0) {
                return@fold acc
            }

            acc.second[character] = count - 1

            return@fold Pair(acc.first + 1, acc.second)
        }.first
    }

    fun matchBulls(secret: String, guess: String): Triple<Int, String, String> {
        return guess.foldIndexed(Triple(0, "", "")) { index, (bulls, currentSecret, currentGuess), _ ->
            val currentSecretElement = secret[index]
            val currentGuessElement = guess[index]

            if (currentGuessElement == currentSecretElement) {
                return@foldIndexed Triple(bulls + 1, currentSecret, currentGuess)
            }

            return@foldIndexed Triple(bulls, currentSecret + currentSecretElement, currentGuess + currentGuessElement)
        }
    }
}
