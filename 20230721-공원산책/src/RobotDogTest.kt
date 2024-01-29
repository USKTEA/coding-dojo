import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RobotDogTest {
    private val park = arrayOf("SOO", "OOO", "OOO")

    private val parkHasObstacle1 = arrayOf("XSX", "OOO", "OOO")
    private val parkHasObstacle2 = arrayOf("OOO", "OXO", "OSO", "OXO", "OXO")
    private val routes = arrayOf("E 2", "S 2", "W 1")

    @Test
    fun creation() {
        val robotDog = RobotDog(park)

        assertArrayEquals(intArrayOf(0, 0), robotDog.location())
    }

    @Test
    fun `로봇개의 X좌표가 0보다 작아질 경우 로봇개는 명령을 무시한다`() {
        val robotDog = RobotDog(park)

        robotDog.execute(arrayOf("N 1"))

        assertArrayEquals(intArrayOf(0, 0), robotDog.location())
    }

    @Test
    fun `로봇개의 X좌표가 park 세로길이 보다 커질 경우 로봇개는 명령을 무시한다`() {
        val robotDog = RobotDog(park)

        robotDog.execute(arrayOf("S 3"))

        assertArrayEquals(intArrayOf(0, 0), robotDog.location())
    }

    @Test
    fun `로봇개의 Y좌표가 0보다 작아질 경우 로봇개는 명령을 무시한다`() {
        val robotDog = RobotDog(park)

        robotDog.execute(arrayOf("W 1"))

        assertArrayEquals(intArrayOf(0, 0), robotDog.location())
    }

    @Test
    fun `로봇개의 Y좌표가 park의 가로 길이보다 커질 경우 로봇개는 명령을 무시한다`() {
        val robotDog = RobotDog(park)

        robotDog.execute(arrayOf("E 3"))

        assertArrayEquals(intArrayOf(0, 0), robotDog.location())
    }

    @Test
    fun `장애물 없는 3개 명령`() {
        val robotDog = RobotDog(park)

        robotDog.execute(routes)

        assertArrayEquals(intArrayOf(2, 1), robotDog.location())
    }

    @Test
    fun `우측 경로에 장애물이 있을 경우`() {
        val robotDog = RobotDog(parkHasObstacle1)

        robotDog.execute(arrayOf("E 1"))

        assertArrayEquals(intArrayOf(0, 1), robotDog.location())
    }

    @Test
    fun `좌측 경로에 장애물이 있을 경우`() {
        val robotDog = RobotDog(parkHasObstacle1)

        robotDog.execute(arrayOf("W 1"))

        assertArrayEquals(intArrayOf(0, 1), robotDog.location())
    }

    @Test
    fun `윗측 경로에 장애물이 있을 경우`() {
        val robotDog = RobotDog(parkHasObstacle2)
        robotDog.execute(arrayOf("N 1"))

        assertArrayEquals(intArrayOf(2, 1), robotDog.location())
    }

    @Test
    fun `아랫측 경로에 장애물이 있을 경우`() {
        val robotDog = RobotDog(parkHasObstacle2)
        robotDog.execute(arrayOf("S 1"))

        assertArrayEquals(intArrayOf(2, 1), robotDog.location())
    }

    @Test
    fun `park가 정사각형이 경우`() {
        val park2 = arrayOf("OSO","OOO","OXO","OOO")
        val robotDog = RobotDog(park2)

        robotDog.execute(arrayOf("E 2","S 3","W 1"))

        assertArrayEquals(intArrayOf(0, 0), robotDog.location())
    }
}
