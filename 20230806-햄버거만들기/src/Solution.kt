class Solution {
    companion object {
        val RECEIPT = mutableListOf(1, 2, 3, 1)
    }

    fun solution(ingredients: IntArray): Int {
        val hamburgers = mutableListOf<MutableList<Int>>()
        val hamburger = mutableListOf<Int>()
        val ingredientList = ingredients.toMutableList()

        while (ingredientList.isNotEmpty()) {
            var current = RECEIPT[hamburger.size]
            var index = 0

            while (ingredientList.size > index) {
                if (current != ingredientList[index]) {
                    index += 1

                    continue
                }

                if (current == ingredientList[index]) {
                    val picked = ingredientList.removeAt(index)
                    hamburger.add(picked)
                    current = RECEIPT[hamburger.size % 4]

                    if (hamburger == RECEIPT) {
                        break
                    }
                }
            }

            if (hamburger != RECEIPT) {
                return hamburgers.size
            }

            hamburgers.add(hamburger)
            hamburger.removeAll(RECEIPT)
        }

        return hamburgers.size
    }
}
