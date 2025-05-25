import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5).apply {
                            next = ListNode(6)
                        }
                    }
                }
            }
        }

        val result = solution.solve(linkedList, 2)

        assertEquals(
            ListNode(2).apply {
                next = ListNode(1).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4).apply {
                            next = ListNode(6).apply {
                                next = ListNode(5)
                            }
                        }
                    }
                }
            }, result
        )
    }

    @Test
    fun split() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5).apply {
                            next = ListNode(6)
                        }
                    }
                }
            }
        }

        val (odds, evens) = solution.split(linkedList, 2)

        assertEquals(
            ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(5).apply {
                        next = ListNode(6).apply {}
                    }
                }
            }, odds
        )

        assertEquals(
            ListNode(3).apply {
                next = ListNode(4)
            }, evens
        )
    }

    @Test
    fun split_2() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5).apply {
                            next = ListNode(6)
                        }
                    }
                }
            }
        }

        val (odds, evens) = solution.split(linkedList, 3)

        assertEquals(
            ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3)
                }
            }, odds
        )

        assertEquals(
            ListNode(4).apply {
                next = ListNode(5).apply {
                    next = ListNode(6)
                }
            }, evens
        )
    }

    @Test
    fun reverse() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4)
                }
            }
        }

        val result = solution.reverse(linkedList, 2)

        assertEquals(
            ListNode(2).apply {
                next = ListNode(1).apply {
                    next = ListNode(4).apply {
                        next = ListNode(3)
                    }
                }
            }
            , result)
    }
}
