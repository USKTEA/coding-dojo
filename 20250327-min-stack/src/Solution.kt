import java.util.TreeSet

class Solution {
    val stack = Stack()

    fun push(number: Int) {
        stack.push(number)
    }

    fun pop() {
        stack.pop()
    }

    fun top(): Int {
        return 0
    }

    fun getMin(): Int {
        return 0
    }
}

class Stack {
    private val elements = mutableListOf<Int>()
    private val sortedElements = TreeSet<Int>()

    val size: Int get() = elements.size
    val min: Int get() {
        if (sortedElements.isEmpty()) {
            return -1
        }

        return sortedElements.first()
    }

    fun push(element: Int) {
        elements.addLast(element)
        sortedElements.add(element)
    }

    fun pop() {
        val removed = elements.removeFirst()
        sortedElements.remove(removed)
    }

}
