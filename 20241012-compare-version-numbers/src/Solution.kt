import java.math.BigInteger

class Solution {
    //버전1, 버전2 문자열이 있다면
    //버전1이 버전2 보다 나중 버전이라면 1을 반환하고
    //버전1이 버전2 보다 전 버전이라면 -1을 반환하고
    //버전1과 버전2가 동일한 버전이라면 0을 반환한다

    //나중에 나온 버전이 더 크다고 정의하고
    //이전에 나온 버전이 작다고 정의를 하면 된다

    //문자열을 버전 객체로 전환한다
    //버전은 .을 기준으로 레벨이 분리된다
    //1.1 이라면 first-level은 1, second-level은 1인 버전이다
    //버전 문자열을 .으로 분리했을 때 index 0의 가중치가 제일 크다
    //level의 버전을 비교하고 동일하다면 index +1 버전을 확인하는데
    //이때 모두 있다면 비교하고, 한 쪽이 없다면 없는 쪽이 먼저 나온 버전이다
    fun compareVersion(version1: String, version2: String): Int {
        val version = Version.fromString(version1)
        val otherVersion = Version.fromString(version2)

        return version.compareTo(otherVersion)
    }
}

data class Version(
    private val revisions: List<BigInteger>,
) : Comparable<Version> {
    companion object {
        fun fromString(versionString: String): Version {
            return Version(versionString.split(".").map { it.toBigInteger() })
        }
    }

    override fun compareTo(other: Version): Int {
        val otherRevision = other.revisions
        val lastRevisionLevel = this.revisions.lastIndex
        val otherLastRevisionLevel = otherRevision.lastIndex

        revisions.forEachIndexed { level, revision ->
            if (revision == otherRevision[level]) {
                if (lastRevisionLevel == otherLastRevisionLevel) {
                    return@forEachIndexed
                }

                if (level == lastRevisionLevel || level == otherLastRevisionLevel) {
                    val nextRevision = revisions.getOrElse(level + 1) { BigInteger("0") }
                    val otherNextRevision = otherRevision.getOrElse(level + 1) { BigInteger("0") }

                    return nextRevision.compareTo(otherNextRevision)
                }

                return@forEachIndexed
            }

            return revision.compareTo(otherRevision[level])
        }

        return 0
    }
}

