class RobotDog(private val park: Array<String>) {
    private var location: IntArray = calculateStartPosition(park)

    private fun calculateStartPosition(park: Array<String>): IntArray {
        val xPosition = park.indexOfFirst { row -> row.contains("S") }
        val yPosition = park[xPosition].indexOf("S")

        return intArrayOf(xPosition, yPosition)
    }

    fun location(): IntArray {
        return this.location
    }

    fun execute(routes: Array<String>) {
        routes.forEach { route ->
            val (direction, range) = route.split(" ").toTypedArray()

            when (direction) {
                "N" -> {
                    if (this.location[0] - range.toInt() >= 0 && canGoUp(range.toInt())) {
                        this.location[0] -= range.toInt()
                    }
                }

                "S" -> {
                    if (this.location[0] + range.toInt() < park.size && canGoDown(range.toInt())) {
                        this.location[0] += range.toInt()
                    }
                }

                "W" -> {
                    if (this.location[1] - range.toInt() >= 0 && canGoLeft(range.toInt())) {
                        this.location[1] -= range.toInt()
                    }
                }

                "E" -> {
                    if (this.location[1] + range.toInt() < park[0].length && canGoRight(range.toInt())) {
                        this.location[1] += range.toInt()
                    }
                }
            }
        }
    }

    private fun canGoDown(range: Int): Boolean {
        val sliced = this.park.slice(this.location[0] ..this.location[0] + range)

        println(sliced)
        return sliced.map { it[this.location[1]] }.contains('X').not()
    }

    private fun canGoUp(range: Int): Boolean {
        val sliced = this.park.slice(this.location[0] - range..<this.location[0])

        return sliced.map { it[this.location[1]] }.contains('X').not()
    }

    private fun canGoLeft(range: Int): Boolean {
        return this.park[this.location[0]]
            .substring(this.location[1] - range, this.location[1])
            .contains("X")
            .not()
    }

    private fun canGoRight(range: Int): Boolean {
        return this.park[this.location[0]]
            .substring(this.location[1] + 1, this.location[1] + range + 1)
            .contains("X")
            .not()
    }
}
