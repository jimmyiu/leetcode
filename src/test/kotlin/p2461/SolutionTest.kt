package p2461

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
  @Test
  fun test() {
    val solution = p2461.Solution()
    val actual = solution.maximumSubarraySum(
      intArrayOf(1, 5, 4, 2, 9, 9, 9),
      3
    )
    assertThat(actual).isEqualTo(15)
  }
}
