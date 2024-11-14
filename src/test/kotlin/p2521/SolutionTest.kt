package p2521

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
  @Test
  fun test() {
    val solution = p2521.Solution()
    val actual = solution.distinctPrimeFactors(
      intArrayOf(2, 4, 3, 7, 10, 6)
    );
    assertThat(actual).isEqualTo(4);
  }
  @Test
  fun test2() {
    val solution = p2521.Solution()
    val actual = solution.distinctPrimeFactors(
      intArrayOf(2, 4, 8, 16)
    );
    assertThat(actual).isEqualTo(1);
  }
}