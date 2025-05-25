import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun reverseBetween() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val result = solution.reverseBetween(linkedList, 2, 4)

        assertEquals(ListNode(1).apply {
            next = ListNode(4).apply {
                next = ListNode(3).apply {
                    next = ListNode(2).apply {
                        next = ListNode(5)
                    }
                }
            }
        }, result)
    }

    @Test
    fun reverseBetween_2() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3)
            }
        }

        val result = solution.reverseBetween(linkedList, 1, 2)

        assertEquals(ListNode(2).apply {
            next = ListNode(1).apply {
                next = ListNode(3).apply {
                }
            }
        }, result)
    }

    @Test
    fun reverseBetween_3() {
        val linkedList = ListNode(1)

        val result = solution.reverseBetween(linkedList, 1, 1)

        assertEquals(ListNode(1), result)
    }

    @Test
    fun moveToStart() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val (head, tail, last) = solution.moveToStart(linkedList, 2)

        assertEquals(ListNode(1), head)
        assertEquals(ListNode(1), tail)
        assertEquals(ListNode(2).apply {
            next = ListNode(3).apply {
                next = ListNode(4).apply {
                    next = ListNode(5)
                }
            }
        }, last)
    }

    @Test
    fun moveToStart_2() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val (head, tail, last) = solution.moveToStart(linkedList, 3)

        assertEquals(ListNode(1).apply { next = ListNode(2) }, head)
        assertEquals(ListNode(2), tail)
        assertEquals(ListNode(3).apply {
            next = ListNode(4).apply {
                next = ListNode(5)
            }
        }, last)
    }

    @Test
    fun moveToStart_3() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val (head, tail, last) = solution.moveToStart(linkedList, 1)

        assertEquals(null, head)
        assertEquals(null, tail?.next)
        assertEquals(ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }, last)
    }

    @Test
    fun reverseUntil() {
        val linkedList = ListNode(2).apply {
            next = ListNode(3).apply {
                next = ListNode(4).apply {
                    next = ListNode(5)
                }
            }
        }

        val result = solution.reverseUntil(linkedList, 2)

        assertEquals(ListNode(4).apply {
            next = ListNode(3).apply {
                next = ListNode(2).apply {
                    next = ListNode(5)
                }
            }
        }, result)
    }
}
