import java.math.BigInteger

class CompareVersionNumber {
    fun compareVersion(version1: String, version2: String): Int {
        val version = Version.fromString(version1)
        val otherVersion = Version.fromString(version2)

        return version.compareTo(otherVersion)
    }
}

data class Version(
    val numbers: List<BigInteger>
) : Comparable<Version> {
    override fun compareTo(other: Version): Int {
        var versionNumberIndex = 0

        while (versionNumberIndex <= numbers.lastIndex || versionNumberIndex <= other.numbers.lastIndex) {
            val versionNumber = numbers.getOrElse(versionNumberIndex) { BigInteger("0") }
            val otherVersionNumber = other.numbers.getOrElse(versionNumberIndex) { BigInteger("0") }

            if (versionNumber == otherVersionNumber) {
                versionNumberIndex += 1

                continue
            }

            if (versionNumber != otherVersionNumber) {
                return versionNumber.compareTo(otherVersionNumber)
            }
        }

        return 0
    }

    companion object {
        fun fromString(version: String): Version {
            return Version(version.split(".").map { BigInteger(it) })
        }
    }
}
