class Solution {
    fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
        val sortedProducts = products.sorted()
        val result: MutableList<List<String>> = mutableListOf()
        var current = 0
        var cursor = 0

        while (current < searchWord.length) {
            val (searched, nextCursor) = search(
                sortedProducts = sortedProducts,
                cursor = cursor,
                searchWord = searchWord.slice(0..current)
            )

            result.add(searched)
            cursor = nextCursor
            current += 1
        }

        return result
    }

    fun search(sortedProducts: List<String>, cursor: Int, searchWord: String): Pair<List<String>, Int> {
        var nextCursor = 0
        var changed = false
        val result = mutableListOf<String>()

        for (i: Int in cursor..sortedProducts.lastIndex) {
            if (sortedProducts[i].commonPrefixWith(searchWord) == searchWord) {
                if (!changed) {
                    nextCursor = i
                    changed = true
                }

                result.add(sortedProducts[i])
            }

            if (result.size == 3) {
                return Pair(result, nextCursor)
            }
        }

        return Pair(result, nextCursor)
    }
}
