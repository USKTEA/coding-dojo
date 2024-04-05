class Solution {
    // a, b => ab
    // aa, b => aba
    // aa, bb => abab
    // a, bbb => abbb
    // abc , pqr => apbqcr
    // ab, pars => apbqrs
    //word1Index, word2Index, merged
    //if word1Index > word1.Length return merged + word2.slice(word2Index .. word2.length - 1)
    fun mergeAlternately(word1: String, word2: String, index1: Int = 0, index2: Int = 0, merged: String = ""): String {
        if (index1 > word1.length - 1) {
            return merged + word2.slice(index2..<word2.length)
        }

        if (index2 > word2.length - 1) {
            return merged + word1.slice(index1..<word1.length)
        }

        return mergeAlternately(word1, word2, index1 + 1, index2 + 1, merged + word1[index1] + word2[index2])
    }
}
