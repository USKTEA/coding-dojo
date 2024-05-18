class Solution {
    //id, start | end, time
    //2, ["0:start:0","1:start:2","1:end:5","0:end:6"] => [3, 4]
    //log in Logs
    //val log = parse(logs)
    //add(log)
    //if (logStack.isEmpty()) {
    // logStack.add(log)
    // continue
    // }
    // time { id to Int }
    // timeGetOrDefault(0)
    // time[poll.id] += log.time - poll.time
    // }
    val logStack = mutableListOf<Log>()
    val executed = mutableListOf<Log>()
    val timeTable = mutableMapOf<Int, Int>()

    fun exclusiveTime(n: Int, logs: List<String>): IntArray {
        val stack = mutableListOf<Log>()
        val timeTable = IntArray(n)
        var prevTime = 0

        for (logStr in logs) {
            val log = Log.from(logStr)

            if (log.type == "start") {
                if (stack.isNotEmpty()) {
                    val lastLog = stack.last()
                    timeTable[lastLog.functionId] += log.timeStamp - prevTime
                }
                stack.add(log)
                prevTime = log.timeStamp
            }

            if (log.type == "end") {
                val startLog = stack.removeLast()
                timeTable[startLog.functionId] += log.timeStamp - prevTime + 1
                prevTime = log.timeStamp + 1
            }
        }

        return timeTable
    }

    fun parse(log: String): Log {
        return Log.from(log)
    }
}

data class Log(
    val functionId: Int,
    val type: String,
    val timeStamp: Int,
) {
    companion object {
        fun from(log: String): Log {
            val information = log.split(":")
                .also { assert(it.size == 3) }

            return Log(
                functionId = information[0].toInt(),
                type = information[1],
                timeStamp = information[2].toInt()
            )
        }
    }
}
