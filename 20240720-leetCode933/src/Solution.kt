class RecentCounter {
    private val records = mutableListOf<Int>()

    fun ping(time: Int): Int {
        if (records.isEmpty()) {
            records.add(time)

            return records.size
        }

        var oldestRecord = records.first()

        while ((time - oldestRecord) > 3000) {
            records.removeFirst()

            if (records.isEmpty()) {
                records.add(time)

                return records.size
            }

            oldestRecord = records.first()
        }

        records.add(time)

        return records.size
    }
}
