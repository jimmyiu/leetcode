package p141

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun `test case 2, 1 - 2 - 1`() {
    val node1 = Solution.ListNode(2)
    val node2 = Solution.ListNode(1)
    node2.next = node1
    node1.next = node2
    // when
    val actual = Solution.hasCycle(node1)
    // then
    assertThat(actual).isTrue()
  }
  @Test
  fun `test case 3, head has no next`() {
    val node = Solution.ListNode(1)
    // when
    val actual = Solution.hasCycle(node)
    // then
    assertThat(actual).isFalse()
  }
  @Test
  fun `map test`() {
    val map = listOf(1,2,3,4,5,6,1,1)
  }
}