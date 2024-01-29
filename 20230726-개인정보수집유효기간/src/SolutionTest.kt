import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.time.LocalDate

class SolutionTest {

    @Test
    fun solution() {
        val solution = Solution()
        val today = "2022.05.19"
        val terms = arrayOf("A 6", "B 12", "C 3")
        val privacies = arrayOf("2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C")

        val result = solution.solution(today, terms, privacies)

        assertArrayEquals(intArrayOf(1, 3), result)
    }

    @Test
    fun solution2() {
        val solution = Solution()
        val today = "2020.01.01"
        val terms = arrayOf("Z 3", "D 5")
        val privacies = arrayOf("2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z")

        val result = solution.solution(today, terms, privacies)

        assertArrayEquals(intArrayOf(1, 4, 5), result)
    }


}
