class Solution {
    //[100], 50 => 0
    //[200, 100], 150 => 1
    //[100, 200, 300, 400], 200 => 2
    //tokens.sort()
    //while (power > token[0] && score != 0) {
    // if (power > token[0]) {
    // tokens.removeFirst()
    // power -= token[0]
    // score += 1
    // continue
    // }
    // if (score != 0) {
    // tokens.removeLast()
    // power += token[last]
    // score -= 1
    // }
    // }
    //
    fun bagOfTokensScore(tokens: IntArray, power: Int): Int {
        val sortedTokens = ArrayDeque(tokens.sorted())
        var score = 0
        var currentPower = power
        var left = 0
        var right = tokens.lastIndex

        while (left <= right) {
            if (currentPower >= sortedTokens[left]) {
                currentPower -= sortedTokens[left]
                score += 1
                left += 1
                continue
            }

            if (score > 0) {
                if (right - 1 < left) {
                    break
                }

                currentPower += sortedTokens[right]
                score -= 1
                right -= 1

                continue
            }

            break
        }
//        while (sortedTokens.isNotEmpty() && (currentPower >= sortedTokens[0] || score != 0)) {
//            if (currentPower >= sortedTokens[0]) {
//                val tokenValue = sortedTokens.removeFirst()
//                currentPower -= tokenValue
//                score += 1
//
//                continue
//            }
//
//            if (score > 0) {
//                if (sortedTokens.size == 1) {
//                    break
//                }
//
//                val tokenValue = sortedTokens.removeLast()
//                currentPower += tokenValue
//                score -= 1
//            }
//        }

        return score
    }
}
