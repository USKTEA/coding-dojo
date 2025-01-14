class Solution {
    fun removeElement(numbers: ArrayList<Int>, toDelete: Int): Int {
        numbers.removeIf { it == toDelete }
        return numbers.size
    }
}
