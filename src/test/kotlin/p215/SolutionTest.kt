package p215

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
  @Test
  fun `test 2`() {
    val actual = findKthLargest(
      nums = arrayOf(1, 2, 3, 4, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, -5, -4, -3, -2, -1),
      10
    )
    assertThat(actual).isEqualTo(1)
  }
  @Test
  fun `test 3`() {
    val actual = findKthLargest(
      nums = arrayOf(7, 6, 5, 4, 3, 2, 1),
      2
    )
    assertThat(actual).isEqualTo(6)
  }
  @Test
  fun `test 4`() {
    val actual = findKthLargest(
      nums = arrayOf(-1, 2, 0),
      2
    )
    assertThat(actual).isEqualTo(0)
  }
  @Test
  fun `test 5`() {
    val actual = findKthLargest(
      nums = arrayOf(5, 2, 4, 1, 3, 6, 0),
      4
    )
    assertThat(actual).isEqualTo(3)
  }

  @Test
  fun `test 6`() {
    val actual = findKthLargest(
      nums = arrayOf(4, 2, 3, 6, 5),
      // 3, 2, 4, 6, 5
      // L  H
      4
    )
    assertThat(actual).isEqualTo(3)
  }

  private fun findKthLargest(nums: Array<Int>, k: Int): Int {
    var solution = p215.Solution()
    return solution.findKthLargest(nums.toIntArray(), k)
  }
}