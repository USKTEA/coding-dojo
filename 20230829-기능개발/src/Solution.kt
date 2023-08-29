import kotlin.math.min

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val tasks = progresses.foldIndexed(mutableListOf<Task>()) { index, tasks, progress ->
            tasks.add(Task(progress = progress, speed = speeds[index]))
            tasks
        }

        val deploys = mutableListOf<MutableList<Task>>()

        while (tasks.isNotEmpty()) {
            tasks.forEach { it.work() }

            val completed = mutableListOf<Task>()

            while (tasks.isNotEmpty() && tasks.first().completed) {
                completed.add(tasks.removeFirst())
            }

            if (completed.isNotEmpty()) {
                deploys.add(completed)
            }
        }

        return deploys.map { it.size }.toIntArray()
    }
}

data class Task(
    var progress: Int,
    val speed: Int
) {
    val completed: Boolean
        get() = this.progress == 100

    fun work() {
        progress = minOf(this.progress + speed, 100)
    }
}
