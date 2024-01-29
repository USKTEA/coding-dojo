class Solution {

    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val users = id_list.map { User(it) }.toMutableSet()
        val afterReport = report(users, report)
        val afterRecord = record(afterReport)
        val shouldBaned = afterRecord.filter { it.getReported() >= k }

        return afterReport.map { it.checkMailed(shouldBaned) }
            .fold(mutableListOf()) { acc: MutableList<Int>, user: User ->
                acc.add(user.mailed())
                acc
            }.toIntArray()
    }

    private fun record(afterReport: MutableSet<User>): MutableSet<User> {
        return afterReport.fold(afterReport) { acc: MutableSet<User>, user: User ->
            val reported = user.report()
            val users = reported.map { reportedUser -> acc.find { it.id() == reportedUser } }
            users.map { it?.reported() }

            acc
        }
    }

    private fun report(users: MutableSet<User>, report: Array<String>): MutableSet<User> {
        return report.fold(users) { users: MutableSet<User>, report: String ->
            val (reportUser, reportedUser) = report.split(" ")
            val found = users.find { it.id() == reportUser }

            found?.addReport(reportedUser)

            users
        }
    }
}

class User(
    private val id: String,
    private val report: MutableSet<String> = mutableSetOf(),
    private var reported: Int = 0,
    private var mailed: Int = 0
) {

    fun getReported(): Int {
        return reported
    }

    fun report(): MutableSet<String> {
        return report
    }

    fun reported() {
        this.reported += 1
    }

    fun addReport(id: String) {
        this.report.add(id)
    }

    override fun toString(): String {
        return id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

    fun id(): String {
        return id
    }

    fun mailed(): Int {
        return mailed
    }

    fun reportSize(): Int {
        return this.report.size

    }

    fun checkMailed(shouldBaned: List<User>): User {
        this.mailed = shouldBaned.fold(0) { acc: Int, user: User ->
            when {
                report.contains(user.id) -> acc + 1
                else -> acc
            }
        }

        return this
    }
}
