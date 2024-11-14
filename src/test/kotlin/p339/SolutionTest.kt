package p339

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun test() {
    val actual = findKthLargest(
      nums = arrayOf(3, 2, 1, 5, 6, 4),
      2
    )
    assertThat(actual).isEqualTo(5)
  }

  private fun findKthLargest(nums: Array<Int>, k: Int): Int {
    var solution = p215.Solution()
    return solution.findKthLargest(nums.toIntArray(), k)
  }
}