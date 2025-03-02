import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val linkedList = ListNode(3).apply {
            next = ListNode(4).apply {
                next = ListNode(7).apply {
                    next = ListNode(5).apply {
                        next = ListNode(6).apply {
                            next = ListNode(16).apply {
                                next = ListNode(15).apply {
                                    next = ListNode(61).apply {
                                        next = ListNode(16)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        val result = solution.solve(linkedList, 3)

        assertEquals(4, result)
    }

    @Test
    fun solve_2() {
        val linkedList = ListNode(3).apply {
            next = ListNode(4).apply {
                next = ListNode(7).apply {
                    next = ListNode(5).apply {
                        next = ListNode(6).apply {
                            next = ListNode(16).apply {
                                next = ListNode(15).apply {
                                    next = ListNode(61).apply {
                                        next = ListNode(16)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        val result = solution.solve(linkedList, 100)

        assertEquals(-1, result)
    }

    @Test
    fun solve_3() {
        val linkedList = ListNode(1).apply {
            next = ListNode(14).apply {
                next = ListNode(6).apply {
                    next = ListNode(16).apply {
                        next = ListNode(4).apply {
                            next = ListNode(10)
                        }
                    }
                }
            }
        }
        val result = solution.solve(linkedList, 10)

        assertEquals(-1, result)
    }

    @Test
    fun solve_4() {
        val linkedList = ListNode(1).apply {
            next = ListNode(14).apply {
                next = ListNode(6).apply {
                    next = ListNode(16).apply {
                        next = ListNode(4).apply {
                            next = ListNode(10)
                        }
                    }
                }
            }
        }
        val result = solution.solve(linkedList, 2)

        assertEquals(14, result)
    }

    @Test
    fun solve_5() {
        val linkedList = ListNode(1)
        val result = solution.solve(linkedList, 1)

        assertEquals(-1, result)
    }

    @Test
    fun getMiddlePair() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4)
                }
            }
        }

        val middle = solution.getMiddle(linkedList)
        assertEquals(3, middle)
    }

    @Test
    fun getMiddleSingle() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5).apply {
                            next = ListNode(6).apply {
                                next = ListNode(7)
                            }
                        }
                    }
                }
            }
        }

        val middle = solution.getMiddle(linkedList)

        assertEquals(4, middle)
    }
}
