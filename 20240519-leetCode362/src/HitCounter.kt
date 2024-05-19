import java.util.*

class HitCounter {
    val records = TreeMap<Int, Int>()

    //treeMap[timeStamp] = treeMap[timeStamp].getOr(0) += 1
    fun hit(timestamp: Int) {
        val record = records.getOrDefault(timestamp, 0)
        records[timestamp] = record + 1
    }

    //from = treeMap[timeStamp].index()
    //to = treemap[timeStamp].index() | 0
    //0 ~ 300

    //301 - (301 - 300) ~ 301
    //1 ~ 301

    fun getHits(timestamp: Int): Int {
        return records.keys.filter {
            if (timestamp > 300) {
                return@filter it > (timestamp - 300) && it <= timestamp
            }

            it <= timestamp
        }.sumOf { records.getValue(it) }
    }
}
