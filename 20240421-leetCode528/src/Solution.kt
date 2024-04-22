//Solution(w) => w => WeightIndex(weight, i)
//WeighIndex => w[i]/w.total double
//w[i] +..+ w[m] < 1.0
//pickIndex => Math.random() => number
//first(weighIndex.in(number) )
class Solution(w: IntArray) {
    val weighIndex: List<WeighIndex>

    init {
        val total = w.sum()

        weighIndex = w.foldIndexed(Pair(0.toDouble(), mutableListOf<WeighIndex>())) { index, (current, indices), i ->
            val to = current + (i.toDouble() / total.toDouble())

            val weighIndex = WeighIndex(
                from = current, to = to, index = index
            )

            indices.add(weighIndex)
            Pair(to, indices)
        }.second.toList()
    }

    fun pickIndex(randomGenerator: RandomGenerator = RandomGenerator()): Int {
        val randomNumber = randomGenerator.generate()

        return weighIndex.first { it.picked(randomNumber) }.index
    }
}

data class WeighIndex(
    val from: Double,
    val to: Double,
    val index: Int,
) {
    fun picked(randomNumber: Double): Boolean {
        return randomNumber >= from && randomNumber < to
    }
}

open class RandomGenerator {
    open fun generate(): Double {
        return Math.random()
    }
}

class MockRandomGenerator(
    private val number: Double
) : RandomGenerator() {
    override fun generate(): Double {
        return number
    }
}


