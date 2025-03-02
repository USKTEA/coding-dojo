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
                next = ListNode(3)
            }
        }

        val result = solution.reverseBetween(linkedList, 1, 2)

        assertEquals(
            ListNode(2).apply {
                next = ListNode(1).apply {
                    next = ListNode(3)
                }
            }, result
        )
    }

    @Test
    fun reverseBetween_3() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3)
            }
        }

        val result = solution.reverseBetween(linkedList, 1, 2)

        assertEquals(
            ListNode(2).apply {
                next = ListNode(1).apply {
                    next = ListNode(3)
                }
            }, result
        )
    }

    @Test
    fun reverseBetween_4() {
        val linkedList = ListNode(97).apply {
            next = ListNode(63).apply {
                next = ListNode(89).apply {
                    next = ListNode(34).apply {
                        next = ListNode(82).apply {
                            next = ListNode(95).apply {
                                next = ListNode(4).apply {
                                    next = ListNode(70).apply {
                                        next = ListNode(14).apply {
                                            next = ListNode(41).apply {
                                                next = ListNode(38).apply {
                                                    next = ListNode(83).apply {
                                                        next = ListNode(49).apply {
                                                            next = ListNode(32).apply {
                                                                next = ListNode(68).apply {
                                                                    next = ListNode(56).apply {
                                                                        next = ListNode(99).apply {
                                                                            next = ListNode(52).apply {
                                                                                next = ListNode(33).apply {
                                                                                    next = ListNode(54)
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        val result = solution.reverseBetween(linkedList, 13, 15)

        val expected = ListNode(97).apply {
            next = ListNode(63).apply {
                next = ListNode(89).apply {
                    next = ListNode(34).apply {
                        next = ListNode(82).apply {
                            next = ListNode(95).apply {
                                next = ListNode(4).apply {
                                    next = ListNode(70).apply {
                                        next = ListNode(14).apply {
                                            next = ListNode(41).apply {
                                                next = ListNode(38).apply {
                                                    next = ListNode(83).apply {
                                                        next = ListNode(68).apply { // 변경됨 (원래 49)
                                                            next = ListNode(32).apply { // 변경됨 (원래 32)
                                                                next = ListNode(49).apply { // 변경됨 (원래 68)
                                                                    next = ListNode(56).apply {
                                                                        next = ListNode(99).apply {
                                                                            next = ListNode(52).apply {
                                                                                next = ListNode(33).apply {
                                                                                    next = ListNode(54)
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        assertEquals(result, expected)
    }

    @Test
    fun slice() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val sliced = solution.slice(linkedList, 2)

        assertEquals(
            Triple(
                ListNode(1),
                ListNode(1),
                ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4).apply {
                            next = ListNode(5)
                        }
                    }
                }
            ), sliced)
    }
}
