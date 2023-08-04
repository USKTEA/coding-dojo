class Solution {
    fun solution(food: IntArray): String {
        val foods = toFoods(food)
        val prePared = foods.fold(mutableListOf("", "")) { acc: MutableList<String>, food: Food ->
            val toAdd = List(food.amount) { food.number }.joinToString("")
            acc[0] = acc[0] + toAdd
            acc[1] = toAdd + acc[1]
            acc
        }

        return prePared[0] + "0" + prePared[1]
    }

    fun toFoods(foods: IntArray): List<Food> {
        return foods.toList().mapIndexedNotNull { index: Int, amount: Int ->
            if (amount >= 2) {
                Food(number = index, amount = amount / 2)
            } else {
                null
            }
        }
    }
}

data class Food(
    val number: Int,
    val amount: Int
)
