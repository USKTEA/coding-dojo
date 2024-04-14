class Solution {
    //[1] => 1
    //[[1]] => 2
    //[[1, 1]] => 4
    //[[[1]]] => 3
    //[[1, 0]] => 2
    //[[1, 1], 2, [1, 1]] => 10
    //[1, [4, [6]]] => 27
    fun depthSum(nestedList: List<NestedInteger>): Int {
        val sum = nestedList.fold(0) { acc, nestedInteger ->
            acc + nestedInteger.sum()
        }

        return sum
    }

}


fun NestedInteger.sum(depth: Int = 1): Int {
    if (this.isInteger()) {
        return depth * this.value!!
    }

    return this.nestedIntegers?.fold(0) { acc, nestedInteger ->
        acc + nestedInteger.sum(depth = depth + 1)
    }!!
}

class NestedInteger(
    var value: Int? = null,
    var nestedIntegers: MutableList<NestedInteger>? = null,
) {

    fun isInteger(): Boolean {
        return value != null
    }

    fun getInteger(): Int? {
        if (nestedIntegers != null) {
            return null
        }

        return value
    }

    fun setInteger(value: Int) {
        this.value = value
    }

    fun add(ni: NestedInteger) {
        if (this.nestedIntegers == null) {
            this.nestedIntegers = mutableListOf(ni)

            return
        }

        this.nestedIntegers?.add(ni)
    }

    fun getList(): List<NestedInteger>? {
        if (this.value != null) {
            return null
        }

        return this.nestedIntegers
    }
}
