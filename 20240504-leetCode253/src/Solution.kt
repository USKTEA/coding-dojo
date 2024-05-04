import java.util.*

class Solution {
    fun minMeetingRooms(intervals: Array<IntArray>): Int {
        if (intervals.isEmpty()) return 0

        intervals.sortBy { it[0] }

        val roomEndTimes = PriorityQueue<Int>()

        for (interval in intervals) {
            if (roomEndTimes.isNotEmpty() && roomEndTimes.peek() <= interval[0]) {
                roomEndTimes.poll()
            }
            roomEndTimes.offer(interval[1])
        }

        return roomEndTimes.size
    }
}


