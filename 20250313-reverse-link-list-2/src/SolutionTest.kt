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

        assertEquals(
            ListNode(1).apply {
                next = ListNode(4).apply {
                    next = ListNode(3).apply {
                        next = ListNode(2).apply {
                            next = ListNode(5)
                        }
                    }
                }
            }, result
        )
    }


    @Test
    fun reverseBetween_2() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val result = solution.reverseBetween(linkedList, 1, 5)

        assertEquals(
            ListNode(5).apply {
                next = ListNode(4).apply {
                    next = ListNode(3).apply {
                        next = ListNode(2).apply {
                            next = ListNode(1)
                        }
                    }
                }
            }, result
        )
    }

    @Test
    fun reverseBetween_3() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val result = solution.reverseBetween(linkedList, 1, 1)

        assertEquals(
            ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4).apply {
                            next = ListNode(5)
                        }
                    }
                }
            }, result
        )
    }


    @Test
    fun reverseBetween_4() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5).apply {
                            next = ListNode(7)
                        }
                    }
                }
            }
        }

        val result = solution.reverseBetween(linkedList, 3, 5)

        assertEquals(
            ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(5).apply {
                        next = ListNode(4).apply {
                            next = ListNode(3).apply {
                                next = ListNode(7)
                            }
                        }
                    }
                }
            }, result
        )
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

        val (head, last) = solution.moveToStart(linkedList, 2)

        assertEquals(ListNode(1), head)
        assertEquals(
            ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            },
            last
        )
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

        val (head, last) = solution.moveToStart(linkedList, 3)

        assertEquals(ListNode(1).apply {
            next = ListNode(2)
        }, head)
        assertEquals(
            ListNode(3).apply {
                next = ListNode(4).apply {
                    next = ListNode(5)
                }
            },
            last
        )
    }

    @Test
    fun reverseToEnd() {
        val linkedList = ListNode(2).apply {
            next = ListNode(3).apply {
                next = ListNode(4).apply {
                    next = ListNode(5)
                }
            }
        }

        val reversed = solution.reverseToEnd(linkedList, 2, 4)

        assertEquals(
            ListNode(4).apply {
                next = ListNode(3).apply {
                    next = ListNode(2).apply {
                        next = ListNode(5)
                    }
                }
            }, reversed
        )
    }
}
