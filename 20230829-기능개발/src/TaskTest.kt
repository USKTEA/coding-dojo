import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TaskTest {
    @Test
    fun `work가 호출되면 speed만큼 progress에 추가된다`() {
        val task = Task(progress = 10, speed = 10)

        task.work()

        assertEquals(20, task)
    }

    @Test
    fun `work의 progress는 최대 100이다`() {
        val task = Task(progress = 10, speed = 100)

        task.work()

        assertEquals(100, task.progress)
    }

    @Test
    fun `progress가 100인 task의 completed는 true가 된다`() {
        val task = Task(progress = 10, speed = 100)

        assertFalse(task.completed)

        task.work()

        assertTrue(task.completed)
    }


}
