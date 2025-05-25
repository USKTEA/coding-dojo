import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun reorderList() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4)
                }
            }
        }

        val result = solution.reorderList(linkedList)

        assertEquals(
            ListNode(1).apply {
                next = ListNode(4).apply {
                    next = ListNode(2).apply {
                        next = ListNode(3)
                    }
                }
            }, result
        )
    }

    @Test
    fun reorderList_2() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val result = solution.reorderList(linkedList)

        assertEquals(
            ListNode(1).apply {
                next = ListNode(5).apply {
                    next = ListNode(2).apply {
                        next = ListNode(4).apply {
                            next = ListNode(3)
                        }
                    }
                }
            }, result
        )
    }

    @Test
    fun split_even() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4)
                }
            }
        }

        val (head, tail) = solution.split(linkedList)

        assertEquals(ListNode(1).apply {
            next = ListNode(2)
        }, head)

        assertEquals(ListNode(4).apply {
            next = ListNode(3)
        }, tail)
    }

    @Test
    fun split_odd() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val (head, tail) = solution.split(linkedList)

        assertEquals(ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3)
            }
        }, head)

        assertEquals(ListNode(5).apply {
            next = ListNode(4)
        }, tail)
    }

    @Test
    fun getHeadAndTail_even() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4)
                }
            }
        }

        val (head, tail) = solution.getHeadAndTail(linkedList, 4)

        assertEquals(
            ListNode(1).apply {
                next = ListNode(2)
            }, head
        )

        assertEquals(
            ListNode(3).apply {
                next = ListNode(4)
            }, tail
        )
    }

    @Test
    fun getHeadAndTail_even_2() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2)
        }

        val (head, tail) = solution.getHeadAndTail(linkedList, 2)

        assertEquals(
            ListNode(1), head
        )

        assertEquals(
            ListNode(2), tail
        )
    }

    @Test
    fun getHeadAndTail_odd() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3)
            }
        }

        val (head, tail) = solution.getHeadAndTail(linkedList, 3)

        assertEquals(
            ListNode(1).apply {
                next = ListNode(2)
            }, head
        )

        assertEquals(
            ListNode(3), tail
        )
    }


    @Test
    fun getHeadAndTail_odd_2() {
        val linkedList = ListNode(1)

        val (head, tail) = solution.getHeadAndTail(linkedList, 1)

        assertEquals(
            ListNode(1), head
        )

        assertEquals(
            null, tail
        )
    }

    @Test
    fun reverse() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2)
        }

        val reversed = solution.reverse(linkedList)

        assertEquals(
            ListNode(2).apply {
                next = ListNode(1)
            }
            , reversed)
    }
}
