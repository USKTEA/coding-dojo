import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun addTwoNumbers() {
        val number = ListNode(2).apply {
            next = ListNode(4).apply {
                next = ListNode(3)
            }
        }

        val otherNumber = ListNode(5).apply {
            next = ListNode(6).apply {
                next = ListNode(4)
            }
        }

        val result = solution.addTwoNumbers(number, otherNumber)

        assertEquals(
            ListNode(7).apply {
                next = ListNode(0).apply {
                    next = ListNode(8)
                }
            }, result
        )
    }

    @Test
    fun add_1() {
        val result = ListNode(0)
        val number = ListNode(1)
        val otherNumber = ListNode(2)

        solution.add(result, number, otherNumber)

        assertEquals(ListNode(3).apply {
            next = ListNode(0)
        }, result)
    }

    @Test
    fun add_2() {
        val result = ListNode(0)
        val number = ListNode(1)
        val otherNumber = ListNode(9)

        solution.add(result, number, otherNumber)

        assertEquals(ListNode(0).apply {
            next = ListNode(1)
        }, result)
    }

    @Test
    fun add_3() {
        val result = ListNode(0)
        val number = ListNode(2)
        val otherNumber = ListNode(9)

        solution.add(result, number, otherNumber)

        assertEquals(ListNode(1).apply {
            next = ListNode(1)
        }, result)
    }

    @Test
    fun add_4() {
        val result = ListNode(0)
        val number = ListNode(2).apply {
            next = ListNode(1)
        }
        val otherNumber = ListNode(3)

        solution.add(result, number, otherNumber)

        assertEquals(ListNode(5).apply {
            next = ListNode(1)
        }, result)
    }

    @Test
    fun add_6() {
        val result = ListNode(0)
        val number = ListNode(2).apply {
            next = ListNode(1)
        }
        val otherNumber = ListNode(8)

        solution.add(result, number, otherNumber)

        assertEquals(ListNode(0).apply {
            next = ListNode(2)
        }, result)
    }

    @Test
    fun add_7() {
        val result = ListNode(0)
        val number = ListNode(2)
        val otherNumber = ListNode(8).apply {
            next = ListNode(2)
        }

        solution.add(result, number, otherNumber)

        assertEquals(ListNode(0).apply {
            next = ListNode(3)
        }, result)
    }

    @Test
    fun add_8() {
        val result = ListNode(0)
        val number = ListNode(2).apply {
            next = ListNode(8)
        }
        val otherNumber = ListNode(8).apply {
            next = ListNode(2)
        }

        solution.add(result, number, otherNumber)

        assertEquals(ListNode(0).apply {
            next = ListNode(1).apply {
                next = ListNode(1)
            }
        }, result)
    }

    @Test
    fun add_9() {
        val result = ListNode(0)
        val number = ListNode(2).apply {
            next = ListNode(8)
        }
        val otherNumber = ListNode(8).apply {
            next = ListNode(2).apply {
                next = ListNode(1).apply {
                    next = ListNode(0).apply {
                        next = ListNode(1)
                    }
                }
            }
        }

        solution.add(result, number, otherNumber)

        assertEquals(ListNode(0).apply {
            next = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(0).apply {
                        next = ListNode(1)
                    }
                }
            }
        }, result)
    }

    @Test
    fun removeTrailingZeros() {
        val listNode = ListNode(0).apply {
            next = ListNode(0).apply {
                next = ListNode(1).apply {
                    next = ListNode(0)
                }
            }
        }

        solution.removeTrailingZeros(listNode)

        assertEquals(
            ListNode(0).apply {
                next = ListNode(0).apply {
                    next = ListNode(1)
                }
            }, listNode)
    }
}
