import java.math.BigInteger

class Solution {
    fun compareVersion(version1: String, version2: String): Int {
        val version = Version.fromString(version1)
        val otherVersion = Version.fromString(version2)

        return version.compareTo(otherVersion)
    }
}

data class Version(
    val revisionLevels: List<BigInteger>,
) : Comparable<Version> {
    override fun compareTo(other: Version): Int {
        val revisionLevelsLastIndex = this.revisionLevels.lastIndex
        val otherRevisionLevelsLastIndex = other.revisionLevels.lastIndex
        var currentIndex = 0
        var otherCurrentIndex = 0

        while (currentIndex <= revisionLevelsLastIndex && otherCurrentIndex <= otherRevisionLevelsLastIndex) {
            val currentRevisionLevel = this.revisionLevels[currentIndex]
            val otherCurrentRevisionLevel = other.revisionLevels[otherCurrentIndex]

            if (currentRevisionLevel == otherCurrentRevisionLevel) {
                currentIndex += 1
                otherCurrentIndex += 1

                continue
            }

            if (currentRevisionLevel > otherCurrentRevisionLevel) {
                return 1
            }

            return -1
        }

        if (currentIndex > revisionLevelsLastIndex && otherCurrentIndex > otherRevisionLevelsLastIndex) {
            return 0
        }

        if (currentIndex < revisionLevelsLastIndex) {
            return 1
        }

        return -1
    }

    companion object {
        fun fromString(version: String): Version {
            var revisionLevels = version.split(".").map { BigInteger(it) }

            while (revisionLevels.last() == BigInteger.ZERO) {
                revisionLevels = revisionLevels.dropLast(1)
            }

            return Version(
                revisionLevels = revisionLevels
            )
        }
    }
}
